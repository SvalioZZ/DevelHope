package it.develhope.ex_advanced_1.ex_4;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Exercises {
    /**
     * 1:
     *
     *
     * In the main method, create a variable x as a random number between 0-100 using Math.random() * 100;
     *
     * Use a ternary operator to check if x is greater than or equal to 50. If it is, print "x is greater than or equal to 50". If it's not, print "x is less than 50".
     *
     * Experiment with different values of x and observe the output
     */

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }
    
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        double x = Math.random() * 100;
        System.out.println("Value is : " + x + "\n" + (x >= 50 ? "x is greater than or equal to 50" : "x is less than 50"));
    }
    
    /**
     * 2:
     *
     *
     * Create a record called "Person" with fields for name, age and address.
     *
     * Add a toString method to Person to print out the data in a different format
     *
     * Print the record to the console
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        record Person(String name, int age, String address) {
            @Override
            public String toString() {
                return String.format("Name: %s,\nAge: %d,\nAddress: %s", name, age, address);
            }
        }
        
        Person p = new Person("John", 20, "London Avenue, 11");
        System.out.println(p);
    }
    
    /**
     * 3:
     *
     *
     * In the main method, create a BigInteger variable with a large value.
     *
     * Create a BigDecimal variable with a large value
     *
     * Divide the BigInteger by 3 using the divide method and assign the result to a new BigInteger variable
     *
     * Divide the BigDecimal by Math.PI using the divide method and assign the result to a new BigDecimal variable
     *
     * Print the results
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        BigInteger bigInt = new BigInteger("1000000000000");
        BigDecimal bigDecimal = new BigDecimal("0.00000000000034");
        
        
        BigInteger result = bigInt.divide(new BigInteger("3"));
        BigDecimal result2 = bigDecimal.divide(new BigDecimal(Math.PI), 30, RoundingMode.DOWN);
        
    
        System.out.println("Results of ours divisions are: \n" +
                                   "BigInteger: " + result + "\n" +
                                  "BigDecimal: " + result2);
    }
    
}
