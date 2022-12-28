package com.alexandr.javacore.chapter20.serialization;

import java.io.*;

import static com.alexandr.javacore.constants.CustomConstants.*;

public class SerializationDemo {
    public static void main(String[] args) {
        try (ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream(FILE_SERIAL_PATH))){
            MyClass object1 = new MyClass("Hello", 12, 2.75);
            System.out.println("object1: " + object1);

            objectOutputStream.writeObject(object1);
        }catch (IOException e){
            System.out.println(SERIALIZATION_EXCEPTION + e);
        }

        try (ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream(FILE_SERIAL_PATH))){
            MyClass object2 = (MyClass) objectInputStream.readObject();
            System.out.println("object2: " + object2);
        }catch (Exception e){
            System.out.println(DESERIALIZATION_EXCEPTION + e);
            System.exit(0);
        }
    }
}
