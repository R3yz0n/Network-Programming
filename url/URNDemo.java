import java.net.*;

public class URNDemo {
    public static void main(String[] args) {
        try {

            URI uri = new URI("+1-212-456-7890");

            System.out.println("Scheme: " + uri.getScheme());

            System.out.println("Host: " + uri.getHost());
            System.out.println("Port: " + uri.getPort());
            System.out.println("Path: " + uri.getPath());

            System.out.println("Query: " + uri.getQuery());
            System.out.println("authority: " + uri.getAuthority());
            // System.out.println("file: " + uri.getFile()); //not valid
            // System.out.println("file: " + uri.getDefaultPort()); // not valid

            System.out.println("userinfo: " + uri.getUserInfo());

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}