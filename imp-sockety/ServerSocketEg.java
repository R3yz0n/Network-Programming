import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketEg {
    public static void main(String[] args) {
        try {
            ServerSocket sSocket = new ServerSocket(2024);

            Socket client = sSocket.accept();

            System.out.println("Client connected:" + client.getInetAddress().getHostAddress());

            InputStream inputStream = client.getInputStream();

            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String message;

            while ((message = reader.readLine()) != null) {
                System.out.println(message);

            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}