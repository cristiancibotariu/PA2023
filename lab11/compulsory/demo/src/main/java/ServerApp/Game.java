package ServerApp;

import java.util.ArrayList;
import java.util.List;

public class Game {
    Player player1;
    Player player2;
    Board board;

    Game(){}

    public Game(Player player1){
        this.player1 = player1;
    }

    public void connect(Player player2){
        this.player2=player2;
    }

    public Player getPlayer1(){
        return this.player1;
    }

    public Game getGame(){
        return this;
    }

    public void winner(){
        //int numRows = board.matrix.length; // Number of rows

        /*for (int i = 0; i < numRows; i++) {
            int numColumns = board.matrix[i].length; // Number of columns in the current row

            for (int j = 0; j < numColumns; j++) {

            }
        }*/
    }

}
