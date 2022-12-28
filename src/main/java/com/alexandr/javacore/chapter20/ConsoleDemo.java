package com.alexandr.javacore.chapter20;

import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        String string;
        Console console;

        console = System.console();
        if (console == null) return;

        string = console.readLine("Enter the string: ");
        console.printf("The string you entered: %s\n", string);
    }
}
