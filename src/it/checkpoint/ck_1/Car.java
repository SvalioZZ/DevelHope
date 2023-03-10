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
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setIdCounter(int idCounter) {
        this.idCounter = idCounter;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPlate(String plate) {
        this.plate = plate;
    }
    
    public void setKmL(int kmL) {
        this.kmL = kmL;
    }
    
    public void setElectric(boolean electric) {
        isElectric = electric;
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
        System.out.println(brand + " - " + name + " - " + plate.toUpperCase() + " - " + price + " - "  + idCounter);
    }
}
