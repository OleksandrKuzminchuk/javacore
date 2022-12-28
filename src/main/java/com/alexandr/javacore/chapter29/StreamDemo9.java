package com.alexandr.javacore.chapter29;

import java.util.ArrayList;
import java.util.Set;
import java.util.Spliterator;
import java.util.stream.Stream;

import static com.alexandr.javacore.constants.CustomConstants.TEST_ARRAY_LIST_STRING;

public class StreamDemo9 {
    public static void main(String[] args) {
        ArrayList<String> myList = TEST_ARRAY_LIST_STRING;

        Stream<String> myStream = myList.stream();

        Spliterator<String> spliterator = myStream.spliterator();

//        while (spliterator.tryAdvance(System.out::println));

        System.out.println("===========================================");

        spliterator.forEachRemaining(System.out::println);
    }
}
