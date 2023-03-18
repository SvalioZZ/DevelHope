package it.develhope.ex_advanced_1.ex_3;

public class Exercises {
    
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }
    /**
     * 1:
     *
     *
     * Create a class called "Person" with fields for name, age, and address.
     *
     * Override the `toString()` method in the Person class to display the object's name, age, and address in a user-friendly format.
     *
     * Create instances of the Person class and print them using the overridden `toString()` method.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Person p1 = new Person("Pippo Franco", 80, "Via Dello Maritozzo Bucato, 78");
        System.out.println(p1);
    }
    
    /**
     * 2:
     *
     *
     * Override the `hashCode()` method in the Person class to generate a unique hash code based on the object's name, age, and address.
     *
     * You can achieve this by using String.hashCode() to convert strings to ints and adding the fields together
     *
     * Create 2 people and print out their hashcodes
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Person p1 = new Person("Pippo Baudo", 79, "Via Dello Maritozzo Bucato, 50");
        Person p2 = new Person("Genoveffa Franconcini", 69, "Via Dello Maritozzo Bucato, 87");
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        
    }
    
    /**
     * 3:
     *
     * BONUS: Read about the nuances of hashcode here:
     *
     * https://www.baeldung.com/java-hashcode
     *
     * Don't necessarily expect to understand it all right away, it can get quite complicated
     *
     *
     *   *** DONE ***
     */
}