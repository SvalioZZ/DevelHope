package it.develhope.ex_advanced.ex_6;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }
    
    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }
    
    /**
     * 1:
     *
     *
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     *
     * Loop over the values with Days.values() and print them out.
     */
    private enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        for (Days day : Days.values()) {
            System.out.println(day);
        }
    }
    
    
    /**
     * 2:
     *
     *
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     *
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     *
     */
    
    private enum Seasons {
        SPRING, SUMMER, FALL, WINTER;
    }
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        for (Seasons season : Seasons.values()) {
            if (season == Seasons.SPRING) {
                System.out.println("Period of " + season.name() + ": " + "March 1 - May 31");
            } else if (season == Seasons.SUMMER) {
                System.out.println("Period of " + season.name() + ": " + "June 1 - August 31");
            } else if (season == Seasons.FALL) {
                System.out.println("Period of " + season.name() + ": " + "September 1 - November 30");
            } else {
                System.out.println("Period of " + season.name() + ": " + "December 1 - February 28");
            }
        }
    }
    
    /**
     * 3:
     *
     *
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     *
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     *
     */
    private enum TrafficLight {
        GREEN, YELLOW, RED;
    }
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        for (TrafficLight light : TrafficLight.values()) {
            if (light == TrafficLight.GREEN) {
                System.out.println(light.name() + " is on \n" + "You may go!\nNext state: " + TrafficLight.YELLOW);
            } else if (light == TrafficLight.YELLOW) {
                System.out.println(light.name() + " is on \n" + "Hurry Up!\nNext state: " + TrafficLight.RED);
            } else {
                System.out.println((light.name() + " is on \n" + "STOP!\nnext state: " + TrafficLight.GREEN));
            }
        }
    }
    
    /**
     * 4:
     *
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     *
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        boolean isWeekend = true;
        for (Days day : Days.values()) {
            if (day == Days.MONDAY) {
                System.out.println(day.name() + " is weekend? " + !isWeekend);
            } else if (day == Days.TUESDAY) {
                System.out.println(day.name() + " is weekend? " + !isWeekend);
            } else if (day == Days.WEDNESDAY) {
                System.out.println(day.name() + " is weekend? " + !isWeekend);
            } else if (day == Days.THURSDAY) {
                System.out.println(day.name() + " is weekend? " + !isWeekend);
            } else if (day == Days.FRIDAY) {
                System.out.println(day.name() + " is weekend? " + !isWeekend);
            } else if (day == Days.SATURDAY) {
                System.out.println(day.name() + " is weekend? " + isWeekend);
            } else {
                System.out.println(day.name() + " is weekend? " + isWeekend);
            }
        }
        
    }
    
    /**
     * 5:
     *
     *
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     *
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private enum Operator {
        ADD, SUBTRACT, MULTIPLY, DIVIDE;
    }
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        double num1 = 5;
        double num2 = 2;
        // Your code here
    
        System.out.println("Numbers of the equations: " + num1 + " - " + num2);
        
        for (Operator operator : Operator.values()) {
            
            if (operator == Operator.ADD) {
                System.out.println(operator.name() + " operation: " + (num1 + num2));
            } else if (operator == Operator.SUBTRACT) {
                System.out.println(operator.name() + " operation: " +(num1 - num2));
            } else if (operator == Operator.MULTIPLY){
                System.out.println(operator.name() + " operation: " +(num1 * num2));
            } else {
                System.out.println(operator.name() + " operation: " +(num1 / num2));
            }
        }
       
    }
    
}

