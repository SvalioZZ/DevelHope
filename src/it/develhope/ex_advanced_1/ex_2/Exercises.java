package it.develhope.ex_advanced_1.ex_2;

import it.develhope.ex_advanced_1.ex_2.inner_1.Circle;
import it.develhope.ex_advanced_1.ex_2.inner_1.Rectangle;
import it.develhope.ex_advanced_1.ex_2.inner_2.Boat;
import it.develhope.ex_advanced_1.ex_2.inner_2.Car;
import it.develhope.ex_advanced_1.ex_2.inner_3.Guitar;
import it.develhope.ex_advanced_1.ex_2.inner_3.Piano;

public class Exercises {
    
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }
    
    /**
     * 1:
     * <p>
     * Create an abstract class called "Shape" with fields of height and width
     * <p>
     * Create classes called "Rectangle" and "Circle" that extend the GeometricShape class and implement the calculateArea() method.
     * <p>
     * Create instances of both and calculate their area
     * <p>
     * To calculate the area copy the following code:  Math.PI * Math.pow((height / 2), 2)
     * <p>
     * BONUS: Make sure the height and width values are exactly the same for Circle, change the constructor to do this
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Rectangle rectangle = new Rectangle(10, 20);
        Circle circle = new Circle(10);
        rectangle.calculateArea();
        circle.calculateArea();
    }
    
    /**
     * 2:
     * <p>
     * <p>
     * Create an interface class called "Movable" that has the following methods: moveForward, moveBackward
     * <p>
     * Create classes called "Car" and "Boat" that implement the Movable Interface
     * <p>
     * Write code below that creates instances of both the Car and Boat class and demonstrates the use of the methods from the Movable interface.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Car car = new Car("Alfa Romeo Mito", 90);
        Boat boat = new Boat("Silver Bullet", 250);
        
        car.moveForward(30);
        car.moveBackward(20);
        boat.moveForward(20);
        boat.moveBackward(10);
        
    }
    
    /**
     * 3:
     * <p>
     * <p>
     * Create an interface called "Playable" with an abstract method called "play()".
     * <p>
     * Create an abstract class called "Instrument" that implements the Playable interface and contains the fields "name" and "brand".
     * <p>
     * Create classes called "Guitar" and "Piano" that extend the Instrument class and implement the play() method.
     * <p>
     * Write code below that creates instances of both the Guitar and Piano class and demonstrates the use of the play() method.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Guitar guitar = new Guitar("Strato Caster", "Fender");
        Piano piano = new Piano("Piano", "Albert-Weber");
        
        piano.printInfo();
        piano.play();
        System.out.println("----------------------------");
        guitar.printInfo();
        guitar.play();
        
    }
}

