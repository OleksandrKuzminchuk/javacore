package com.alexandr.javacore.chapter13;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Hypot {
    public static void main(String[] args) {
        double side1, side2;
        double hypot;
        side1 = 3.0;
        side2 = 4.0;

        hypot = sqrt(pow(side1, 2) + pow(side2, 2));
        System.out.println("For a given side length " + side1 + " and " + side2 + " the hypotenuse is " + hypot);
    }
}
