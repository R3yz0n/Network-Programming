
import java.net.InetAddress;

public class BlacklistDemo {

    public static void main(String[] args) {
        try {
            InetAddress addresses[] = new InetAddress[2];

            // Here I've used the getByName method, you colud use getByAddress and pass
            // Bytes and address are like dns 1.1.1.1 or 127.0.0.1 etc
            addresses[0] = (InetAddress) InetAddress.getByName("localhost");
            addresses[1] = (InetAddress) InetAddress.getByName("www.youtube.com");

            // Creating a random inet addresss to check whether it is in the blacklist
            // InetAddress addressToBeChecked = InetAddress.getByName("www.google.com");
            InetAddress addressToBeChecked = InetAddress.getByName("localhost");
            if (addressToBeChecked != null)
                doesContain(addresses, addressToBeChecked);
            else
                System.out.println("Address is null");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void doesContain(InetAddress[] addresses, InetAddress addressToBeChecked) {
        boolean isPresent = false;

        try {

            for (InetAddress eachInetAddress : addresses) {
                if (eachInetAddress.equals(addressToBeChecked)) {
                    System.out.println("*****Address is in the blacklist*****");
                    // isPresent = true;
                    break;
                }
                isPresent = false;
            }
            if (!isPresent) {
                System.out.println("Address is not in the blacklist");
            }

        } catch (Exception e) {

            e.printStackTrace();
        }

    }
}
