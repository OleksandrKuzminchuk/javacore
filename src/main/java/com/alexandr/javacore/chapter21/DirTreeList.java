package com.alexandr.javacore.chapter21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static com.alexandr.javacore.constants.CustomConstants.ERROR_IO;
import static com.alexandr.javacore.constants.CustomConstants.JAVACORE_PATH;

public class DirTreeList {
    public static void main(String[] args) {
        String dirName = JAVACORE_PATH;
        try {
            Files.walkFileTree(Paths.get(dirName), new MyFileVisitor());
        }catch (IOException e){
            System.out.println(ERROR_IO + e);
        }
    }
}
