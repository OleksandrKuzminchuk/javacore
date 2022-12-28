package com.alexandr.javacore.chapter15;

public class MyClass2<T> {
    private T value;

    public MyClass2(T value) {
        this.value = value;
    }
    public MyClass2(){ this.value = null; }

    public T getValue() {
        return value;
    }
}
