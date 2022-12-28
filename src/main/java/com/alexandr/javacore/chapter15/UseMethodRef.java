package com.alexandr.javacore.chapter15;

import java.util.ArrayList;
import java.util.Collections;

public class UseMethodRef {
    static int compareMC(MyClass a, MyClass b){
        return a.getValue() - b.getValue();
    }

    public static void main(String[] args) {
        ArrayList<MyClass> arrayList = new ArrayList<>();
        arrayList.add(new MyClass(1));
        arrayList.add(new MyClass(4));
        arrayList.add(new MyClass(2));
        arrayList.add(new MyClass(9));
        arrayList.add(new MyClass(3));
        arrayList.add(new MyClass(7));

        MyClass maxValue = Collections.max(arrayList, UseMethodRef::compareMC);
        System.out.println("The maximum value is " + maxValue.getValue());
    }
}
