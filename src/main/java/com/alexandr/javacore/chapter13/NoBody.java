package com.alexandr.javacore.chapter13;

public class NoBody {
    public static void main(String[] args) {
        int a = 10;

        for (int i = 0; i < 20; i++){
            if (a < i) {
                System.out.println(i);
                return;
            }
        }

        System.out.println("can't show result");
    }
}
