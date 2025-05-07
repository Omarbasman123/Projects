// Nom : Omar Basman 
// Numero d'etudiant : 300406240 

package Devoir1_300406240.d1q3;

public class SequenceDeDeux {

    public static boolean sequenceDeDeux(int[] x) {
        /*
         * Fonction qui prend un tableau de nombres entiers et qui retourne true s’il y a
         * au moins une séquence de deux éléments consécutifs égaux,
         * et false dans le cas contraire.
         */
        for (int i = 0; i < x.length - 1; i++) {
            if (x[i] == x[i + 1]) {
                return true; // Dès qu'une séquence consécutive égale est trouvée
            }
        }
        return false; // Retourne false si aucune séquence n'est trouvée
    } // J'ai remplie la partie vide 

    public static void main(String[] args) {
        int[] Tab1 = {3, 1, 1, 7, 5};
        int[] Tab2 = {1, 6, 4, 3, 3, 3};
        int[] Tab3 = {2, 1, 5, 3, 1, 2, 1};
    
        // Affichage des codes

        System.out.println("Il y a au moins une séquence de deux éléments consécutifs égaux dans Tab1 : " + sequenceDeDeux(Tab1));
        System.out.println("Il y a au moins une séquence de deux éléments consécutifs égaux dans Tab2 : " + sequenceDeDeux(Tab2));
        System.out.println("Il y a au moins une séquence de deux éléments consécutifs égaux dans Tab3 : " + sequenceDeDeux(Tab3));
    }
}


