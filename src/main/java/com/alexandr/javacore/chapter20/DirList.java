package com.alexandr.javacore.chapter20;

import java.io.File;

import static com.alexandr.javacore.constants.CustomConstants.JAVACORE_PATH;

public class DirList {
    public static void main(String[] args) {
        String dirName = JAVACORE_PATH;
        File f1 = new File(dirName);
        if (f1.isDirectory()){
            System.out.println("Catalog: " + dirName);
            String[] arrayDirectories = f1.list();
            for (int i = 0; i < arrayDirectories.length; i++){
                File file = new File(dirName + "/" + arrayDirectories[i]);
                if (file.isDirectory()){
                    System.out.println(arrayDirectories[i] + " is catalog");
                }else {
                    System.out.println(arrayDirectories[i] + " is file");
                }
            }
        }else {
            System.out.println(dirName + " is not catalog");
        }
    }
}
