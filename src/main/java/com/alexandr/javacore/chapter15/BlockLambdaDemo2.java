package com.alexandr.javacore.chapter15;

public class BlockLambdaDemo2 {
    public static void main(String[] args) {
        StringFunc reverse = s -> {
            String result = "";
            for (int i = s.length() - 1; i >= 0; i--)
                result += s.charAt(i);
            return result;
        };
        System.out.println("Lambda reverse: " + reverse.func("Lambda"));
        System.out.println("Expression reverse: " + reverse.func("Expression"));
    }
}
