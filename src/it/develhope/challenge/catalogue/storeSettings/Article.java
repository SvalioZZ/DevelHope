package it.develhope.challenge.catalogue.storeSettings;

import it.develhope.challenge.catalogue.Discount;
import it.develhope.challenge.catalogue.TypeProduct;

public class Article extends Product implements Discount {
    private int id;
    private static int idTot;
    private String description;
    private TypeProduct type;
    private double discount = 0.0;
    
    public Article(String name, double price, TypeProduct type) {
        super(name, price);
        this.id = idTot++;
        this.description = type.getDescription();
        this.type = type;
    }
    
    public int getId() {
        return id;
    }
    
    public String getDescription() {
        return description;
    }
    
    public TypeProduct getType() {
        return type;
    }
    
    public double getDiscount() {
        return discount;
    }
    
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
    public void applyDiscount(double discount) {
        setDiscount(discount);
        double discountedPrice = calculateDiscountPrice();
        setPrice(discountedPrice);
    }
    
    public double calculateDiscountPrice() {
        double price = getPrice();
        double discountPercent = getDiscount();
        double discountAmount = price * discountPercent / 100;
        return price - discountAmount;
    }
    
    @Override
    public void printInfo() {
        System.out.println(getName() + " - " + getPrice());
    }
    
    public void setId(int id) {
        this.id = id;
    }
}