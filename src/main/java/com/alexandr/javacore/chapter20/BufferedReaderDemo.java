package com.alexandr.javacore.chapter20;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;

import static com.alexandr.javacore.constants.CustomConstants.ERROR_IO;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        String s = "copy &copy; &copy copy";
        char[] buf = new char[s.length()];
        s.getChars(0, s.length(), buf, 0);

        CharArrayReader charArrayReader = new CharArrayReader(buf);
        int c;
        boolean marked = false;

        try (BufferedReader bufferedReader = new BufferedReader(charArrayReader)){
            while ((c = bufferedReader.read()) != -1){
                switch (c){
                    case '&':
                        if (!marked){
                            bufferedReader.mark(32);
                            marked = true;
                        }else {
                            marked = false;
                        }
                        break;
                    case ';':
                        if (marked) {
                            marked = false;
                            System.out.print("(c)");
                        }else {
                            System.out.print((char) c);
                        }
                        break;
                    case ' ':
                        if (marked){
                            marked = false;
                            bufferedReader.reset();
                            System.out.print("&");
                        }else {
                            System.out.print((char) c);
                        }
                        break;
                    default:
                        if (!marked)
                            System.out.print((char) c);
                        break;
                }
            }
        }catch (IOException e){
            System.out.println(ERROR_IO + e);
        }
    }
}
