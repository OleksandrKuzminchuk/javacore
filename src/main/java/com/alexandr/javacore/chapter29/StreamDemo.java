package com.alexandr.javacore.chapter29;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

import static com.alexandr.javacore.constants.CustomConstants.TEST_ARRAY_LIST_INTEGER;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = TEST_ARRAY_LIST_INTEGER;

        System.out.println("Origin the list: " + myList);

        Stream<Integer> myStream = myList.stream();

        Optional<Integer> minValue = myStream.min(Integer::compareTo);
        minValue.ifPresent(integer -> System.out.println("Min value: " + integer));

        myStream = myList.stream();
        Optional<Integer> maxValue = myStream.max(Integer::compareTo);
        maxValue.ifPresent(integer -> System.out.println("Max vaulue: " + integer));

        Stream<Integer> sortedStream = myList.stream().sorted();
        System.out.print("Sorted stream: ");
        sortedStream.forEach(integer -> System.out.print(integer + " "));
        System.out.println();

        Stream<Integer> oddValues = myList.stream().filter(integer -> (integer % 2) == 1);
        System.out.print("Odd values: ");
        oddValues.forEach(integer -> System.out.print(integer + " "));
        System.out.println();

        oddValues = myList.stream().filter(integer -> (integer % 2) == 1)
                .filter(integer -> integer > 5);
        System.out.print("Odd values > 5: ");
        oddValues.forEach(integer -> System.out.print(integer + " "));
        System.out.println();
    }
}
