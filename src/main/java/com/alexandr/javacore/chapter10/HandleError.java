package com.alexandr.javacore.chapter10;

import java.util.Random;

import static com.alexandr.javacore.constants.CustomConstants.CAUGHT_EXCEPTION;

public class HandleError {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Random random = new Random();
        for (int i = 0; i < 32000; i++){
            try {
                b = random.nextInt();
                c = random.nextInt();
                a = 12345 / (b/c);
            }catch (ArithmeticException e){
                System.out.println(CAUGHT_EXCEPTION + e);
                a = 0;                                  //ToDo: assign zero and go on work
            }
            System.out.println("a: " + a);
        }
    }
}
