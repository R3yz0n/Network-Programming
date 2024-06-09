import java.net.InetAddress;

public class AddressTypes {

    /*
     * isAnyLocalAddress() method in Java is used to check whether the InetAddress
     * isLoopbackAddress or not. It returns true if the InetAddress is a wildcard
     * isSiteLocalAddress or false otherwise.
     * isLinkLocalAddress() method in Java is used to check whether the InetAddress
     * isMultiCastAddress or not. It returns true if the InetAddress is a multicast
     * isMcGlobalAddress or false otherwise.
     * isMCNodeLocalAddress() method in Java is used to check whether the
     * InetAddress
     * isMccorglobalAddress or not. It returns true if the InetAddress is a
     * multicast
     * isMCLinkLocalAddress or false otherwise.
     */
    public static void main(String[] args) {
        try {

            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address);
            System.out.println(address.getHostAddress());
            System.out.println(address.isReachable(100));
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
}