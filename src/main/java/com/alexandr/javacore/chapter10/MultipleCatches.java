package com.alexandr.javacore.chapter10;

import static com.alexandr.javacore.constants.CustomConstants.DIVISION_OF_ZERO;

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42/a;
            int c[] = {1};
            c[42] = 99;
        }catch (ArithmeticException e){
            System.out.println(DIVISION_OF_ZERO + e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The mistake of index behave limit array: " + e);
        }
        System.out.println("After bloke operators try/catch");
    }
}
