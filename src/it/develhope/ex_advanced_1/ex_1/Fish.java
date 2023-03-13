package it.develhope.ex_advanced_1.ex_1;

public class Fish extends Animal {
    
    private String species;
    
    public Fish(String species, double height, double weight) {
        super(height, weight);
        this.species = species;
    }
    
    public void setSpecies(String species) {
        this.species = species;
    }
    
    public String getSpecies() {
        return species;
    }
    
    @Override
    public void printAnimal() {
        System.out.println("New bird: \n" + this.species + "\nHeight: " + getHeight() + "cm\nWeight: " + getWeight() + "Kg");
    }
    
    public double swimSpeedMetersPerSecond() {
        return getWeight() * 2;
    }
}
