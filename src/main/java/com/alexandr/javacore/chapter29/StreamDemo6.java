package com.alexandr.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.IntStream;

import static com.alexandr.javacore.constants.CustomConstants.TEST_ARRAY_LIST_DOUBLE;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<Double> myList = TEST_ARRAY_LIST_DOUBLE;

        System.out.print("Origin values from the list myList: ");
        myList.forEach(aDouble -> System.out.print(aDouble + " "));
        System.out.println();

        IntStream cStrm = myList.stream().mapToInt(value -> (int) Math.ceil(value));
        System.out.print("The maximum allowable limits for values from the list myList: ");
        cStrm.forEach(value -> System.out.print(value + " "));
    }
}
