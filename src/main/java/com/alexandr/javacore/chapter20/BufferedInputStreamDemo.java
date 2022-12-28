package com.alexandr.javacore.chapter20;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import static com.alexandr.javacore.constants.CustomConstants.ERROR_IO;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        String s = " &cggfgffgfg; &cnnnn &h;";
        byte[] buf = s.getBytes();

        ByteArrayInputStream inputStream = new ByteArrayInputStream(buf);
        int c;
        boolean marked = false;

        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)){
            while ((c = bufferedInputStream.read()) != -1){
                switch (c){
                    case '&':
                        if (!marked){
                            bufferedInputStream.mark(32);
                            marked = true;
                        }else {
                            marked = false;
                        }
                        break;
                    case ';':
                        if (marked){
                            marked = false;
                            System.out.print("(c)");
                        }else {
                            System.out.print((char) c);
                        }
                        break;
                    case ' ':
                        if (marked){
                            marked = false;
                            bufferedInputStream.reset();
                            System.out.print("&");
                        }else {
                            System.out.print((char) c);
                        }
                        break;
                    default:
                        if (!marked){
                            System.out.print((char) c);
                        }
                        break;
                }
            }
        }catch (IOException e){
            System.out.println(ERROR_IO + e);
        }
    }
}
