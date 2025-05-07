/*
*Nom d'etudiant : TAHA KADI, OMAR BASMAN ALMOGHLY 
*Numero d'etudiant : 300342384 , 300406240
*Code du cours : ITI1521  
 */


 import java.util.Random;

 /**
  *  Deck represents a deck of playing cards and contains 52 regular cards.
  */
 public class Deck {
 
     private Card[] deck;  // an array of 52 cards.  
     private int number;  //the number of cards that have been dealt from the deck
 
     /**
      * Constructs a regular 52-card poker deck.  Initially, the cards
      * are in a sorted order.  
      */
     public Deck() {
         this.number=52;
         this.deck = new Card[number];
 
         // CrÃ©er les 52 cartes avec des valeurs de 1 Ã  13 pour chaque couleur (4 couleurs)
         int index = 0;
         for (int color = 0; color < 4; color++) {
             for (int value = 1; value <= 13; value++) {
                 deck[index] = new Card(value, color);
                 index++;
             }
         }
  }
 
 
     /**
      * Put all the used cards back into the deck (if any), and
      * shuffle the deck into a random order.
      */
     public void shuffle() {
             // Remettre toutes les cartes utilisÃ©es dans le paquet
             if (number < 52) {
             number = 52;
             // Reconstituer le deck avec les cartes restantes
             int index = 0;
             for (int color = 0; color < 4; color++) {
                 for (int value = 1; value <= 13; value++) {
                     // VÃ©rifier si la carte Ã  cette position a Ã©tÃ© prise
                     if (deck[index] == null) {
                         deck[index] = new Card(value, color);  // Remettre la carte dans le deck
                     }
                     index++;
                 }
             }
         }
 
         // MÃ©langer le deck dans un ordre alÃ©atoire
         Random rand = new Random();  
         for (int i = 0; i < number; i++) {
             int j = rand.nextInt(number);  // GÃ©nÃ¨re un indice alÃ©atoire entre 0 et (number-1)
             Card temp = deck[i];
             deck[i] = deck[j];
             deck[j] = temp;
         }
     }
 
     /**
      * Returns the number of cards left in the deck.  
      */
     public int numberLeft() {
         return number;
     }
 
     /**
      * Removes the next card from the deck and return it.  It is illegal
      * to call this method if there are no more cards in the deck.  You can
      * check the number of cards remaining by calling the numberLeft() function.
      * @return the card which is removed from the deck.
      * @throws IllegalStateException if there are no cards left in the deck
      */
     public Card take() {
         // VÃ©rifier s'il reste des cartes dans le deck
         if (number == 0) {
             throw new IllegalStateException("Il n'y a plus de cartes dans le deck.");
         }
 
         // La prochaine carte Ã  prendre est la premiÃ¨re carte disponible
         Card cardToReturn = deck[52 - number];  
         deck[52 - number] = null;  
         number--;  
 
       
         return cardToReturn;
     }
 } // end class Deck
