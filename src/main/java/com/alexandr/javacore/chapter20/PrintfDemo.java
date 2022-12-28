package com.alexandr.javacore.chapter20;

public class PrintfDemo {
    public static void main(String[] args) {
        System.out.println("Different integer format");
        System.out.printf("%d %(d %+d %05d\n", 3, -3, 3, 3);

        System.out.println();
        System.out.printf("Floating point number format default: %f\n", 1234567.123);
        System.out.printf("The format of floating point numbers separated by commas: %,f\n", 12345670.123);
        System.out.printf("Default negative floating point format: %,f\n", -1234567.123 );
        System.out.printf("The second format of negative floating-point numbers: %,(f\n", -1234567.123);

        System.out.println();

        System.out.printf("Balancing positive and negative numbers into their values:\n");
        System.out.printf("% ,.2f\n% ,.2f\n", 1234567.12, -1234567.12);
    }
}
