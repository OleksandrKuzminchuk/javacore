package com.alexandr.javacore.chapter10;

public class ThrowDemo {
    static void demoProc(){
        try {
            throw new NullPointerException("Demonstration");
        }catch (NullPointerException e){
            System.out.println("The exception caught to the body of method demoProc()");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoProc();
        }catch (NullPointerException e){
            System.out.println("Recapture: " + e);
        }
    }
}
