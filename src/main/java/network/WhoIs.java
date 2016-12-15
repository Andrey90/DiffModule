package network;

import java.io.*;
import java.net.*;

import static java.lang.System.in;

/**
 * Created by luchk on 12.12.2016.
 */
public class WhoIs {
    public static void main(String[] args) throws IOException {
        int c;

        //Create socet connection
        Socket socket = new Socket("whois.internic.net", 43);

        //Get input and output thread
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        //Create point of request
        String string = (args.length == 0 ? "MHProfessional.com" : args[0]) + "\n";

        //String to byte
        byte buf[] = string.getBytes();

        //Send request
        outputStream.write(buf);

        //Read and view response
        while ((c = in.read()) != -1){
            System.out.println((char)c);
        }
        socket.close();
    }
}
