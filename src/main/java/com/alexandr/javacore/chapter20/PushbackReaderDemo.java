package com.alexandr.javacore.chapter20;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.PushbackReader;

import static com.alexandr.javacore.constants.CustomConstants.ERROR_IO;

public class PushbackReaderDemo {
    public static void main(String[] args) {
        //if '==' (.qe.) else '=' (<-)
        String s = " == = ";
        char[] buf = new char[s.length()];
        s.getChars(0, s.length(), buf, 0);
        CharArrayReader charArrayReader = new CharArrayReader(buf);

        int c;

        try (PushbackReader pushbackReader = new PushbackReader(charArrayReader)){
            while ((c = pushbackReader.read()) != -1){
                switch (c){
                    case '=':
                        if ((c = pushbackReader.read()) == '='){
                            System.out.print(".eq.");
                        }else {
                            System.out.print("<-");
                            pushbackReader.unread(c);
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
