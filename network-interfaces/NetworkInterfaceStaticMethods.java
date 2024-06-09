import java.net.*;
import java.util.Enumeration;

public class NetworkInterfaceStaticMethods {

    public static void main(String[] args) throws Exception {
        // printAllNetworkInterfaces();
        getByIndex(1);
        // getByName("lo0");
        // InetAddress address = InetAddress.getLocalHost();
        // getByInetAddress(address);

    }

    public static void printAllNetworkInterfaces() {
        try {
            System.out.println("All Network Interfaces:");
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = networkInterfaces.nextElement();
                System.out.println("Name: " + networkInterface.getName());
                System.out.println("Display Name: " + networkInterface.getDisplayName());

                System.out.println("------------------------------------------");
            }
        } catch (SocketException ex) {
            ex.printStackTrace();
        }
    }

    public static void getByIndex(int index) {
        try {
            System.out.println("\nNetwork Interface by Index:");
            System.out.println("------------------------------");
            NetworkInterface niByIndex = NetworkInterface.getByIndex(index); // Change index as needed
            if (niByIndex != null) {
                System.out.println("\nName: " + niByIndex.getName());
                System.out.println("Display Name: " + niByIndex.getDisplayName());
            } else {
                System.out.println("Network Interface not found for the specified index.");
            }
        } catch (SocketException ex) {
            ex.printStackTrace();
        }
    }

    public static void getByName(String name) {
        try {
            System.out.println("\nNetwork Interface by Name:");
            System.out.println("------------------------------");
            NetworkInterface niByName = NetworkInterface.getByName(name);

            if (niByName != null) {
                System.out.println("Name: " + niByName.getName());
                System.out.println("Display Name: " + niByName.getDisplayName());
            } else {
                System.out.println("Network Interface not found for the specified name.");
            }
        } catch (SocketException ex) {
            ex.printStackTrace();
        }
    }

    public static void getByInetAddress(InetAddress address) {
        try {
            System.out.println("\nNetwork Interface by InetAddress:");
            System.out.println("------------------------------");
            NetworkInterface niByInetAddress = NetworkInterface.getByInetAddress(address);
            if (niByInetAddress != null) {
                System.out.println("Name: " + niByInetAddress.getName());
                System.out.println("Display Name: " + niByInetAddress.getDisplayName());
            } else {
                System.out.println("Network Interface not found for the specified InetAddress.");
            }
        } catch (SocketException ex) {
            ex.printStackTrace();
        }
    }
}

// import java.net.*;
// import java.util.*;

// public class NIMethods {

// public static void main(String[] args) throws Exception {

// Enumeration<NetworkInterface> networkInterfaces =
// NetworkInterface.getNetworkInterfaces();
// List<NetworkInterface> interfaceList = Collections.list(networkInterfaces);

// for (NetworkInterface networkInterface : interfaceList) {
// // System.out.println(networkInterface.getName());
// // NetworkInterface eachName =
// // NetworkInterface.getByName(networkInterface.getName());
// // System.out.println("get Network interface by name " + eachName);
// System.out.println(networkInterface);

// // NetworkInterface.getByInetAddress(null);

// }

// // InetAddress localAddress = InetAddress.getLocalHost();
// // System.out.println(localAddress);
// // NetworkInterface ni = NetworkInterface.getByInetAddress(localAddress);
// // System.out.println(ni);

// }

// }
