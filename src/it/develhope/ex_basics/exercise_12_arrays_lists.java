package it.develhope.ex_basics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class exercise_12_arrays_lists {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }
    
    /**
     * 1: Add 8 random integers to the array list
     * <p>
     * Print out the first item
     * <p>
     * Remove the first 3 items
     * <p>
     * The print out the first remaining item
     */
    public static void exercise1() {
        System.out.println("Exercise 1:");
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 8; i++) {
            int next = rd.nextInt(8);
            numbers.add(next);
        }
        System.out.println("FIRST ITEM: " + numbers.get(0));
    
        /**
         * List.of(numbers.subList(3, numbers.size())).forEach(System.out::println);
         * this is one of the ways to do this, but
         * we want to remove the first 3 items,
         * not to print a sublist in which we don't start
         * from the beginning, but at index 3.
         */
        
        numbers.subList(0, 3).clear();
        
        //we can do this instead to remove the first 3 items with a single line of code
    
        System.out.println("remaining items: " + numbers);
        //Write your code here
    }
    
    /**
     * 2: Create 2 Array Lists,
     * <p>
     * A list of strings called 'menuItems'
     * <p>
     * And a list of Doubles called 'menuPrices'
     * <p>
     * The indexes of these two lists correspond to each other
     * <p>
     * Create a print statement to output the name and price of each
     * menu item correspond
     */
    public static void exercise2() {
        System.out.println("\nExercise 2:");
        
        //Write your code here
    
        ArrayList<String> menuItems = new ArrayList<>();
        ArrayList<Double> menuPrices = new ArrayList<>();
    
        menuItems.add("Fries");
        menuItems.add("Hamburger");
        menuItems.add("Pizza");
        menuItems.add("Salad");
        menuItems.add("Soda");
    
        menuPrices.add(2.49);
        menuPrices.add(6.99);
        menuPrices.add(11.99);
        menuPrices.add(4.99);
        menuPrices.add(1.99);
    
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i) + ": " + menuPrices.get(i));
        }
    }
    
    /**
     * 3: I changed this to an int array after recording!
     * <p>
     * You'll still need to find the total but using [index] instead of .get(index)
     * <p>
     * Find the total sum of all items in the ArrayList below.
     * <p>
     * Use the + operator
     * <p>
     * print the total
     */
    public static void exercise3() {
        System.out.println("\nExercise 3:");
        int[] items = new int[]{5, 10404, -234348, -53, 9, 91, 92, 34534, 12334, 1435};
        
        //Write your code here
        int sum = 0;
        for (int i : items) {
            sum += i;
        }
        System.out.println(sum);
    }
}
