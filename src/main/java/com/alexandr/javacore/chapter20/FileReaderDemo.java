package com.alexandr.javacore.chapter20;

import java.io.FileReader;
import java.io.IOException;

import static com.alexandr.javacore.constants.CustomConstants.ERROR_IO;
import static com.alexandr.javacore.constants.CustomConstants.JAVACORE_PATH;

public class FileReaderDemo {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader(JAVACORE_PATH + "chapter20\\FileReaderDemo.java")){
            int c;

            while ((c = fileReader.read()) != -1) System.out.print((char) c);
        }catch (IOException e){
            System.out.println(ERROR_IO + e);
        }
    }
}
