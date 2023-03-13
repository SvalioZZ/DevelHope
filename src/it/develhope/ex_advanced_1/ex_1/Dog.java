package it.develhope.ex_advanced_1.ex_1;

public class Dog extends Animal{
    
    private String breed;
    
    public Dog(String breed, double height, double weight) {
        super(height, weight);
        this.breed  = breed;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public String getBreed() {
        return breed;
    }
    
    @Override
    public void printAnimal() {
        System.out.println("New dog: \n" + this.breed + "\nHeight: " + getHeight() + "cm\nWeight: " + getWeight() + "Kg");
    }
    
    public double runSpeedMetersPerSecond() {
        return getHeight() * 2;
    }
}
