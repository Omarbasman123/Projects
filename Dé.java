// Nom : Omar Basman 
// Numero d'etudiant : 300406240

package Devoir1_300406240.d1q5;

public class Dé {
     
    private int value;   // Numro figurant sur le dé. 

    /**
     * Le constructeur crée un dé et le lance de sorte qu'il
      * montre initialement une valeur aléatoire entre 1 et 6. 
     */
    public Dé() {
        value=1; // Lance le dé pour initialiser avec une valeur aléatoire.
    } // J'ai remplie la partie vide 
    
    
    /**
     * Lancez le dé pour qu'il indique un nombre aléatoire entre 1 et 6. 
     */
    public void lancer() {
        this.value = (int)(Math.random() * 6) + 1; // Choisir un nombre aléatoire entre 1 et 6. 
    } // J'ai remplie la partie vide 
            
    /**
     * Renvoie le nombre indiqué sur le dé. 
     */ 
    public int getValue() {
       return value;
    }
    
    /**
     * Définit la valeur du dé. Imprime Valeur iIllégale du dé
      * si la valeur n'est pas comprise entre 1 et 6. 
     */
    public void setValue( int val ) {
        if (val >= 1 && val <= 6) {
            value = val;
        } else {
            System.out.println("Valeur illégale du dé " + val);
        }
    } // J'ai remplie la partie vide 
    
    

 
//Programme principal main
  
 /** 
  * lancer deux dés jusqu'ä ce qu'ils indiquent la meme valeur 
  * et afficher le nombre de fois que ces dés ont été lancés. 
  */

    public static void main(String[] args) {
       
       Dé dé1 = new Dé();  // 1er dé
       Dé dé2 = new Dé();  // 2eme dé
       
       int count = 0; // Compteur de lancers // J'ai remplie la partie vide 
       
       /*Affiche le nombre de lancés. */
       // Lancer les deux dés jusqu'à ce qu'ils aient la même valeur
    do {
        dé1.lancer();
        dé2.lancer();
       
        count++;
    } while (dé1.getValue() != dé2.getValue());
    
      //VOTRE lIGNE D'AFFICHAGE
      // Afficher le nombre de lancers
      System.out.println("Ça a pris " + count + " lancés pour que les deux dés indiquent la même valeur :");
      System.out.println(dé1.getValue());
      System.out.println(dé2.getValue());
      System.out.println();
      
      System.out.println(dé1.getValue());
      System.out.println(dé2.getValue());
      System.out.println();
       
      /* générer une exception. */
       System.out.println("Ce programme va maintenant se terminer avec un message d'erreur ");
       System.out.println("lorsqu'il essaie de fixer la valeur d'un dé à 100. ");
       Dé dé;  // variable referant au dé.
       dé = new Dé();  // creer l'objet
       dé.setValue(100);
      }
    
 }  // end class Dé
