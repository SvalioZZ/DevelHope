package it.develhope.challenge.catalogue.storeSettings;

public abstract class Product {
    /**
     * 1. Product class
     *
     * Create an abstract class called Product that represents a generic product with the
     * following fields: name, price.
     */
    protected String name;
    protected double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public abstract void printInfo();
}
