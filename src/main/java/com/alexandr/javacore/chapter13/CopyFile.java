package com.alexandr.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static com.alexandr.javacore.constants.CustomConstants.ERROR_IO;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;

        if (args.length != 2) {
            System.out.println("Use: CopyFile from to");
            return;
        }

        try (FileInputStream inputStream = new FileInputStream(args[0]);
             FileOutputStream outputStream = new FileOutputStream(args[1])) {
            do {
                i = inputStream.read();
                if (i != -1) outputStream.write(i);
            } while (i != -1);
            System.out.println("Copy SUCCESSFULLY");
        } catch (IOException e) {
            System.out.println(ERROR_IO + e);
        }
    }
}
