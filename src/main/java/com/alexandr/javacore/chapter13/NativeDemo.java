package com.alexandr.javacore.chapter13;

public class NativeDemo {
    int i;

    public static void main(String[] args) {
        NativeDemo ob = new NativeDemo();
        ob.i = 10;

        System.out.println("The contents of the variable ob.i before calling\n" +
                "platform of the oriented method: " + ob.i);
        ob.test();
        System.out.println("The contents of the variable ob.i after called\n" +
                "platform of the oriented method: " + ob.i);
    }

    public native void test();

    static {
        System.loadLibrary("NativeDemo");
    }
}
