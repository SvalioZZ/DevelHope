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
     * <p>
     * <p>
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     * <p>
     * Loop over the values with Days.values() and print them out.
     */
    private enum Days {
        MONDAY(false), TUESDAY(false), WEDNESDAY(false), THURSDAY(false), FRIDAY(false), SATURDAY(true), SUNDAY(true);
        
        private final boolean isWeekend;
        
        Days(boolean isWeekend) {
            this.isWeekend = isWeekend;
        }
        
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
     * <p>
     * <p>
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     * <p>
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     */
    
    private enum Seasons {
        SPRING("March 1 - May 31"),
        SUMMER("June 1 - August 31"),
        FALL("September 1 - November 30"),
        WINTER("December 1 - February 28");
        private final String dateRange;
        
        Seasons(String dateRange) {
            this.dateRange = dateRange;
        }
    }
    
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        for (Seasons season : Seasons.values()) {
            System.out.println(season.name() + " happens in " + season.dateRange);
        }
    }
    
    /**
     * 3:
     * <p>
     * <p>
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     * <p>
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     */
    private enum TrafficLight {
        GREEN("You may Go!"), YELLOW("Hurry Up!"), RED("STOP!");
        private final String state;
        
        TrafficLight(String state) {
            this.state = state;
        }
    }
    
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        for (TrafficLight light : TrafficLight.values()) {
            System.out.println(light.name() + " is currently on: " + light.state);
        }
    }
    
    /**
     * 4:
     * <p>
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     * <p>
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        boolean isWeekend = true;
        for (Days day : Days.values()) {
            if (!day.isWeekend) {
                System.out.println(day.name() + " is not a weekend day");
            } else {
                System.out.println(day.name() + " is a weekend day");
            }
        }
        
    }
    
    /**
     * 5:
     * <p>
     * <p>
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     * <p>
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private enum Operator {
        ADD(0.0, 0.0), SUBTRACT(0.0, 0.0), MULTIPLY(0.0, 0.0), DIVIDE(0.0, 0.0);
        private final double v, v1;
        
        Operator(double v, double v1) {
            this.v = v;
            this.v1 = v1;
        }
    }
    
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        double num1 = 5;
        double num2 = 2;
        // Your code here
        
        for (Operator operator : Operator.values()) {
            operation(num1, num2, operator);
        }
        
        
    }
    public static void operation(double num1, double num2, Operator op) {
        switch (op) {
            case ADD:
                System.out.println(op.name() + ": \n" +
                                           num1 + " + " +
                                           num2 + " = " +
                                           (num1 + num2));
                break;
            case SUBTRACT:
                System.out.println(op.name() + ": \n" +
                                           num1 + " - " +
                                           num2 + " = " +
                                           (num1 - num2));
                break;
            case MULTIPLY:
                System.out.println(op.name() + ": \n" +
                                           num1 + " * " +
                                           num2 + " = " +
                                           (num1 * num2));
                break;
            case DIVIDE:
                System.out.println(op.name() + ": \n" +
                                           num1 + " / " +
                                           num2 + " = " +
                                           (num1 / num2));
                break;
            default:
                break;
        }
    }
    
}

