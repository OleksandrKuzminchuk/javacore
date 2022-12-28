package com.alexandr.javacore.chapter29;

import java.util.ArrayList;
import java.util.Optional;

import static com.alexandr.javacore.constants.CustomConstants.TEST_ARRAY_LIST_INTEGER;

public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = TEST_ARRAY_LIST_INTEGER;

        Optional<Integer> productObj = myList.stream().reduce((integer, integer2) -> integer * integer2);
        productObj.ifPresent(integer -> System.out.println("The product, as an object of type Optional :" + integer));

        int product = myList.stream().reduce(2, ((integer, integer2) -> integer * integer2));
        System.out.println("The product, as a value of type int: " + product);

        int evenProduct = myList.stream().reduce(1, ((integer, integer2) -> {
            if(integer2 % 2 == 0) return integer * integer2; else return integer;
        }));
        System.out.println("The product, as a value if type int: " + evenProduct);
    }
}
