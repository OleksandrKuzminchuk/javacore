package com.alexandr.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static com.alexandr.javacore.constants.CustomConstants.ERROR_IO;

public class ShowFile {
    public static void main(String[] args) {
        int i;

        if (args.length != 1){
            System.out.println("Use: ShowFile name_file");
            return;
        }

        try (FileInputStream fileInputStream = new FileInputStream(args[0])){
            do {
                i = fileInputStream.read();
                if (i != -1) System.out.print((char) i);
            }while (i != -1);
        } catch (IOException e){
            System.out.println(ERROR_IO + e);
        }
    }
}
