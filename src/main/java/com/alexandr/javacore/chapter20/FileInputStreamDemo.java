package com.alexandr.javacore.chapter20;

import java.io.FileInputStream;
import java.io.IOException;

import static com.alexandr.javacore.constants.CustomConstants.*;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;
        try (FileInputStream fileInputStream =
                     new FileInputStream(JAVACORE_PATH + "chapter20\\FileInputStreamDemo.java")){
            System.out.println("Total bytes available: " + (size = fileInputStream.available()));
            int n = size/40;
            System.out.println("First " + n + " bytes, " +
                    "read from a file one by one read() method");
            for (int i = 0; i < n; i++){
                System.out.println((char) fileInputStream.read());
            }
            System.out.println(STILL_AVAILABLE + fileInputStream.available());

            System.out.println("Reading next " + n + " bytes one by one read(b[]) method");
            byte[] b = new byte[n];
            if (fileInputStream.read(b) != n){
                System.err.println("Can not read " + n + " bytes");
            }
            System.out.println(new String(b, 0, n));
            System.out.println(STILL_AVAILABLE + (size = fileInputStream.available()));

            System.out.println("Skip half of the remaining bytes with the skip() method");
            fileInputStream.skip(size/2);
            System.out.println(STILL_AVAILABLE + fileInputStream.available());

            System.out.println("Reading " + n/2 + " bytes placed at the end of the array");
            if (fileInputStream.read(b, n/2, n/2) != 2){
                System.err.println("Can not read " + n/2 + " bytes");
            }

            System.out.println(new String(b, 0, b.length));
            System.out.println(STILL_AVAILABLE + fileInputStream.available());
        }catch (IOException e){
            System.out.println(ERROR_IO + e);
        }
    }
}
