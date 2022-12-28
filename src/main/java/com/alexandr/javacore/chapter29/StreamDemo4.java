package com.alexandr.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

import static com.alexandr.javacore.constants.CustomConstants.TEST_ARRAY_LIST_DOUBLE;

public class StreamDemo4 {
    public static void main(String[] args) {
        ArrayList<Double> myList = TEST_ARRAY_LIST_DOUBLE;

        Stream<Double> sqrtRootStrm = myList.stream().map(Math::sqrt);

        double productOfSqrtRoots = sqrtRootStrm.reduce(1.0, (aDouble, aDouble2) -> aDouble * aDouble2);

        System.out.println("The product of sqrt roots are " + productOfSqrtRoots);
    }
}
