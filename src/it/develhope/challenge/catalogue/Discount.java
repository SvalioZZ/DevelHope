package it.develhope.challenge.catalogue;

public interface Discount {
    
    /**
     * 2. Discount Interface:
     *
     * Creates an interface called Discount that has a discount field and the following methods:
     * - applyDiscount: a method that applies a discount to the product. The discount must be
     * expressed as a percentage (e.g., a discount of 10% must be passed
     * as 10.0).
     *
     * - calculateDiscountPrice(): a method that from the product price and the
     * set discount, calculates the actual price.
     */
    double getDiscount();
    void setDiscount(double discount);
    void applyDiscount(double discount);
    double calculateDiscountPrice();
    
}
