package com.main.util;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Util {

    // Constants for the range of random numbers
    private static final int MIN = 10;
    private static final int MAX = 50;

    // Method to generate a random integer between MIN and MAX (exclusive of MAX)
    public static int getRandomNumber() {
        return ThreadLocalRandom.current().nextInt(MIN, MAX);
    }

    // Method to return an array of random integers
    public static int[] getRandomIntegerValueArray() {

        // Creating an array with 8 random integers
        int randomArray[] = {getRandomNumber(), getRandomNumber(), getRandomNumber(), getRandomNumber(),
                getRandomNumber(), getRandomNumber(), getRandomNumber(), getRandomNumber()};
        return randomArray;
    }

    // Method to return a pre-sorted array of integers
    public static int[] getSortedIntegerArray() {
        // A pre-sorted array of integers
        int sortedArray[] = {1, 2, 4, 6, 8, 9, 22, 45, 65, 78, 89, 99, 243, 465, 557, 6876, 7978};
        return sortedArray;
    }

    // Method to return a Scanner instance for taking user input
    public static Scanner getScanner() {
        // Creating and returning a new Scanner object for reading input
        Scanner sc = new Scanner(System.in);
        return sc;
    }

    // Method to log a string message to the console
    public static void log(String logs) {
        // Prints the provided log message to the console
        System.out.println(logs);
    }

    // Method to log an array of integers to the console
    public static void log(int[] array) {
        // Printing a header message for random values
        System.out.println("Random Values are: ");

        // Using Java 8 streams to print all elements of the array
        Arrays.stream(array).forEach(i -> System.out.print(i + " "));
        System.out.println(); // New line after printing all values
    }

    // Method to return an array of random strings
    public static String[] getRandomStringValueArray() {

        // A predefined array of random strings, with null values included
        String randomStringArray[] = {"Yash", "Dhawal", "Rushi", "Raj", "Sandesh", "Pawan", "Alique", null, null};
        return randomStringArray;
    }

}
