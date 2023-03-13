package it.develhope.ex_advanced_1.ex_2.inner_1;

public class Rectangle extends Shape {
    
    public Rectangle(double width, double height) {
        super(width, height);
    }
    
    @Override
    public void calculateArea() {
        System.out.println("Area of rectangle: " + (getWidth() * getHeight()) + " square centimeters");
    }
}
