package network;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by luchk on 05.12.2016.
 */
public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println(Address);

        String urL = "www.favbet.com";

        Address = InetAddress.getByName(urL);
        System.out.println(Address);
        System.out.println("***************************************");

        InetAddress SW[] = InetAddress.getAllByName(urL);
        for (int i = 0; i < SW.length; i++)
            System.out.println(SW[i]);
        System.out.println("***************************************");
    }
}
