package com.alexandr.javacore.chapter10;

import static com.alexandr.javacore.constants.CustomConstants.CAUGHT_EXCEPTION;

public class ChainExcDemo {
    static  void  demoProc(){
        NullPointerException exception = new NullPointerException("High level");

        exception.initCause(new ArithmeticException("Cause"));

        throw exception;
    }

    public static void main(String[] args) {
        try {
            demoProc();
        }catch (NullPointerException e){
            System.out.println(CAUGHT_EXCEPTION + e);

            System.out.println("Prime cause: " + e.getCause());
        }
    }
}
