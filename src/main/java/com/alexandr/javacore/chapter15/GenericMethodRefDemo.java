package com.alexandr.javacore.chapter15;

import java.util.Objects;

public class GenericMethodRefDemo {
    static <T> int myOp(MyFunc3<T> f, T[] vals, T v){
        return f.func(vals, v);
    }
    public static void main(String[] args) {
        Integer[] vals = {1, 2, 3, 4, 2, 3, 4 ,4, 5};
        String[] strs = {"One", "Two", "Three", "Two"};
        int count;

        MyFunc3<Integer> integerMyFunc3 = (vals1, v) -> {
            int counter = 0;
            for (Integer integer : vals1) if (Objects.equals(integer, v)) counter++;
            return counter;
        };

        MyFunc3<String> stringMyFunc3 = (vals1, v) -> {
            int counter = 0;
            for (String s : vals1) if (Objects.equals(s, v)) counter++;
            return counter;
        };


        count = myOp(MyArrayOps::countMatching, vals, 4);
        System.out.println("The array of vals consist: " + count + " number 4");

        count = myOp(integerMyFunc3, vals, 4);
        System.out.println("The array of vals consist: " + count + " number 4");

        count = myOp(MyArrayOps::countMatching, strs, "Two");
        System.out.println("The array of strs consist: " + count + " number Two");

        count = myOp(stringMyFunc3, strs, "Two");
        System.out.println("The array of strs consist: " + count + " number Two");
    }
}
