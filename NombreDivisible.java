// Nom : Omar Basman 
// Numero d'etudiant : 300406240

package Devoir1_300406240.d1q2;

public class NombreDivisible{

    public static int nombreDivisible(int[] x, int n) {
        /*
         * Prend un tableau d'entiers x et un entier n comme paramètres d'entrée 
         * et renvoie le nombre d'éléments du tableau qui sont divisibles par n.
         */

        if (n == 0) {
            // Évite une division par zéro
            throw new IllegalArgumentException("Le diviseur ne peut pas être zéro.");
        }

        int count = 0; // Compteur pour les éléments divisibles
        for (int value : x) {
            if (value % n == 0) {
                count++;
            }
        }
        return count;
    } // J'ai remplie la partie vide 

    public static void main(String[] args) {
        int n1 = 3, n2 = 2;
        int[] Tab1 = {6, 10, 2, 3, 4, 5, 6, 0};
        int[] Tab2 = {1, 2, 3, 0, 5, -6, 995};

    // Affichage des codes 

        System.out.println("Le nombre d'éléments divisibles par 3 dans Tab1 est : " + nombreDivisible(Tab1, n1));
        System.out.println("Le nombre d'éléments divisibles par 2 dans Tab2 est : " + nombreDivisible(Tab2, n2));
    }
}


