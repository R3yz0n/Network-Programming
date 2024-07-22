import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientSocketEg {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            String message = s.nextLine();

            Socket cSocket = new Socket("127.0.0.1", 2024);

            DataOutputStream dout = new DataOutputStream(cSocket.getOutputStream());
            dout.writeUTF(message);

            dout.flush();
            dout.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

    }
}