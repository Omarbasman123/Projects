// NOM: OMAR BASMAN ALMOGHLY

package Devoir2_300406240.Partie1;

public class User extends Player {
    private BoxSymbol mySymbol;

    @Override
    public void startNewGame(BoxSymbol symbol) {
        this.mySymbol = symbol;
    }

    @Override
    public void play(Game game) {  // verifie si le jeu est encore en cours

        if (game.getGameState() != GameState.PLAYING) {
            System.out.println("Game is finished already!"); // si le jeu est termine, affichage d'un message d'erreur

            return;
        }
        System.out.print(mySymbol + " to play: ");
        int move = Integer.parseInt(System.console().readLine()) - 1;
        game.play(move);
    }
}
    

