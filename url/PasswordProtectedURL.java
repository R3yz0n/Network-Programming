import java.net.Authenticator;
import java.net.InetAddress;
import java.net.PasswordAuthentication;
import java.net.UnknownHostException;

class PasswordProtectedURL extends Authenticator {

    protected PasswordAuthentication getPasswordAuthentication() {
        String userName = "sagar";

        String pw = "sss";
        char[] charArray = pw.toCharArray();
        return new PasswordAuthentication(userName, charArray);

    }

    public static void main(String[] args) {
        System.out.println("hello");

        PasswordProtectedURL pURL = new PasswordProtectedURL();

        try {
            InetAddress inet = InetAddress.getByName("www.example.com");
            Authenticator.setDefault(pURL);
            Authenticator.requestPasswordAuthentication(inet, 8080, "https", null, null);
            System.out.println("down");

        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}