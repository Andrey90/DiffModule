package network;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 * Created by luchk on 15.12.2016.
 */
public class UCDemo {
    public static void main(String[] args) throws IOException {
        int c;
        URL hp = new URL("http://www.internic.net");
        URLConnection hpCon = hp.openConnection();

        //get date
        long d = hpCon.getDate();
        if (d == 0){
            System.out.println("Not information about date");
        }
        else {
            System.out.println("Date: " + new Date(d));
        }

        //Get type of contain in
        System.out.println("Type of contain: " + hpCon.getContentType());

        //get date of expiration
        d = hpCon.getExpiration();
        if (d == 0){
            System.out.println("Not information about date of expiration!");
        }
        else {
            System.out.println("Expiration: " + new Date(d));
        }

        //Get date of the last modification
        d = hpCon.getLastModified();
        if (d == 0){
            System.out.println("Not information about modifacation");
        }
        else {
            System.out.println("Last modification: " + new Date(d));
        }

        //Get length of contains
        long len = hpCon.getContentLengthLong();
        if (len == -1){
            System.out.println("Do not know about length");
        }
        else {
            System.out.println("Length: " + len);
        }
        if (len != 0){
            System.out.println("=========Contains===========");
            InputStream input = hpCon.getInputStream();
            while (((c = input.read()) != -1)){
                System.out.print((char) c);
            }
            input.close();
        }
        else {
            System.out.println("Conteins can not avaliable");
        }
    }
}
