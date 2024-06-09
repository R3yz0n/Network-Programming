
import java.net.*;

public class Test {

    public static void main(String[] args) {

        try {
            // InetAddress address = InetAddress.getByName("sagarthapachhetri.com.np");
            // InetAddress a = new InetAddress();
            InetAddress address = InetAddress.getByName("sagarthapachhetri.com.np");
            System.out.println(address);
            InetAddress address1 = InetAddress.getByName("sagarthapachhetri.com.np");
            System.out.println(address.getClass());
            String hostName = address.getHostName();
            System.out.println(hostName);
            System.out.println(" " + address);

            // Get canonical host Name
            String canonicalHost = address.getCanonicalHostName();
            System.out.println(canonicalHost);
            System.out.println(address.equals(address1));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error" + e);
        }

    }

}
