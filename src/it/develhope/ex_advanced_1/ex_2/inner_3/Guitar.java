package it.develhope.ex_advanced_1.ex_2.inner_3;

public class Guitar extends Instruments{
    
    public Guitar(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }
    
    @Override
    public void play() {
        System.out.println("Playing...\nBeautiful Rock & Roll by The Guitar!");
    }
    
    @Override
    public void printInfo() {
        System.out.println(this.name + " by " + this.brand);
    }
}
