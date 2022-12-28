package com.alexandr.javacore.chapter10;

import static com.alexandr.javacore.constants.CustomConstants.CAUGHT_EXCEPTION;

public class ExceptionDemo {
    static void compute(int a) throws MyException{
        System.out.println("Called the method compute(" + a + ")");
        if (a > 10){
            throw new MyException(a);
        }
        System.out.println("Normal termination");
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        }catch (MyException e){
            System.out.println(CAUGHT_EXCEPTION + e);
        }
    }
}
