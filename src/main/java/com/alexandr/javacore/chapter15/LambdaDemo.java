package com.alexandr.javacore.chapter15;

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNumber;

        myNumber = () -> 123.45;
        System.out.println("Fix values: " + myNumber.getValue());

        myNumber = () -> Math.random() * 100;
        System.out.println("Random a value: " + myNumber.getValue());
        System.out.println("One more a random value: " + myNumber.getValue());

//        myNumber = () -> "123.03"; ERROR

    }
}
