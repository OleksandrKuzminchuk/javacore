package com.alexandr.javacore.chapter20;

import java.io.FileOutputStream;
import java.io.IOException;

import static com.alexandr.javacore.constants.CustomConstants.*;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String source = TEST_TEXT;
        byte[] buf = source.getBytes();

        try (FileOutputStream f1 = new FileOutputStream(FILE_1_PATH);
             FileOutputStream f2 = new FileOutputStream(FILE_2_PATH);
             FileOutputStream f3 = new FileOutputStream(FILE_3_PATH)){

            for (int i = 0; i < buf.length; i += 2){
                f1.write(buf[i]);
            }

            f2.write(buf);

            f3.write(buf, buf.length-buf.length/4, buf.length/4);
        }catch (IOException e){
            System.out.println(ERROR_IO);
        }
    }
}
