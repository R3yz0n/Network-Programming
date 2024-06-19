import java.net.MalformedURLException;
import java.net.*;
import java.net.URL;

public class URLDemo {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        try {
            // URL url = new URL("http://facebook.com");

            // URL url = new
            // URL("https://docs.oracle.com/javase/9/docs/api/java/net/URL.html#getRef--");
            URL url = new URL("https://github.com/R3yz0n?tab=repositories");

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("Path: " + url.getPath());
            System.out.println("Default Port: " + url.getDefaultPort());
            System.out.println("Query: " + url.getQuery());
            System.out.println("authority: " + url.getAuthority());
            System.out.println("file: " + url.getFile());
            System.out.println("reference: " + url.getRef());
            System.out.println("userinfo: " + url.getUserInfo());

        } catch (MalformedURLException e) {
            System.out.println(e);
        }

    }
}