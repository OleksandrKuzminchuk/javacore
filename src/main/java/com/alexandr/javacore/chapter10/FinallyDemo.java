package com.alexandr.javacore.chapter10;

import static com.alexandr.javacore.constants.CustomConstants.CAUGHT_EXCEPTION;

public class FinallyDemo {
    // generate an exception to method
    static void procA(){
        try {
            System.out.println("Inside the body of method procA()");
            throw new RuntimeException("Demonstration");
        }finally {
            System.out.println("The block of operator finally to the method procA()");
        }
    }

    // return control from the block of operator try
    static void procB(){
        try {
            System.out.println("Inside the body of method procB()");
            return;
        }finally {
            System.out.println("The block of operator finally to method procB()");
        }
    }

    // execute the try block as usual
    static void procC(){
        try {
            System.out.println("Inside the body of method procC()");
        }finally {
            System.out.println("The block of operator finally to the method procC()");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        }catch (Exception e){
            System.out.println(CAUGHT_EXCEPTION);
        }
        procB();
        procC();
    }
}
