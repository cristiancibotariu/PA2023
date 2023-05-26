package ServerApp;

import java.util.ArrayList;
import java.util.List;

public class Player {
    String name;

    public Player(){}

    public Player(String name){
        this.name = name;
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
