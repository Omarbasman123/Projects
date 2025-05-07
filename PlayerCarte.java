/*
*Nom d'etudiant :  OMAR BASMAN ALMOGHLY 
*Numero d'etudiant : 300406240
*Code du cours : ITI1521  
 */



/**
 *The Player class should be able to represent the set of cards a player has in hand.
 * The player class must allow to take a card from the deck and put it in the hand, 
 * count the points of the cards in hand...
 **/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PlayerCarte {
     private ArrayList<Card>  hand;   // The cards in the plyaer's hand.
 
     /*Constructor*/
 Player(){
       this.hand = new ArrayList<Card>();
    }  
 
 /*Accessor*/
 public ArrayList<Card> getHand() {
        return hand;
    }
 
 /**
     * Remove all cards from the hand, leaving it empty.
  */
    public void clear() {
       hand.clear();
    }

    /**
     * Add a card to the hand.  It is added at the end of the current hand.
     * @param card the non-null card to be added.
     * @throws NullPointerException if the parameter card is null.
     */
    public void add(Card card) {
        if (card == null) {
            throw new NullPointerException("La carte ne peut pas Ãªtre nulle");
        }
        hand.add(card); 
    }

    /**
     * Remove a card from the hand, if present.
     * @param card the card to be removed.  If card is null or if the card is not in 
     * the hand, then nothing is done.
     */
    public void remove(Card card) {
        if (card == null) {
            System.out.println("la carte est null");
            return;
        }
        // VÃ©rifier si la carte est prÃ©sente dans la main
        if (hand.contains(card)) {
            hand.remove(card);  
        } else {
            System.out.println("la carte n'existe pas sur la main");
        }
    }

    /**
     * Remove the card in a specified position from the hand.
     * @param position the position of the card that is to be removed, where
     * positions are numbered starting from zero.
     * @throws IllegalArgumentException if the position does not exist in
     * the hand, that is if the position is less than 0 or greater than
     * or equal to the number of cards in the hand.
     */
    public void remove(int position) {
        // VÃ©rifier si la position est valide
        if (position < 0 || position >= hand.size()) {
            throw new IllegalArgumentException("Position is out of bounds.");
        }
        hand.remove(position);
    }

    /**
     * Returns the number of cards in the hand.
     */
    public int totalCards() {
        return hand.size();
    }

    /**
     * Gets the card in a specified position in the hand.  (Note that this card
     * is not removed from the hand!)
     * @param position the position of the card that is to be returned
     * @throws IllegalArgumentException if position does not exist in the hand
     */
    public Card getCard(int position) {
        // VÃ©rifie si la position est valide
        if (position < 0 || position >= hand.size()) {
            throw new IllegalArgumentException("Position does not exist in the hand.");
        }
        return hand.get(position);
    }

   /**
     * Computes and returns the total value of this hand in the game
     */
    public int getHandTotal () {

        int total = 0;
        int aces = 0;  // Compter le nombre d'As dans la main

        // Parcours des cartes dans la main
        for (Card card : hand) {
            int cardValue = card.getValue();

            if (cardValue > 10) {
                total += 10;  // Carte Valet, Dame ou Roi comptÃ©e comme 10
            } else if (cardValue == 1) {
                aces++;  // Compte les As pour un traitement spÃ©cial
                total += 1;  // Compte temporairement l'As comme 1
            } else {
                total += cardValue;  // Autres cartes, ajout de leur valeur
            }
        }

        // Gestion des As, les traiter comme 11 si possible (sans dÃ©passer 21)
        for (int i = 0; i < aces; i++) {
            if (total + 10 <= 21) {
                total += 10;  // Compte chaque As restant comme 11 si possible
            }
        }

        return total;  // Retourne la somme totale des cartes

    }  
    
    /**
     * Sorts the cards in the hand so that cards of the same color are
     * grouped together, and within a color the cards are sorted by value.
     * Note that aces are considered to have the lowest value, 1.
     */
    public void sortByColor() {
        // Trie les cartes d'abord par couleur, puis par valeur Ã  l'intÃ©rieur de chaque couleur.
        Collections.sort(hand, new Comparator<Card>() {
            @Override
            public int compare(Card card1, Card card2) {
                // Comparer d'abord par couleur
                int colorComparison = Integer.compare(card1.getColor(), card2.getColor());
                if (colorComparison != 0) {
                    return colorComparison;
                }
                // Si les couleurs sont identiques, trier par valeur
                return Integer.compare(card1.getValue(), card2.getValue());
            }
        });
    }

    /**
     * Sorts the cards in the hand so that cards of the same value are
     * grouped together. Cards with the same value are sorted by color.
     * Note that aces are considered to have the lowest value, 1.
     */
    public void sortByValue() {
        // Trie les cartes d'abord par valeur, puis par couleur Ã  l'intÃ©rieur de chaque valeur.
        Collections.sort(hand, new Comparator<Card>() {
            @Override
            public int compare(Card card1, Card card2) {
                // Comparer d'abord par valeur
                int valueComparison = Integer.compare(card1.getValue(), card2.getValue());
                if (valueComparison != 0) {
                    return valueComparison;
                }
                // Si les valeurs sont identiques, trier par couleur
                return Integer.compare(card1.getColor(), card2.getColor());
            }
        });
    }
}
