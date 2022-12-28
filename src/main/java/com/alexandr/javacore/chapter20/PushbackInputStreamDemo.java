package com.alexandr.javacore.chapter20;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

import static com.alexandr.javacore.constants.CustomConstants.ERROR_IO;

public class PushbackInputStreamDemo {
    public static void main(String[] args) {
        String s = "== = ";
        byte[] buf = s.getBytes();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buf);
        int c;

        try (PushbackInputStream pushbackInputStream = new PushbackInputStream(byteArrayInputStream)){
            while ((c = pushbackInputStream.read()) != -1){
                switch (c){
                    case '=':
                        if ((c = pushbackInputStream.read()) == '='){
                            System.out.print(".eq.");
                        }else {
                            System.out.print("<-");
                            pushbackInputStream.unread(c);
                        }
                        break;
                    default:
                        System.out.print((char) c);
                        break;
                }
            }
        }catch (IOException e){
            System.out.println(ERROR_IO + e);
        }
    }
}
