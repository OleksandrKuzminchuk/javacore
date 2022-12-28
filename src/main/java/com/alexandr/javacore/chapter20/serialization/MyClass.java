package com.alexandr.javacore.chapter20.serialization;

import java.io.Serializable;

public class MyClass implements Serializable {
    String string;
    transient int anInt;
    double aDouble;

    public MyClass(String string, int anInt, double aDouble) {
        this.string = string;
        this.anInt = anInt;
        this.aDouble = aDouble;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "string='" + string + '\'' +
                ", anInt=" + anInt +
                ", aDouble=" + aDouble +
                '}';
    }
}
