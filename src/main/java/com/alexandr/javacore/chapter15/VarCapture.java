package com.alexandr.javacore.chapter15;

public class VarCapture {
    public static void main(String[] args) {
        int num = 10;
        MyFunc myLambda = n -> {
            int v = num + n;
//            TODO: num++; ERROR
            return v;
        };
//        TODO: num = 9; ERROR
    }
}
