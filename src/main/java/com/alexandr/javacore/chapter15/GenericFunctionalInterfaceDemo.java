package com.alexandr.javacore.chapter15;

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        SomeFunc<String> reverse = s -> {
            String result = "";
            for (int i = s.length() - 1; i >= 0; i--)
                result += s.charAt(i);
            return result;
        };
        System.out.println("Lambda reverse: " + reverse.func("Lambda"));
        System.out.println("Expression reverse: " + reverse.func("Expression"));

        SomeFunc<Integer> factorial = integer -> {
            int result = 1;
            for (int i = 1; i <= integer; i++)
                result = i * result;
            return result;
        };
        System.out.println("The factorial of the number 3 equals " + factorial.func(3));
        System.out.println("The factorial of the number 5 equals " + factorial.func(5));
    }
}
