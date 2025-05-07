// Nom : Omar Basman 
// Numero d'etudiant : 300406240 


package Devoir1_300406240.d1q6;

public class SetInt {
    
    private int[] tab ;
    private int size ;
    private int nbElements ;

    public SetInt ( ) {
      size = 20;
      tab = new int[size];
      nbElements = 0;
    }
    public int getNbElements() {
        return nbElements;
    }
// Méthode has : vérifie si l'élément p existe déjà dans l'ensemble
    public boolean has(int p) {
        for (int i = 0; i < nbElements; i++) {
            if (tab[i] == p) {
                return true;
            }
        }
        return false;
    } // J'ai rempli la partie vide 
    
// Méthode add : ajoute l'élément p à l'ensemble si il n'y est pas déjà
    public void add(int p) {
        if (!has(p) && nbElements < size) {
            tab[nbElements] = p;
            nbElements++;
        }
    }// J'ai rempli la partie vide 
    
// Méthode trier : trie l'ensemble avec la méthode de tri par insertion
    public  void trier( ){
        for (int i = 1; i < nbElements; i++) {
            int current = tab[i];
            int j = i - 1;

            // Décale les éléments plus grands que l'élément actuel vers la droite
            while (j >= 0 && tab[j] > current) {
                tab[j + 1] = tab[j];
                j--;
            }
            // Insère l'élément actuel à sa place correcte
            tab[j + 1] = current;
        }
    }
        // J'ai rempli la parti vide 

    
    public String toString() {
        if (nbElements == 0)
            return "{}";
        else {
            String str =  "{" + tab[0];
            for (int i = 1; i < nbElements; i++)
                str += "," + tab[i];
            return str + "}";
        }
    }

/*
* MAIN
* 
*/
    static public void main(String[] args) {
        SetInt set = new SetInt();
        System.out.println("SVP, entrez les elements de votre ensemble (entiers positifs) :" );
        System.out.println("Pour quitter, entrez un entier negatif:" );
        int n = ReadInt.getInt("Votre premier entier : ");
        while (n >= 0 ) {
            set.add(n);
            n = ReadInt.getInt("entier suivant : ");
        }
        
        System.out.println("Mon ensemble contient " + set.getNbElements() + " elements : ");
        System.out.println("set = " + set);
        set.trier();
        System.out.println("Mon ensemble trie est :" );
        System.out.println("set = " + set);
     }
}
