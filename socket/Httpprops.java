
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class Httpprops {
    public static void main(String[] args) throws Exception {
        Socket socket = null;
        try {
            socket = new Socket("www.example.com", 80);

            socket.setKeepAlive(true);

            @SuppressWarnings("deprecation")
            URL url = new URL("www.example.com");
            URLConnection connection = url.openConnection();
            Map<String, List<String>> headers = connection.getHeaderFields();

          headers.forEach((key,value)=>System.out.println());

            // int responseCode = connection.getResponseCode();
            // String responseMessage = connection.getResponseMessage();
            // System.out.println("Response Code: " + responseCode);
            // System.out.println("Response Message: " + responseMessage);

            socket.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
}
