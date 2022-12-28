package com.alexandr.javacore.chapter20;

import java.io.File;
import java.io.FilenameFilter;

import static com.alexandr.javacore.constants.CustomConstants.RESOURCES_PATH;

public class DirListOnly {
    public static void main(String[] args) {
        String dirname = RESOURCES_PATH;
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyExt("html");
        String[] strings = f1.list(only);

        for (int i = 0; i < strings.length; i++){
            System.out.println(strings[i]);
        }
    }
}
