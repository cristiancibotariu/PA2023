import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

class ClientThread extends Thread {
    public Socket socket = null ;
    public GameServer gameServer;
    public ClientThread (Socket socket, GameServer gameServer) {
        this.socket = socket ;
        this.gameServer = gameServer;
    }
    public void run () {
        try {
            // Get the request from the input stream: client → server
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            String request;
            // Send the response to the oputput stream: server → client
            while((request = in.readLine())!=null) {
                String raspuns = "The client has introduced the following text: " + request;
                out.println(raspuns);
                out.flush();

                if(request.equals("exit")){
                    System.out.println("The client has disconnected");
                    break;
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
