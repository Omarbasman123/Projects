// NOM: OMAR BASMAN ALMOGHLY

package Devoir2_300406240.Partie2;

import java.util.Random;
public class Computer extends Player {
@Override
      public void play(Game game) {
        if (game.getRound() == game.getRows()*game.getColumns()) {
            System.out.println("Game is finished already!");
            return;
        }


        Random random = new Random();
        int index;

        do {
            index = random.nextInt(game.getRows() * game.getColumns());
        } while (game.boxSymbolAt(index) != BoxSymbol.EMPTY);

        game.play(index);
        System.out.println("Computer plays at position" + (index + 1));
    }
} 
