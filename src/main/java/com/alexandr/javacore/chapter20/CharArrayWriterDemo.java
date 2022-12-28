package com.alexandr.javacore.chapter20;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

import static com.alexandr.javacore.constants.CustomConstants.*;

public class CharArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        String s = TEST_TEXT;
        char[] buf = new char[s.length()];

        s.getChars(0, s.length(), buf, 0);

        try {
            charArrayWriter.write(buf);
        }catch (IOException e){
            System.out.println(ERROR_IO + e);
            return;
        }
        System.out.println("Buffer as a character string");
        System.out.println(charArrayWriter.toString());
        System.out.println("in array");
        char[] chars = charArrayWriter.toCharArray();
        for (int i = 0; i < chars.length; i++){
            System.out.print(chars[i]);
        }

        System.out.println("\nOutput like FileWriter()");
        try (FileWriter fileWriter = new FileWriter(FILE_TEST_PATH)){
            charArrayWriter.writeTo(fileWriter);
        }catch (IOException e){
            System.out.println(ERROR_IO + e);
        }

        System.out.println("Resetting...");
        charArrayWriter.reset();

        for (int i = 0; i < 3; i++){
            charArrayWriter.write('X');
        }
        System.out.println(charArrayWriter.toString());
    }
}
