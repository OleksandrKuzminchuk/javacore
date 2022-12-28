package com.alexandr.javacore.chapter13;

public class MyClass {
    int a;
    int b;

    public MyClass(int i, int j) {
        this.a = i;
        this.b = j;
    }

    public MyClass(int i){
        this(i, i);
    }

    public MyClass(){
        this(0);
    }
}
