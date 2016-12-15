package network;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by luchk on 15.12.2016.
 */
public class URLDemo {
    public static void main(String[] args) {
        URL hp = null;
        try {
            hp = new URL("http://www.herbschild.com/Arcticles");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        System.out.println("Protocol: " + hp.getProtocol());
        System.out.println("Port: " + hp.getPort());
        System.out.println("Host: " + hp.getHost());
        System.out.println("File: " + hp.getFile());
        System.out.println("Author: " + hp.getAuthority());
        System.out.println("External: " + hp.toExternalForm());
    }
}
