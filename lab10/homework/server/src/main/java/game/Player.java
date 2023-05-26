package game;

public class Player {
    String name;
    Board board;

    public Player(){}

    public Player(String name){
        this.name = name;
    }

    public void makeMove(int i, int j){
        board.submitMove(i,j);
    }

    public void joinGame(Game game){
        game.connect(this);
    }

    public void createGame(){
        Game game = new Game(this);
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

}
