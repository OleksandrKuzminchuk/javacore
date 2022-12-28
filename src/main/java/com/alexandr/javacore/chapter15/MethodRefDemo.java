package com.alexandr.javacore.chapter15;

import static com.alexandr.javacore.constants.CustomConstants.TEST_TEXT;

public class MethodRefDemo {
    static String stringOp(StringFunc stringFunc, String s){
        return stringFunc.func(s);
    }

    public static void main(String[] args) {
        String intStr = TEST_TEXT;
        String outStr;
        MyStringOps myStringOps = new MyStringOps();
//        outStr = stringOp(MyStringOps::stringReverse, intStr);
        outStr = stringOp(myStringOps::stringReverse, intStr);
        System.out.println("Origin the string: " + intStr);
        System.out.println("Reversed string: " + outStr);
    }
}
