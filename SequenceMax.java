// Nom : Omar Basman 
// Numero d'etudiant : 300406240

package Devoir1_300406240.d1q1;

public class SequenceMax {

    // Fonction pour trouver la longueur de la plus longue séquence d'éléments consécutifs égaux
    public static int sequenceMax(int[] x) {
        if (x == null || x.length == 0) {
            return 1; // retourne 1 par défaut
        }

        int maxSequence = 1; // Longueur maximale de la séquence
        int currentSequence = 1; // Longueur de la séquence actuelle

        // Parcourt le tableau
        for (int i = 1; i < x.length; i++) {
            if (x[i] == x[i - 1]) {
                currentSequence++; // Incrémente si l'élément est égal au précédent
            } else {
                maxSequence = Math.max(maxSequence, currentSequence); // Met à jour la séquence maximale
                currentSequence = 1; // Réinitialise pour la nouvelle séquence
            }
        }

        // Vérifie à la fin si la dernière séquence était la plus longue
        maxSequence = Math.max(maxSequence, currentSequence);

        return maxSequence;
    } // J'ai rempli la partie vide 

    public static void main(String[] args) {
        int[] Tab1 = {1, 2, 1, 3, 3, 3, 6, 1, 1};
        int[] Tab2 = {1, 5, 2, 2, 2, 7, 3, 3, 3, 3};
        int[] Tab3 = {3, 1, 7, 1};
    
        // Affichage des codes 
    
        System.out.println("La plus longue séquence d'éléments consécutifs égaux dans Tab1 est : " + sequenceMax(Tab1));
        System.out.println("La plus longue séquence d'éléments consécutifs égaux dans Tab2 est : " + sequenceMax(Tab2));
        System.out.println("La plus longue séquence d'éléments consécutifs égaux dans Tab3 est : " + sequenceMax(Tab3));
    }
}
