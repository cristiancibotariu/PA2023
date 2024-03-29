import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main (String[] args) throws IOException {
        String serverAddress = "127.0.0.1"; // The server's IP address
        int PORT = 8100; // The server's port
        try (
                Socket socket = new Socket(serverAddress, PORT);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))
        ) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String request = scanner.nextLine();
                out.println(request);
                String response = in.readLine();
                System.out.println(response);

                if (request.equals("exit")) {
                    System.out.println("You have used the disconnection command and thus the connection will be interrupted");
                    break;
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
