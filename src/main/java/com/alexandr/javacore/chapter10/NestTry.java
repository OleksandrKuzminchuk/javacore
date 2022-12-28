package com.alexandr.javacore.chapter10;

import static com.alexandr.javacore.constants.CustomConstants.DIVISION_OF_ZERO;

public class NestTry {
    public static void main(String[] args) {
        try {
//            int a = args.length;
            int a = 1;
//            int a = 2;
            int b = 42/a;
            System.out.println("a = " + a);
            try {
                if (a == 1){
                    a = a/(a - a);
                } else if (a == 2) {
                    int c[] = {1};
                    c[42] = 99;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Index behave limit an array");
            }
        }catch (ArithmeticException e){
            System.out.println(DIVISION_OF_ZERO + e);
        }
    }
}
