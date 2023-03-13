package it.develhope.ex_advanced_1.ex_1;

public class Bird extends Animal{
    
    private double wingSpan;
    
    public Bird(double wingSpan, double height, double weight) {
        super(height, weight);
        this.wingSpan = wingSpan;
    }
    
    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }
    
    public double getWingSpan() {
        return wingSpan;
    }
    
    @Override
    public void printAnimal() {
        System.out.println("New Bird: \nWing Span: " + wingSpan + "\nHeight: " + getHeight() + "cm\nWeight: " + getWeight() + "Kg");
    }
    
    public double flySpeedMetersPerSecond() {
        return  getWingSpan() * 4;
    }
}
