package network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import static java.lang.System.in;

/**
 * Created by luchk on 12.12.2016.
 */
public class WhoIs2 {
    public static void main(String[] args) throws IOException {
        int c;
        try (Socket socket = new Socket("whois.internic.net", 43)){
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            String string = (args.length == 0 ? "MHProfessional.com" : args[0]) + "\n";

            byte buf[] = string.getBytes();

            outputStream.write(buf);

            while ((c = in.read()) != -1){
                System.out.println((char)c);
            }
        }
    }
}
