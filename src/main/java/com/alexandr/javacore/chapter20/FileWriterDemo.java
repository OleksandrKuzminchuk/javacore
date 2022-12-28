package com.alexandr.javacore.chapter20;

import java.io.FileWriter;
import java.io.IOException;

import static com.alexandr.javacore.constants.CustomConstants.*;

public class FileWriterDemo {
    public static void main(String[] args) {
        String source = TEST_TEXT;
        char[] buf = new char[source.length()];
        source.getChars(0, source.length(), buf, 0);

        try (FileWriter f1 = new FileWriter(FILE_1_PATH);
             FileWriter f2 = new FileWriter(FILE_1_PATH);
             FileWriter f3 = new FileWriter(FILE_1_PATH)){

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
