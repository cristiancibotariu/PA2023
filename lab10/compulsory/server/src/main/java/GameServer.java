import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class GameServer {
    // Define the port on which the server is listening
    public static final int PORT = 8100;
    ServerSocket serverSocket = null ;

    public GameServer() throws IOException {
        try {
            serverSocket = new ServerSocket(PORT);
            while (true) {
                System.out.println ("Waiting for a client ...");
                Socket socket = serverSocket.accept();
                // Execute the client's request in a new thread
                new ClientThread(socket, this).start();
            }
        } catch (IOException e) {
            System.err. println ("Ooops... " + e);
        } finally {
            serverSocket.close();
        }
    }

    public void stopServer(){
        try {
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main ( String [] args ) throws IOException {
        GameServer server = new GameServer ();
    }
}
