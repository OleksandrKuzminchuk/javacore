package com.alexandr.javacore.chapter22;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class UCDemo {
    public static void main(String[] args) throws Exception {
        int c;
        URL url = new URL("https://habr.com/ru/post/235585/");
        URLConnection connection = url.openConnection();

        long date = connection.getDate();
        if (date == 0){
            System.out.println("No date");
        }else {
            System.out.println("Date: " + date);
        }

        System.out.println("Content type: " + connection.getContentType());

        date = connection.getExpiration();
        if (date == 0){
            System.out.println("No content");
        }else {
            System.out.println("Expiration: " + date);
        }

        date = connection.getLastModified();
        if (date == 0){
            System.out.println("No content");
        }else {
            System.out.println("Last modified: " + date);
        }

        long length = connection.getContentLength();
        if (length == -1){
            System.out.println("No content");
        }else {
            System.out.println("The length of the content: " + length);
        }

        if (length != 0){
            System.out.println("====Content=====");
            InputStream inputStream = connection.getInputStream();
            while ((c = inputStream.read()) == -1){
                System.out.print((char) c);
            }
            inputStream.close();
        }else {
            System.out.println("Content does not access");
        }
    }
}
