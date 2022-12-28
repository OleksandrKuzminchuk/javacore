package com.alexandr.javacore.chapter29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

import static com.alexandr.javacore.constants.CustomConstants.TEST_ARRAY_LIST_STRING;

public class StreamDemo8 {
    public static void main(String[] args) {
        ArrayList<String> myList = TEST_ARRAY_LIST_STRING;

        Stream<String> myStream = myList.stream();

        Iterator<String> iterator = myStream.iterator();

        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
