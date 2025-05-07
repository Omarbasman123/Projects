// NOM: OMAR BASMAN ALMOGHLY

package Devoir2_300406240.Partie1;

public abstract class Player {

    protected BoxSymbol mySymbol;
    
    public abstract void play(Game game);
   
    public void startNewGame(BoxSymbol mySymbol){
     this.mySymbol = mySymbol;
    }
     
   }
