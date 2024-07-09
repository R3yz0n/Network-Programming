// package proxy;

import java.io.*;

import java.net.*;

public class WebScrappingThroughURL {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws Exception {

        URL url = new URL(
                "https://www.reddit.com/");
        URLConnection connection = url.openConnection();

        InputStreamReader sr = new InputStreamReader(connection.getInputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        while (br.readLine() != null) {
            System.out.println(br.readLine());
        }

    }

}
