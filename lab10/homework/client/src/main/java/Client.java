import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import game.*;

public class Client {
    public static void main (String[] args) throws IOException {
        String serverAddress = "127.0.0.1"; // The server's IP address
        int PORT = 8100; // The server's port
        int durationInSeconds = 30;
        Timer timerThread = new Timer(durationInSeconds);
        Thread thread = new Thread(timerThread);
        Player player = new Player();

        try (
                Socket socket = new Socket(serverAddress, PORT);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))
        ) {
            thread.start();
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String request = scanner.nextLine();
                out.println(request);
                String response = in.readLine();
                System.out.println(response);

                if(response.equals("Enter your name: ")){
                    String name = scanner.nextLine();
                    player.setName(name);
                    out.println(name);
                    System.out.println("You have connected succesfully!");
                }

                if(request.equals("create game")){
                    System.out.println("Game has been created, your are now a host");
                }

                if (request.equals("exit")) {
                    System.out.println("You have used the disconnection command and thus the connection will be interrupted");
                    break;
                }

                if(request.equals("list games")){
                    String game;
                    while((game = in.readLine())!=null){
                        System.out.println(game);
                    }
                }

                if(request.equals("stop")){
                    System.out.println("The server has been closed");
                    break;
                }
            }
        } catch (UnknownHostException e) {
            System.err.println("No server listening... " + e);
        }

    }
}
