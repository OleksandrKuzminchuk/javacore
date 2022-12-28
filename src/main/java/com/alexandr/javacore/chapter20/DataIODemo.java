package com.alexandr.javacore.chapter20;

import java.io.*;

import static com.alexandr.javacore.constants.CustomConstants.*;

public class DataIODemo {
    public static void main(String[] args) {
        try(DataOutputStream outputStream =
                    new DataOutputStream(new FileOutputStream(FILE_TEST_2_PATH))){
            outputStream.writeDouble(52.2);
            outputStream.writeInt(45);
            outputStream.writeBoolean(true);
        }catch (FileNotFoundException e){
            System.out.println(NOT_FOUND_FILE);
        }catch (IOException e){
            System.out.println(ERROR_IO + e);
        }

        try (DataInputStream inputStream =
                new DataInputStream(new FileInputStream(FILE_TEST_2_PATH))){
            double d = inputStream.readDouble();
            int i = inputStream.readInt();
            boolean b = inputStream.readBoolean();

            System.out.println("Received values: " + d + " " + i + " " + b);
        }catch (FileNotFoundException e){
            System.out.println(NOT_FOUND_FILE);
        }catch (IOException e){
            System.out.println(ERROR_IO + e);
        }
    }
}
