package com.alexandr.javacore.chapter15;

public class LambdasAsArgumentsDemo {
    static String stringOp(StringFunc stringFunc, String s){
        return stringFunc.func(s);
    }

    public static void main(String[] args) {
        StringFunc upperCase = s -> s.toUpperCase();
        StringFunc deletePlaceholders = s -> {
            String result = "";
            for (int i = 0; i < s.length(); i++)
                if (s.charAt(i) != ' ')
                    result += s.charAt(i);
            return result;
        };
        StringFunc revers = s -> {
            String result = "";
            for (int i = s.length() - 1; i >= 0; i--)
                result += s.charAt(i);
            return result;
        };
        String inString = "Lambda expressions make Java more efficient";
        String outString;
        System.out.println("Origin the string: " + inString);

        outString = stringOp(upperCase, inString);
        System.out.println("This is a string to upper case: " + outString);

        outString = stringOp(deletePlaceholders, inString);
        System.out.println("This is a string with spaces removed: " + outString);

        System.out.println("This is a string reversed: " + stringOp(revers, inString));
    }
}
