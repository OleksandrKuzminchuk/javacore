package com.alexandr.javacore.chapter15;

public class LambdaDemo3 {
    public static void main(String[] args) {
        NumericTest2 isFactor = (n, d) -> (n % d) == 0;
        if (isFactor.test(10, 2)) System.out.println("The number 2 is factor the number 10");
        if (!isFactor.test(10, 3)) System.out.println("The number 3 is not factor the number 10");
    }
}
