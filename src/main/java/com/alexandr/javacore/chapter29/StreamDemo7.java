package com.alexandr.javacore.chapter29;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.alexandr.javacore.constants.CustomConstants.TEST_ARRAY_LIST_NAME_PHONE_EMAIL;

public class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = TEST_ARRAY_LIST_NAME_PHONE_EMAIL;

        Stream<NamePhone> nameAndPhone = myList.stream()
                .map(namePhoneEmail -> new NamePhone(namePhoneEmail.name, namePhoneEmail.phoneNumber));

        List<NamePhone> npList = nameAndPhone.collect(Collectors.toList());

        System.out.println("Names and phone numbers to the list type List:");
        for (NamePhone namePhone : npList)
            System.out.println(namePhone.name + " " + namePhone.phoneNumber);

        nameAndPhone = myList.stream()
                .map(namePhoneEmail -> new NamePhone(namePhoneEmail.name, namePhoneEmail.phoneNumber));

        Set<NamePhone> npSet = nameAndPhone.collect(Collectors.toSet());

        System.out.println("\nNames and phone numbers to set type Set:");
        for (NamePhone namePhone : npSet)
            System.out.println(namePhone.name + " " + namePhone.phoneNumber);
        System.out.println();

        LinkedList<NamePhone> namePhoneLinkedList = myList.stream()
                .map(namePhoneEmail -> new NamePhone(namePhoneEmail.name, namePhoneEmail.phoneNumber))
                .collect(LinkedList::new, LinkedList::add, LinkedList::addAll);
        System.out.println("Names and phone numbers to linked list type LinkedList:");
        for (NamePhone namePhone : namePhoneLinkedList)
            System.out.println(namePhone.name + " " + namePhone.phoneNumber);
    }
}
