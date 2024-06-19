import java.net.*;

public class URIDemo {
    public static void main(String[] args) {
        try {
            // URI uri = new URI("https://facebook.com");

            URI uri = new URI("https://docs.oracle.com?tab=repositories/docs/api/java/net/URL.html#getRef");
            // URI uri = new URI("https://github.com/R3yz0n?tab=repositories");

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