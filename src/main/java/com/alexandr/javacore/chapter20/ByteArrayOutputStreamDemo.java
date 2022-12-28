package com.alexandr.javacore.chapter20;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static com.alexandr.javacore.constants.CustomConstants.*;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        String s = "These data must be input array";
        byte[] buf = s.getBytes();

        try {
            outputStream.write(buf);
        }catch (IOException e){
            System.out.println("Error write to buffer");
            return;
        }

        System.out.println("Buffer view String");
        System.out.println(outputStream.toString());
        System.out.println("Buffer view array");
        byte[] b = outputStream.toByteArray();
        for (int i = 0; i < b.length; i++) {
            System.out.print((char) b[i]);
        }

        System.out.println("\nIn output stream type OutputStream()");

        try (FileOutputStream f2 = new FileOutputStream(FILE_TEST_PATH)){
            outputStream.writeTo(f2);
        }catch (IOException e){
            System.out.println(ERROR_IO + e);
            return;
        }

        System.out.println("Resetting...");
        outputStream.reset();

        for (int i = 0; i < 3; i++){
            outputStream.write('X');
        }
        System.out.println(outputStream.toString());
    }
}
