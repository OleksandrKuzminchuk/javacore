package com.alexandr.javacore.chapter10;

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42/a;
        }catch (Exception e){
            System.out.println("Catching general class exceptions Exception");
        }
//        catch (ArithmeticException e){
//            System.out.println("This code isn't reachable at all");
//        }
    }
}
