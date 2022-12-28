package com.alexandr.javacore.chapter22;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class WhoIs {
    public static void main(String[] args) throws Exception {
        int c;

        try (Socket socket = new Socket("whois.internic.net", 43)){
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            String s = (args.length == 0 ? "MHProfessional.com" : args[0] + "\n");

            byte[] bytes = s.getBytes();

            outputStream.write(bytes);

            while ((c = inputStream.read()) != -1) {
                System.out.print((char) c);
            }
        }
    }
}
