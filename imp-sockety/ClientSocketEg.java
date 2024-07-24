import java.io.*;
import java.net.*;

public class ClientSocketEg {
    public static void main(String[] args) {
        try {

            Socket socket = new Socket("localhost", 8090); // Connect to server on localhost, port 8080
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String messageFromServer = in.readLine();
            System.out.println("Server says: " + messageFromServer);
            socket.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

    }
}