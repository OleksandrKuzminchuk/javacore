package com.alexandr.javacore.chapter15;

public class MyClass {
    private int value;
    public MyClass(int value) {
        this.value = value;
    }

    private MyClass(){ this.value = 0; }
    public int getValue() {
        return value;
    }
}
