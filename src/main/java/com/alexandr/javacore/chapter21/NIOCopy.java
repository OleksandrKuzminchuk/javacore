package com.alexandr.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;

import static com.alexandr.javacore.constants.CustomConstants.*;

public class NIOCopy {
    public static void main(String[] args) {
        try{
            Path source = Paths.get(FILE_TEST_PATH);
            Path target = Paths.get(PACKAGE_TEST_FILE_TEST_PATH);

            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        }catch (InvalidPathException e){
            System.out.println(PATH_ERROR + e);
        }catch (IOException e){
            System.out.println(ERROR_IO + e);
        }
    }
}
