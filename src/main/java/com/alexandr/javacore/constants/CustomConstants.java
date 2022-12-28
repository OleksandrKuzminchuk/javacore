package com.alexandr.javacore.constants;

import com.alexandr.javacore.chapter15.HighTemp;
import com.alexandr.javacore.chapter29.NamePhoneEmail;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public final class CustomConstants {
    public static final String ERROR_IO = "Error input-output";
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static final String RESOURCES_PATH = "C:\\Users\\Kuzminchuk_Alexandr\\IdeaProjects\\javacore\\src\\main\\resources\\";
    public static final String NOT_FOUND_FILE = "Can not open a file";
    public static final String JAVACORE_PATH = "C:\\Users\\Kuzminchuk_Alexandr\\IdeaProjects\\javacore\\";
    public static final String STILL_AVAILABLE = "\nStill available";
    public static final String TEST_TEXT = "Now is the time for all good men\n" +
            " to come to the aid of their country\n" +
            " and pay their due taxes.";
    public static final String CAUGHT_EXCEPTION = "Caught the exception: ";
    public static final String DIVISION_OF_ZERO = "Division of zero";
    public static final String FILE_1_PATH = RESOURCES_PATH + "file1.txt";
    public static final String FILE_2_PATH = RESOURCES_PATH + "file2.txt";
    public static final String FILE_3_PATH = RESOURCES_PATH + "file3.txt";
    public static final String FILE_TEST_PATH = RESOURCES_PATH + "test.txt";
    public static final String FILE_TEST_2_PATH = RESOURCES_PATH + "test2.dat";
    public static final String FILE_TEST_3_NO_EXISTS_PATH = RESOURCES_PATH + "test3.txt";
    public static final String FILE_TEST_4_EMPTY_PATH = RESOURCES_PATH + "test4.txt";
    public static final String FILE_SERIAL_PATH = "C:\\Users\\Kuzminchuk_Alexandr\\IdeaProjects\\javacore\\src\\main\\resources\\serial.txt";
    public static final String SERIALIZATION_EXCEPTION = "Serialization Exception";
    public static final String DESERIALIZATION_EXCEPTION = "Deserialization Exception";
    public static final String PATH_ERROR = "Path error: ";
    public static final String CAPACITY_ERROR = "The value - 'capacity' in the method ByteBuffer.allocate(capacity) is low";
    public static final String PACKAGE_TEST_FILE_TEST_PATH = "C:\\Users\\Kuzminchuk_Alexandr\\IdeaProjects\\javacore\\src\\main\\java\\com\\alexandr\\javacore\\test\\test.txt";
    public static final String DOES_NOT_THE_CATALOG = " does not the catalog";
    public static final String ERROR_CLOSE_CHANNEL = ERROR_IO + " close channel";
    public static final String ERROR_CLOSE_THE_FILE = ERROR_IO + " close the file";
    public static final HighTemp[] TEST_ARRAY_WEEK_DAY_HIGHS_TEMP = {
            new HighTemp(89), new HighTemp(90), new HighTemp(78), new HighTemp(87), new HighTemp(45),
            new HighTemp(65), new HighTemp(44), new HighTemp(77), new HighTemp(63), new HighTemp(96)
    };

    public static final HighTemp[] TEST_2_ARRAY_WEEK_DAY_HIGHS_TEMP = {
            new HighTemp(32), new HighTemp(19), new HighTemp(12), new HighTemp(27), new HighTemp(35),
            new HighTemp(24), new HighTemp(-1), new HighTemp(17), new HighTemp(23), new HighTemp(26)
    };
    public static final ArrayList<Integer> TEST_ARRAY_LIST_INTEGER = new ArrayList<>(asList(3, 8, 45, 12, 63, 78, 360));
    public static final ArrayList<Double> TEST_ARRAY_LIST_DOUBLE = new ArrayList<>(asList(3.0, 8.0, 45.0, 12.0, 63.0, 78.0));
    public static final ArrayList<String> TEST_ARRAY_LIST_STRING = new ArrayList<>(asList("Alfa", "Beta", "Gamma", "Delta", "Xi", "Omega"));
    public static final ArrayList<NamePhoneEmail> TEST_ARRAY_LIST_NAME_PHONE_EMAIL = new ArrayList<>(asList(
            new NamePhoneEmail("Larry", "555-5555", "Larry@gmail.com"),
            new NamePhoneEmail("Jams", "555-4444", "Jams@gmail.com"),
            new NamePhoneEmail("Marry", "555-3333", "Marry@gmail.com")));
}

