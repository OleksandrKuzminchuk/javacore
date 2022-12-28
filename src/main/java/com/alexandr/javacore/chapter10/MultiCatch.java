package com.alexandr.javacore.chapter10;

import static com.alexandr.javacore.constants.CustomConstants.CAUGHT_EXCEPTION;

public class MultiCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int values[] = {1, 2, 3};

        try {
//            int result = a/b;
            values[10] = 19;
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(CAUGHT_EXCEPTION + e);
        }
        System.out.println("After multi caught");
    }
}
