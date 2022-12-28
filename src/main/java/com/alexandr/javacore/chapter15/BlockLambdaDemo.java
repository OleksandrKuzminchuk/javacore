package com.alexandr.javacore.chapter15;

import java.util.function.Function;

public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc factorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };

        System.out.println("The factorial of the number 3 is " + factorial.func(3));
        System.out.println("The factorial of the number 5 is " + factorial.func(5));

        Function<Integer, Integer> factorialFunction = integer -> {
            int result = 1;
            for (int i = 1; i <= integer; i++)
                result = i * result;
            return result;
        };

        System.out.println("The factorialFunction of the number 3 is " + factorialFunction.apply(3));
        System.out.println("The factorialFunction of the number 5 is " + factorialFunction.apply(5));
    }
}
