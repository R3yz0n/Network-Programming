package proxy;

import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.URL;
import java.net.URLConnection;

@SuppressWarnings("deprecation")
public class ProxyServer {
    public static void main(String[] args) throws Exception {
        InetSocketAddress address = new InetSocketAddress("localhost", 8080);
        Proxy ProxyAddress = new Proxy(Proxy.Type.DIRECT, address);

        URL url = new URL("sagarthapachhetri.com.np");
        URLConnection connection = url.openConnection(ProxyAddress);
        System.out.println(address);
    }

}
