
import java.net.ServerSocket;

class Server {

    public static void main(String[] args) {

        try {
            ServerSocket server = new ServerSocket(1234);
            System.out.print(server);
        } catch (Exception e) {

            System.out.println(e);
        }

    }
}
