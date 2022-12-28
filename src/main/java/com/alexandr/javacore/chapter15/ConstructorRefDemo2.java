package com.alexandr.javacore.chapter15;

public class ConstructorRefDemo2 {
    public static void main(String[] args) {
        MyFunc5<Integer> myClassCons = MyClass2<Integer>::new;

        MyClass2<Integer> mc = myClassCons.func(100);

        System.out.println("The value into object mc is " + mc.getValue());
    }
}
