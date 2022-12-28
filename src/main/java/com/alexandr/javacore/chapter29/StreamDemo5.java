package com.alexandr.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

import static com.alexandr.javacore.constants.CustomConstants.TEST_ARRAY_LIST_NAME_PHONE_EMAIL;
import static java.util.Arrays.asList;

public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = TEST_ARRAY_LIST_NAME_PHONE_EMAIL;

        System.out.println("Origin elements from the list of myList: ");
        myList.forEach(namePhoneEmail ->
                System.out.println(namePhoneEmail.name + " " + namePhoneEmail.phoneNumber + " " + namePhoneEmail.email));
        System.out.println();

        Stream<NamePhone> nameAndPhone = myList.stream()
                .map(namePhoneEmail -> new NamePhone(namePhoneEmail.name, namePhoneEmail.phoneNumber));
        System.out.println("The List of names and phone numbers: ");
        nameAndPhone.forEach(namePhone ->
                System.out.println(namePhone.name + " " + namePhone.phoneNumber));
        System.out.println();

        myList.stream()
                .filter(namePhoneEmail -> namePhoneEmail.name.equals("Jams"))
                .map(namePhoneEmail -> new NamePhone(namePhoneEmail.name, namePhoneEmail.phoneNumber))
                .forEach(namePhone -> System.out.println("Filtered: " + namePhone.name + " " + namePhone.phoneNumber));
    }
}
