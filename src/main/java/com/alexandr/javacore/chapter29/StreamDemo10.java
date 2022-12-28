package com.alexandr.javacore.chapter29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

import static com.alexandr.javacore.constants.CustomConstants.TEST_ARRAY_LIST_STRING;

public class StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> myList = TEST_ARRAY_LIST_STRING;

        Stream<String> myStream = myList.stream();

        Spliterator<String> spliterator = myList.spliterator();

        Spliterator<String> spliteratorSplit = spliterator.trySplit();

        if (spliteratorSplit != null){
            System.out.println("Result output by iterator spliteratorSplit: ");
            spliteratorSplit.forEachRemaining(System.out::println);
        }

        System.out.println("\nResult output by iterator spliterator: ");
        spliterator.forEachRemaining(System.out::println);
    }
}
