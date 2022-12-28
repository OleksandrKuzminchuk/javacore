package com.alexandr.javacore.chapter21;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

import static com.alexandr.javacore.constants.CustomConstants.*;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        try (InputStream inputStream = Files.newInputStream(Paths.get(FILE_TEST_PATH))){
            do {
                i = inputStream.read();
                if (i != -1) System.out.print((char) i);
            }while (i != -1);
        }catch (InvalidPathException e){
            System.out.println(PATH_ERROR + e);
        }catch (IOException e){
            System.out.println(ERROR_IO + e);
        }
    }
}
