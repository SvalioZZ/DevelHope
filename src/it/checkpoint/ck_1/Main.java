package it.checkpoint.ck_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
    
        Car c1 = new Car("Volvo", "CX90", "bj341ss", 27999.50, 13, false);
        Car c2 = new Car("BMW", "IE3", "sz444bf", 17999.90, 18, true);
        Car c3 = new Car("Citroen", "Xsara Picasso", "fz369sd", 7999.90, 21, false);
        Car c4 = new Car("Pegeaut", "e208", "fg456kf", 39999.99, 22, true);
        
        List<Car> cars1 = new ArrayList<Car>();
        
        cars1.add(c1);
        cars1.add(c2);
        
        Dealer deal1 = new Dealer("Pierotti", "Via Ginaciotti, 7", cars1);
        
        Dealer deal2 = new Dealer("Zenotti", "Via Lattughino Speziato, 39");
        
        deal2.addCar(c3);
        deal2.addCar(c4);
        
        for (Car car : cars1) {
            if (car.isGreen()){
                car.printing();
            }
        }
        if (deal1.getMidPrice() > deal2.getMidPrice()){
            System.out.println(deal1.getName() + " is the best for mid price!");
        } else {
            System.out.println(deal2.getName() + " is the best for mid price!");
        }
        
        List<Car> allCars = new ArrayList<Car>();
        allCars.addAll(cars1);
        allCars.addAll(deal2.getCars());
        
        double sum = 0;
        for (Car car : allCars) {
            sum += car.getPrice();
        }
        System.out.println("--------------------------------\n" + "Sum of prices is: " + sum);
        
        int id = 0;
        for (Car car : allCars) {
            car.setIdCounter(id++);
            car.printing();
        }
        
    }
    
}
