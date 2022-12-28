package com.alexandr.javacore.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        System.out.println("Put the string of text");
        System.out.println("Put 'stop' for finish");
        do {
            s = bufferedReader.readLine();
            System.out.println(s);
        }while (!s.equals("stop"));
    }
}
