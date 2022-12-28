package com.alexandr.javacore.chapter21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

import static com.alexandr.javacore.constants.CustomConstants.ERROR_IO;
import static com.alexandr.javacore.constants.CustomConstants.FILE_TEST_PATH;

public class PathDemo {
    public static void main(String[] args) {
        Path filePath = Paths.get(FILE_TEST_PATH);

        System.out.println("Name the file: " + filePath.getFileName());
        System.out.println("Path the file: " + filePath.getRoot());
        System.out.println("Absolutely path the file: " + filePath.toAbsolutePath());
        System.out.println("Parent catalog: " + filePath.getParent());
        if (Files.exists(filePath)){
            System.out.println("The file exists");
        }else {
            System.out.println("The file not exists");
        }

        try {
            if (Files.isHidden(filePath)){
                System.out.println("The file is hidden");
            }else {
                System.out.println("The file is not hidden");
            }
        }catch (IOException e){
            System.out.println(ERROR_IO + e);
        }

        Files.isWritable(filePath);
        System.out.println("The file is writable");

        Files.isReadable(filePath);
        System.out.println("The file is readable");

        try{
            BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);

            if (attributes.isDirectory()){
                System.out.println("It is catalog");
            }else {
                System.out.println("It is not catalog");
            }

            if (attributes.isRegularFile()){
                System.out.println("It is basic file");
            }else {
                System.out.println("It is not basic file");
            }

            if (attributes.isSymbolicLink()){
                System.out.println("It is symbol link");
            }else {
                System.out.println("It is not symbol link");
            }

            System.out.println("Last modified time: " + attributes.lastModifiedTime());
            System.out.println("The file is size: " + attributes.size());
        }catch (IOException e){
            System.out.println(ERROR_IO + e);
        }
    }
}
