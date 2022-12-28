package com.alexandr.javacore.chapter15;

public class MyStringOps {

//    static String stringReverse(String s){
//        String result = "";
//        for (int i = s.length() -1; i >= 0; i--)
//            result += s.charAt(i);
//        return result;
//    }
     String stringReverse(String s){
        String result = "";
        for (int i = s.length() -1; i >= 0; i--)
            result += s.charAt(i);
        return result;
    }
}
