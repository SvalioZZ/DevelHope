package it.develhope.classes.ex4;

import java.util.Random;

public class Exercise {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
//        exercise4();
    }

    /**
     * 1: Create variables with the MINIMUM POSSIBLE scope for currentCount and totalCount (both ints)
     */
    public static void exercise1() {
        System.out.println("Exercise 1:");
        int luckyRolls = 0;
        int totalCount = 0;
        for (int i = 0; i < 100; i++) {
            while (rollD6() == 6) {
                luckyRolls++;
            }
            totalCount += luckyRolls;
            luckyRolls = 0;
        }
        System.out.println(totalCount);
    }

    private static Random random = new Random();

    private static int rollD6() {
        return random.nextInt(6) + 1;
    }

    /**
     * 2a: Change the scope modifiers (also known as access modifiers) in the class ExerciseLunch so no errors appear below,
     * <p>
     * 2b: Now change these modifiers to the MINIMUM possible scope, to have no errors
     */
    
    
    public static void exercise2() {
        System.out.println("\nExercise 2:");
        ExerciseLunch exerciseLunch = new ExerciseLunch(3.4, "Tuesday");
        exerciseLunch.setPrice(6.7);
        exerciseLunch.setNameOfDayEaten("S00nday");
        exerciseLunch.getPrice();
        ExerciseLunch.printMaxPrice();
        System.out.println(exerciseLunch.getNumberOfTimesWeHaveGotPrice());
        exerciseLunch.setLunchWeightInGrams(300);
        
        System.out.println("Lunch on " + exerciseLunch.getNameOfDayEaten() + " cost " + exerciseLunch.getPrice());
        exerciseLunch.setNumberOfTimesWeHaveGotPrice(exerciseLunch.numberOfTimesWeHaveGotPrice);
    }

    /**
     * 3: Edit this method and Exercise Lunch to fix the errors in the method below
     *
     *    Only make edits that remove or add the words, static or final
     */
    public static void exercise3() {
        System.out.println("\nExercise 3:");
        ExerciseLunch exerciseLunch = null;
        exerciseLunch = new ExerciseLunch(3.4, "Tuesday");
        exerciseLunch.setLunchWeightInGrams(600);
        exerciseLunch.printLunch();
        exerciseLunch.setPrice(6.5);
        System.out.println(exerciseLunch.getNameOfDayEaten());
        System.out.println(exerciseLunch.getPrice());
    }

    /**
     * 4: Add constants to the function below for relevant values,
     *    make sure they are static and final
     *    and can be accessed anywhere in this class, but nowhere else.
     *    use SNAKE_CASE naming
     */
    private static final int WEEKS_OF_YEAR = 52;
    private static final int DAYS_OF_WEEK = 7;
    private static final int HOURS_OF_DAY = 24;
    public static void exercise4() {
        System.out.println("\nExercise 4:");
        
        for (int week = 0; week < WEEKS_OF_YEAR; week++) {
            for (int day = 0; day < DAYS_OF_WEEK; day++) {
                for (int hour = 0; hour < HOURS_OF_DAY; hour++) {
                    System.out.println("Week " + week +", day " + day +", hour " + hour);
                }
                
            }
        }
    }
}

