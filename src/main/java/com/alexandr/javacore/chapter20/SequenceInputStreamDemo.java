package com.alexandr.javacore.chapter20;

import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

import static com.alexandr.javacore.constants.CustomConstants.*;

public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        int c;
        Vector<String> files = new Vector<>();

        files.addElement(FILE_1_PATH);
        files.addElement(FILE_2_PATH);
        files.addElement(FILE_3_PATH);
        InputStreamEnumerator enumerator = new InputStreamEnumerator(files);

        try (InputStream inputStream = new SequenceInputStream(enumerator)){
            while ((c = inputStream.read()) != -1)
                System.out.print((char) c);
        }catch (NullPointerException e){
            System.out.println(NOT_FOUND_FILE);
        }catch (IOException e){
            System.out.println(ERROR_IO + e);
        }
    }
}
