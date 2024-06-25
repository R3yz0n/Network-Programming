import java.net.*;

public class URIConstructor {

    public static void main(String[] args) throws Exception {
        // URI from string
        URI uri1 = new URI("https://www.example.com/path/to/resource");
        System.out.println(uri1);

        // URI from individual components (hierarchical)
        // URI uri2 = new URI("https", "www.example.com", "/about", 80, null, null,
        // "#fragment");
        // System.out.println(uri2);

        // URI from individual components (opaque)
        URI uri3 = new URI("ftp", "username:password", "ftp.example.com", -1,
                "/data/file.txt", null, null);
        System.out.println(uri3);

        // URI with user info
        URI uri4 = new URI("https", "user:password", "www.example.com", -1, "/login",
                null, null);
        System.out.println(uri4);
    }
}
