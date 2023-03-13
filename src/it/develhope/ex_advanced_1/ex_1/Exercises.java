package it.develhope.ex_advanced_1.ex_1;

import java.util.ArrayList;
import java.util.List;

class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }
    
    /**
     * 1:
     * Create a class called "Dog" that extends the Animal class.
     * Add a new field called "breed" to the Dog class.
     * Write a constructor for the Dog class that takes in a breed, height, and
     * weight as parameters, and passes the height and weight to the superclass constructor.
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        
        System.out.println("\nExercise 1: ");
        
        // Your code here
        
        Dog dog = new Dog("German Shepherd", 40.5, 49.5);
        
        dog.printAnimal();
    }
    
    /**
     * 2:
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        
        System.out.println("\nExercise 2: ");
        
        // Your code here
        
        Bird bird = new Bird(145, 21.5, 4.65);
        Fish fish = new Fish("Cat Fish", 12.6, 36.55);
        
        bird.printAnimal();
        fish.printAnimal();
    }
    
    
    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        
        // Your code here
        
        Dog dog = new Dog("German Shepherd", 40.5, 49.5);
        Bird bird = new Bird(145, 21.5, 4.65);
        Fish fish = new Fish("Cat Fish", 12.6, 36.55);
        
        List<Double> speeds = new ArrayList<>();
        
        speeds.add(dog.runSpeedMetersPerSecond());
        speeds.add(fish.swimSpeedMetersPerSecond());
        speeds.add(bird.flySpeedMetersPerSecond());
        
        double maxSpeed = Double.MIN_VALUE;
        
        for (Double speed : speeds) {
            maxSpeed = Math.max(maxSpeed, speed);
        }
        if (maxSpeed == dog.runSpeedMetersPerSecond()){
            System.out.println(dog.getClass().getSimpleName() + " has the fastest movement speed in MetersPerSecond:\n" +
                                      dog.runSpeedMetersPerSecond() + " m/s");
        } else if (maxSpeed == fish.swimSpeedMetersPerSecond()){
            System.out.println(fish.getClass().getSimpleName() + " has the fastest movement speed in MetersPerSecond:\n" +
                                      fish.swimSpeedMetersPerSecond() + " m/s");
        } else {
            System.out.println(bird.getClass().getSimpleName() + " has the fastest movement speed in MetersPerSecond:\n" +
                                      bird.flySpeedMetersPerSecond() + " m/s");
        }
    }
}
