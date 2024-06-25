import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.net.URLDecoder;

public class UrlEncodeDecode {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String url = "http://vo.dev/";

        // Encdoing the url with UTF-8
        String encodedUrl = URLEncoder.encode(url, "UTF-8");
        System.out.println("Encoded URL: " + encodedUrl);

        // Decdoing the url emcoded with UTF-8
        String decodedUrl = URLDecoder.decode(encodedUrl, "UTF-8");
        System.out.println("Decoded URL: " + decodedUrl);
    }
}
