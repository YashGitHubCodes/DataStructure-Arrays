package com.main;

import com.main.exception.MyCustomException;

import static com.main.util.Util.*;

public class ShiftArrays {
    public static void main(String[] args) {

        try {
            // Generate a random array of integers and log the array
            int[] randomArray = getRandomIntegerValueArray();
            log(randomArray);

            // Prompt the user for shift type and display options
            log("To right shift Insert 1 ");
            log("To left shift Insert 2 ");

            // Read the shift type from user input (1 for right shift, 2 for left shift)
            int shiftType = getScanner().nextInt();

            // Ask the user how many rotations they want to perform
            log("Enter number of rotations you expect?");
            int numberOfRotations = getScanner().nextInt();

            // Perform the selected shift operation
            if (shiftType == 1) {
                shiftRight(randomArray, numberOfRotations);  // Shift array to the right
            } else if (shiftType == 2) {
                shiftLeft(randomArray, numberOfRotations);  // Shift array to the left
            } else {
                // If invalid input is given, throw a custom exception
                throw new MyCustomException("Exception : Either enter 1 or 2 ");
            }

        } catch (Exception e) {
            // Catch any exception and log the error message
            log(e.getMessage());
        }
    }

    // Method to perform left shift on the array for a specified number of rotations
    private static void shiftLeft(int[] randomArray, int numberOfRotations) {

        // Log the start of the left shift operation
        log("Inside method shiftLeft");

        // Loop through each rotation
        for (int j = 0; j < numberOfRotations; j++) {
            // Store the value of the first element, as it will be moved
            int firstIndexValue = randomArray[0];

            // Shift all elements one position to the left
            for (int i = 1; i <= randomArray.length - 1; i++) {
                randomArray[i - 1] = randomArray[i];  // Shift element left by one position
            }

            // Move the first element to the last position
            randomArray[randomArray.length - 1] = firstIndexValue;
        }

        // Log the array after shifting
        log(randomArray);
    }

    // Method to perform right shift on the array for a specified number of rotations
    private static void shiftRight(int[] randomArray, int numberOfRotations) {

        // Log the start of the right shift operation
        log("Inside method shiftRight");

        // Loop through each rotation
        for (int j = 0; j < numberOfRotations; j++) {
            // Store the value of the last element, as it will be moved
            int lastIndexValue = randomArray[randomArray.length - 1];

            // Shift all elements one position to the right
            for (int i = randomArray.length - 1; i > 0; i--) {
                randomArray[i] = randomArray[i - 1];  // Shift element right by one position
            }

            // Move the last element to the first position
            randomArray[0] = lastIndexValue;
        }

        // Log the array after shifting
        log(randomArray);
    }
}
