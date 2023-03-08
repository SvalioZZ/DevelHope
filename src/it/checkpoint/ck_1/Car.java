package it.checkpoint.ck_1;

public class Car extends Father{
    
    private int id = 0;
    private int idCounter = id++;
    private String brand;
    private String name;
    private String plate;
    private double price;
    private int kmL;
    private boolean isElectric;
    
    public Car(
            String brand,
            String name,
            String plate,
            double price,
            int kmL,
            boolean isElectric)
    {
        this.id = idCounter++;
        this.brand = brand;
        this.name = name;
        this.plate = plate;
        this.price = price;
        this.kmL = kmL;
        this.isElectric = isElectric;
    }
    
    public Car(String name, String plate, String brand){
        this.name = name;
        this.plate = plate;
        this.brand = brand;
    }
    
    public int getId() {
        return id;
    }
    
    public int getIdCounter() {
        return idCounter;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public String getName() {
        return name;
    }
    
    public String getPlate() {
        return plate;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getKmL() {
        return kmL;
    }
    
    public boolean isElectric() {
        return isElectric;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public boolean isGreen(){
        return this.isElectric || this.kmL > 20;
    }
    
    @Override
    void printing() {
        System.out.println(brand + " - " + name + " - " + plate.toUpperCase() + " - " + price);
    }
}
