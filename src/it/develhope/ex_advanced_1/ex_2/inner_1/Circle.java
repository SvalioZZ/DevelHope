package it.develhope.ex_advanced_1.ex_2.inner_1;

public class Circle extends Shape {
    
    public Circle(double radius) {
        super(radius, radius);
    }
    
    @Override
    public void calculateArea() {
        System.out.println("Area of circle is: " + (Math.PI * Math.pow((getHeight()/2), 2)) + " square centimeters");
    }
}
