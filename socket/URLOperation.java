import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class URLOperation {
    public static void main(String[] args) throws Exception {

        @SuppressWarnings("deprecation")
        URL url = new URL("http://www.google.com");
        URLConnection conn = url.openConnection();
        System.out.println(conn);

        Object content = conn.getContent();
        System.out.println(content);

        long date = conn.getDate();
        System.out.println(date);

        long modifiedDate = conn.getLastModified();
        System.out.println(modifiedDate);
        conn.connect();

        Map<String, List<String>> headersField = conn.getHeaderFields();

        for (Map.Entry<String, List<String>> entry : headersField.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\n");
        String headers1 = conn.getHeaderFieldKey(1);
        System.out.println(headers1);

    }

}
