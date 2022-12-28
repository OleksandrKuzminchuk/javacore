package com.alexandr.javacore.chapter15;

public class ConstructorRefDemo3 {
    static <R, T> R myClassFactory(MyFunc6<R, T> cons, T v){
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyFunc6<MyClass2<Double>, Double> myClassCons = MyClass2<Double>::new;

        MyClass2<Double> mc = myClassFactory(myClassCons, 100.1);

        System.out.println("The value into object mc is " + mc.getValue());

        MyFunc6<MyClass3, String> myClassCons2 = MyClass3::new;

        MyClass3 mc2 = myClassFactory(myClassCons2, "Lambda");

        System.out.println("The value into object mc2 is " + mc2.getString());

        MyArrayCreator<MyClass4[]> myArrayCreator = MyClass4[]::new;
        MyClass4[] a = myArrayCreator.func(2);
        a[0] = new MyClass4(1);
        a[1] = new MyClass4(2);

        for(MyClass4 myClass4 : a){
            System.out.println(myClass4.getArray());
        }
    }
}
