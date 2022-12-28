package com.alexandr.javacore.chapter13;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = new String[100];
        System.out.println("Put the strings of text");
        System.out.println("Put 'stop' for finish");
        for (int i = 0; i < 100; i++){
            strings[i] = bufferedReader.readLine();
            if (strings[i].equals("stop")) break;
        }
        System.out.println("\nConsist your file: ");
        for (int i = 0; i < 100; i++){
            if (strings[i].equals("stop")) break;
            System.out.println(strings[i]);
        }
    }
}
