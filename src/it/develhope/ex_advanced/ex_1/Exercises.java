package it.develhope.ex_advanced.ex_1;

import java.util.*;

public class Exercises {
    
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }
    
    /**
     * 1:
     * <p>
     * 1. Add some numbers (1, 1, 5, 2, 1) to the set using the add() method.
     * 2. Remove '1' from  the set using the .remove(1)
     * 3. Print the set again to confirm the element was removed.
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        Set<Integer> ourSet;
        
        // Add some numbers using the add method
        // Your code
        
        ourSet = new HashSet<>(Arrays.asList(1, 1, 5, 2, 1));
        
        if (ourSet.containsAll(List.of(1, 1, 5, 2, 1))) {
            System.out.println("1a. Set contains all numbers");
        } else {
            System.out.println("1a. Set does not contain all numbers");
        }
        
        System.out.println(ourSet);
        
        // Remove the element '1'
        // Your code
        
        for (int i = 0; i < ourSet.size(); i++) {
            while (ourSet.contains(1)) {
                ourSet.remove((Integer) 1);
            }
        }
        
        System.out.println(ourSet);
        
        if (ourSet.contains(1)) {
            System.out.println("1b. The set still contains 1");
        } else {
            System.out.println("1b. The set does not contain 1");
        }
    }
    
    /**
     * 2:
     * <p>
     * Read the comments below and write comments on what you think our print statement will output!
     */
    private static void exercise2() {
        Set<String> fruitsSet = new HashSet<>();
        
        fruitsSet.add("apple");
        fruitsSet.add("banana");
        fruitsSet.add("orange");
        fruitsSet.add("kiwi");
        fruitsSet.add("mango");
        
        fruitsSet.addAll(fruitsSet);
        
        //2a. What will this output? [banana, orange, apple, kiwi, mango]
        System.out.println(fruitsSet);
        
        List<String> fruitsList = List.of("apple", "banana", "grapes", "pear", "mango");
        
        fruitsSet.addAll(fruitsList);
        
        //2b. What will this output? [banana, orange, apple, kiwi, pear, mango, grapes]
        System.out.println(fruitsSet);
    }
    
    /**
     * 3: Write code to solve the following problems
     */
    private static void exercise3() {
        // 3a. Find the min and max values in the Set below
        Set<Integer> numbers = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        
        
        for (Integer number : numbers) {
            // Your code
            
            max = Collections.max(numbers);
            
            min = Collections.min(numbers);
            //DON'T USE CLASS "MATH" OPERATIONS HERE!
            //IT DOESN'T WORK! YOU HAVE TO DO COLLECTIONS.MAX() AND COLLECTIONS.MIN()
        }
        
        if (max != 10 || min != 1) {
            System.out.println("3a. Incorrect min or max values");
        }
        
        // 3b. Find which items from set "a" are also in set "b", add these to itemsContainedInBothSets
        //     use the `contains` method and "nested" for loop
        Set<Integer> setA = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Set<Integer> setB = Set.of(5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        Set<Integer> itemsContainedInBothSets = new HashSet<>();
        
        // Your code
        for (Integer item : setA) {
            if (setB.contains(item)) {
                itemsContainedInBothSets.add(item);
            }
        }
        
        if (!itemsContainedInBothSets.equals(Set.of(5, 6, 7, 8, 9, 10))) {
            System.out.println("3b. Incorrect number of items in itemsContainedInBothSets");
        } else {
            System.out.println("3b. Correct number of items in itemsContainedInBothSets");
        }
    }
    
    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     */
    private static void exercise4() {
        Set<Integer> orderedNumbers = new TreeSet<>();
        orderedNumbers.addAll(Set.of(5, 3, 1, 2, 4, 6, 7, 8, 9, 10));
        // 4a. Find the min value in the TreeSet with as few loops as possible,
        //     you can use `break;` to exit the loop once you've found it!
        int min = Integer.MAX_VALUE;
        // Your code
        
        for (Integer number : orderedNumbers) {
            min = Math.min(min, number);
        }
        
        if (min != 1) {
            System.out.println("4a. Incorrect min value");
        } else {
            System.out.println("4a. Correct min value");
        }
    }
    
}
