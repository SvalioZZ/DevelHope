package it.develhope.challenge.catalogue;

public enum TypeProduct {
    
    ELECTRONICS("Electronics", "Electronic items"),
    CLOTHING("Clothing", "Clothing items"),
    GROCERY("Grocery", "Food and beverage items");
    
    private String name;
    private String description;
    
    TypeProduct (String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
}
