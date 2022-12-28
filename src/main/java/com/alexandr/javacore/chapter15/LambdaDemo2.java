package com.alexandr.javacore.chapter15;

public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest isEven = n -> (n % 2) == 0;

        if (isEven.test(10)) System.out.println("The number 10 is even");
        if (!isEven.test(9)) System.out.println("The number 9 is uneven");

        NumericTest isNonNeg = n -> n >= 0;

        if (isNonNeg.test(1)) System.out.println("The number 1 is not negative");
        if (!isNonNeg.test(-1)) System.out.println("The number -1 is negative");
    }
}