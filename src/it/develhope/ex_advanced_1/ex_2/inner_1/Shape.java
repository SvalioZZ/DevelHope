package it.develhope.ex_advanced_1.ex_2.inner_1;

public abstract class Shape {
    
    private double width;
    private double height;
    
    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public void calculateArea() {
    
    }
}
