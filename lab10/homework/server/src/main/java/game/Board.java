package game;

public class Board {
    String[][] matrix;
    Player player;

    Board(){}

    public void submitMove(int i, int j){
        this.matrix[i][j]=player.name;
    }


}
