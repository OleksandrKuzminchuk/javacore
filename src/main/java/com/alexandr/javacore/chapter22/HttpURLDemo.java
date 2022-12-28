package com.alexandr.javacore.chapter22;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpURLDemo {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://google.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        System.out.println("The method of request: " + connection.getRequestMethod());
        System.out.println("The code of response: " + connection.getResponseCode());
        System.out.println("The response of a message: " + connection.getResponseMessage());

        Map<String, List<String>> listMap = connection.getHeaderFields();
        System.out.println("\nNext comes the heading");
        for (Map.Entry<String, List<String>> entry : listMap.entrySet()){
            System.out.println("Key: " + entry.getKey() + " Values: " + entry.getValue());
        }
    }
}
