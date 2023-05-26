package game;

public class Player {
    String name;

    public Player(){}

    public Player(String name){
        this.name = name;
    }

    /*public void makeMove(int i, int j){
        board.submitMove(i,j);
    }*/

    public void setName(String name){
        this.name=name;
    }

}
