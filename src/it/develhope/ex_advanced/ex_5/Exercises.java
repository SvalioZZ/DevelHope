package it.develhope.ex_advanced.ex_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }
    
    /**
     * 1: Uncomment the Files.createFile() line below and write a try catch block that
     *    prints its stack trace
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        // Your code here
        Path path = Path.of("file.txt");
        try {
            Files.deleteIfExists(path);
            Files.createFile(path);
            Files.write(path, "Bella Fratello!".getBytes());
            System.out.println(Files.readAllLines(path, Charset.defaultCharset()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    /**
     * 2:
     *
     * Write a try-catch block that attempts to open a file
     *
     * In the catch block, print a message that informs the user that the file could not be found.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        try {
            String userInputFileName = "test-file.txt";
            FileReader reader = new FileReader(userInputFileName);
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
    
    /**
     * 3:
     *
     * Write a try-catch block that attempts to parse a string as an integer.
     *
     * In the catch block, print a message that informs the user that the input was not a valid integer.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        try {
            Integer.parseInt("house");
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    /**
     * 4:
     *
     * Write a try block that around this print statement that attempts to divide 2 numbers
     *
     * Create multiple catch blocks that catch different types of exceptions, such as NumberFormatException and DivideByZeroException.
     *
     * In each catch block, print a message that informs the user of the specific exception that was caught and why it occurred.
     *
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        
        int num1 = 10;
        String num2AsString = "0";
        try{
        System.out.println(num1/Integer.parseInt(num2AsString));
            // Your catch blocks here
        } catch (NumberFormatException e) {
            System.out.println("Number format exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e.getMessage());
        }
        
    }
}
