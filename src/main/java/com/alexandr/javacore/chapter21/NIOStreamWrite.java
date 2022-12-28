package com.alexandr.javacore.chapter21;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import static com.alexandr.javacore.constants.CustomConstants.*;

public class NIOStreamWrite {
    public static void main(String[] args) {
        try (OutputStream outputStream = new BufferedOutputStream(
                Files.newOutputStream(Paths.get(FILE_TEST_3_NO_EXISTS_PATH), StandardOpenOption.CREATE))){
            for (int i = 0; i < 26; i++){
                outputStream.write((byte) ('A' + i));
            }
        }catch (InvalidPathException e){
            System.out.println(PATH_ERROR + e);
        }catch (IOException e){
            System.out.println(ERROR_IO + e);
        }
    }
}
