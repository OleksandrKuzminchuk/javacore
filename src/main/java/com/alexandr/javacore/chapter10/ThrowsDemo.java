package com.alexandr.javacore.chapter10;

import static com.alexandr.javacore.constants.CustomConstants.CAUGHT_EXCEPTION;

public class ThrowsDemo {
    static void throwOne() throws IllegalArgumentException {
        System.out.println("Inside the body of method throwOne()");
        throw new IllegalArgumentException("Demonstration");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        }catch (IllegalArgumentException e){
            System.out.println(CAUGHT_EXCEPTION + e);
        }
    }
}
