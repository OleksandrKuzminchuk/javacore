package com.alexandr.javacore.chapter10;

import static com.alexandr.javacore.constants.CustomConstants.DIVISION_OF_ZERO;

public class Exc2 {
    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            a = 42/d;
            System.out.println("This block won't be show");
        }catch (ArithmeticException e){
            System.out.println(DIVISION_OF_ZERO);
        }
        System.out.println("After the operator catch");
    }
}
