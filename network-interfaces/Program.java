
// package network-interfaces;
import java.net.*;
import java.util.Enumeration;

public class Program {

    public static void main(String[] args) throws SocketException {

        // Network interface is a class (cannot be intantiated) which has static method
        // getNetworkInterfaces

        Enumeration<NetworkInterface> nInterfaces = NetworkInterface.getNetworkInterfaces();
        int i = 1;

        System.out.println("Interfaces" + nInterfaces);
        while (nInterfaces.hasMoreElements()) {
            System.out.println(i);
            i++;

            NetworkInterface eachInterface = nInterfaces.nextElement();
            System.out.println("Index :-" + eachInterface.getIndex());
            System.out.println("Address :- " + eachInterface.getInetAddresses());
            System.out.println("Address :- " + eachInterface.getName());
            System.out.println("Hash Code :- " + eachInterface.hashCode());
            // Enumeration<InetAddress> inetAddresses = eachInterface.getInetAddresses();
            int j = 1;
            // while (inetAddresses.hasMoreElements()) {
            // // System.out.println("The network interface " + j);
            // // InetAddress inetAddress = inetAddresses.nextElement();
            // // System.out.println("Address :- " + inetAddress);
            // // j++;
            // }

            System.out.println();
            System.out.println();

            // eachInterface.getHostAddress();
            // System.out.println(eachInterface);
            j = 1;

        }
    }

    // for (int i) {
    // }
    // System.out.println(nInterfaces[0]);

    // Arrays.asList(nInterfaces.values())
    // .forEach(season -> System.out.println(season));

}
