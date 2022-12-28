package com.alexandr.javacore.chapter13.instance0f;

public class InstanceOf {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        if (a instanceof A)
            System.out.println("a is an instanceof A");
        if (b instanceof B)
            System.out.println("b is an instanceof B");
        if (c instanceof C)
            System.out.println("c is an instanceof C");
        if (c instanceof A)
            System.out.println("c can be cast to type A");

        System.out.println("====================================");

        A ob;

        ob = d;
        System.out.println("ob now refers to d");
        if (ob instanceof D)
            System.out.println("ob is an instanceof D");

        System.out.println("=====================================");

        ob = c;
        System.out.println("ob now refers to c");

        if (ob instanceof D){
            System.out.println("ob can be cast to type D");
        }else {
            System.out.println("ob can not cast to type D");
        }

        if (ob instanceof A)
            System.out.println("ob can be cast to type A");

        System.out.println("==================================");

        if (a instanceof Object)
            System.out.println("a can be cast to type Object");
        if (b instanceof Object)
            System.out.println("b can be cast to type Object");
        if (c instanceof Object)
            System.out.println("c can be cast to type Object");
        if (d instanceof Object)
            System.out.println("d can be cast to type Object");
    }
}
