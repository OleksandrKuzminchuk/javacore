package com.alexandr.javacore.chapter20;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import static com.alexandr.javacore.constants.CustomConstants.RESOURCES_PATH;

public class FileDemo {
    static void p(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File(RESOURCES_PATH + "COPYRIGHT");
        p("Name file: " + f1.getName());
        p("Path: " + f1.getPath());
        p("Absolute path: " + f1.getAbsolutePath());
        p("Parent catalog: " + f1.getParent());
        p(f1.exists() ? "exists" : "not exists");
        p(f1.canWrite() ? "available for recording" : "not available for recording");
        p(f1.canRead() ? "available for reading" : "not available for reading");
        p(f1.isDirectory() ? "is the catalog" : "is not the catalog");
        p(f1.isFile() ? "is the file" : "is not file");
        p(f1.isAbsolute() ? "is absolute" : "is not absolute");
        p("Last modified in the file: " + f1.lastModified());
        p("Size: " + f1.length() + " byte");
    }
}
