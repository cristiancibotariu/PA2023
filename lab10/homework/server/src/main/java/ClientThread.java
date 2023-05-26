import game.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

class ClientThread extends Thread {
    public Socket socket = null ;
    public GameServer gameServer;
    public ClientThread (Socket socket, GameServer gameServer) {
        this.socket = socket ;
        this.gameServer = gameServer;
    }
    Game game;
    List<Game> games = new ArrayList<>();
    Player player;
    public void run () {
        try {
            // Get the request from the input stream: client → server
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            String request;
            // Send the response to the oputput stream: server → client
            while((request = in.readLine())!=null) {
                String raspuns;

                if(request.equals("name")){
                    raspuns = "Enter your name: ";
                    out.println(raspuns);
                    out.flush();
                    String name = in.readLine();
                    player = new Player(name);
                    System.out.println(name + " has connected!");
                }
                else{
                    raspuns = "The client has introduced the following text: " + request;
                    out.println(raspuns);
                    out.flush();
                }

                if(request.equals("exit")){
                    System.out.println("The client has disconnected");
                    break;
                }

                if(request.equals("create game")){
                    player.createGame();
                    games.add(new Game(player));
                }

                if(request.equals("list games")){
                    for(Game i : games){
                        out.println((i.getPlayer1()).getName() + "'s game");
                        out.flush();
                    }
                }

                if(request.equals("stop")){
                    System.out.println("The server has been closed");
                    gameServer.stopServer();
                    break;
                }
            }
        } catch (IOException e) {
            System.err.println("Communication error... " + e);
        } /*finally {
            try {
                System.out.println("Connection with the client has been ended.");
                socket.close(); // or use try-with-resources
            } catch (IOException e) { System.err.println (e); }
        }*/
    }

    public String getRequest(String request){
        return request;
    }
}
