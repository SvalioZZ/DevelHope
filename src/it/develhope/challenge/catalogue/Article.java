package it.develhope.challenge.catalogue;

class Article extends Product implements Discount {
    private int id;
    private String description;
    private TypeProduct type;
    private double discount = 0.0;
    
    public Article(int id, String name, double price, String description, TypeProduct type) {
        super(name, price);
        this.id = id;
        this.description = description;
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
    void printInfo() {
        System.out.println(getName() + " - " + getPrice());
    }
}