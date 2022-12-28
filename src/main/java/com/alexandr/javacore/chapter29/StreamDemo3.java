package com.alexandr.javacore.chapter29;

import java.util.ArrayList;

import static com.alexandr.javacore.constants.CustomConstants.TEST_ARRAY_LIST_DOUBLE;

public class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<Double> myList = TEST_ARRAY_LIST_DOUBLE;

        double productOfSqrRoots =
                myList.parallelStream().reduce(1.0, ((aDouble, aDouble2) -> aDouble * Math.sqrt(aDouble2)),
                        ((aDouble, aDouble2) -> aDouble * aDouble2));
        System.out.println("The product of sqrt: " + productOfSqrRoots);
    }
}
