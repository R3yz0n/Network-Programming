import java.net.URI;
import java.net.URISyntaxException;

public class URIMethodsExample {

    public static void main(String[] args) {
        try {
            // Create a URI object
            URI uri = new URI("https://example.com:8080/path/to/resource?query=1#fragment");

            // 1. Get the scheme (protocol)
            String scheme = uri.getScheme(); // scheme = "https"
            System.out.println("Scheme: " + scheme);

            // 2. Get the host
            String host = uri.getHost(); // host = "example.com"
            System.out.println("Host: " + host);

            // 3. Get the port
            int port = uri.getPort(); // port = 8080
            System.out.println("Port: " + port);

            // 4. Get the path
            String path = uri.getPath(); // path = "/path/to/resource"
            System.out.println("Path: " + path);

            // 5. Get the query
            String query = uri.getQuery(); // query = "query=1"
            System.out.println("Query: " + query);

            // 6. Get the authority
            String authority = uri.getAuthority(); // authority = "example.com:8080"
            System.out.println("Authority: " + authority);

            // 7. Get the user info (username and password)
            String userInfo = uri.getUserInfo(); // userInfo = null (if not set)
            System.out.println("User Info: " + userInfo);

            // 8. Get the fragment (anchor)
            String fragment = uri.getFragment(); // fragment = "fragment"
            System.out.println("Fragment: " + fragment);

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
