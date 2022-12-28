package com.alexandr.javacore.chapter20;

import java.io.ByteArrayInputStream;

import static com.alexandr.javacore.constants.CustomConstants.ALPHABET;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String tmp = ALPHABET;
        byte[] b = tmp.getBytes();

        ByteArrayInputStream inputStream1 = new ByteArrayInputStream(b);
        ByteArrayInputStream inputStream2 = new ByteArrayInputStream(b, 0, 3);
    }
}
