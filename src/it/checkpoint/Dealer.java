package it.checkpoint;

import java.util.ArrayList;
import java.util.List;

public class Dealer extends Father{
    private String name;
    private String address;
    private List<Car> cars;
    
    public Dealer(String name, String address, List<Car> cars) {
        this.name = name;
        this.address = address;
        this.cars = cars;
    }
    
    public Dealer(String name, String address) {
        this.name = name;
        this.address = address;
        this.cars = new ArrayList<Car>();
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public List<Car> getCars() {
        return cars;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void addCar(Car c) {
        cars.add(c);
    }
    
    public double getMidPrice() {
        double sum = 0;
        for (Car c : cars) {
            sum += c.getPrice();
        }
        return sum / cars.size();
    }
    
}
