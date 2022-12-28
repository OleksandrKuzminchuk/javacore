package com.alexandr.javacore.chapter20;

import java.io.CharArrayReader;
import java.io.IOException;

import static com.alexandr.javacore.constants.CustomConstants.*;

public class CharArrayReaderDemo {
    public static void main(String[] args) {
        String tmp = ALPHABET;
        int length = tmp.length();
        char[] chars = new char[length];

        tmp.getChars(0, length, chars, 0);
        int i;

        try (CharArrayReader charArrayReader1 = new CharArrayReader(chars)){
            System.out.println("charArrayReader1:");
            while ((i = charArrayReader1.read()) != -1){
                System.out.print((char) i);
            }
            System.out.println();
        }catch (IOException e){
            System.out.println(CAUGHT_EXCEPTION + e);
        }

        try (CharArrayReader charArrayReader2 = new CharArrayReader(chars, 0, 5)){
            System.out.println("charArrayReader2:");
            while ((i = charArrayReader2.read()) != -1){
                System.out.print((char) i);
            }
            System.out.println();
        }catch (IOException e){
            System.out.println(ERROR_IO + e);
        }
    }
}
