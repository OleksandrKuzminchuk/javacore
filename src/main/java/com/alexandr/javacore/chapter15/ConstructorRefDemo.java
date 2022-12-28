package com.alexandr.javacore.chapter15;

public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc4 myClassCons = MyClass::new;
        MyClass mc = myClassCons.func(100);

        System.out.println("The value into object mc is " + mc.getValue());
    }
}
