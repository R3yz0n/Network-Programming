
import java.net.*;

public class Test1 {

    public static void main(String[] args) {

        try {
            // InetAddress address = InetAddress.getByName("sagarthapachhetri.com.np");
            // InetAddress a = new InetAddress();
            InetAddress address = InetAddress.getByName("sagarthapachhetri.com.np");
            // System.out.println(address.getClass());
            // String hostName = address.getHostName();
            // System.out.println(hostName);
            // System.out.println(" " + address);

            // Get canonical host Name
            byte[] addressInByte = address.getAddress();
            InetAddress hostName = address.getLocalHost();
            System.out.println(hostName);
            // System.out.println("------ ");\
            // System.out.println(addressInByte);

            for (byte b : addressInByte) {

                System.out.println(b);
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error" + e);
        }

    }

}
