package it.develhope.classes.ex4;

public class ExerciseLunch {
    private Double price = null;
    private String nameOfDayEaten = null;
    private int lunchWeightInGrams;
    
    private static final double MAX_PRICE = 5;
    
    private static final int MIN_WEIGHT = 0;
    
    private static final String NOT_A_DAY = null;
    
    public int numberOfTimesWeHaveGotPrice = 0;
    
    ExerciseLunch(Double price, String nameOfDayEaten) {
        this.price = price;
        this.nameOfDayEaten = nameOfDayEaten;
    }
    
    public static void printMaxPrice() {
        System.out.println(MAX_PRICE);
    }
    
    public void printLunch() {
        System.out.println("Lunch{" +
                                   "price=" + price +
                                   ", nameOfDayEaten='" + nameOfDayEaten + '\'' +
                                   ", lunchWeightInGrams='" + lunchWeightInGrams + '\'' +
                                   '}');
    }
    
    public void setPrice(double price) {
        if (price > MAX_PRICE) {
            System.out.println("Cannot set greater than max price");
        } else {
            this.price = price;
        }
    }
    
    Double getPrice() {
        numberOfTimesWeHaveGotPrice = numberOfTimesWeHaveGotPrice + 1;
        return this.price;
    }
    
    public int getNumberOfTimesWeHaveGotPrice() {
        return this.numberOfTimesWeHaveGotPrice;
    }
    
    String getNameOfDayEaten() {
        return nameOfDayEaten;
    }
    
    public void setNameOfDayEaten(String nameOfDayEaten) {
        char[] chars = nameOfDayEaten.toCharArray();
        if (nameOfDayEaten.equals(NOT_A_DAY) || nameOfDayEaten.equals("")) {
            System.out.println("Not a day! Retry ");
            this.nameOfDayEaten = null;
        }
        
        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                System.out.println("Not a day! Retry");
            }
            nameOfDayEaten = null;
        }
    }
    
    void setLunchWeightInGrams(int lunchWeightInGrams) {
        if (lunchWeightInGrams < MIN_WEIGHT) {
            System.out.println("Invalid weight value: " + lunchWeightInGrams + "\n Is less than " + MIN_WEIGHT);
        } else {
            this.lunchWeightInGrams = lunchWeightInGrams;
        }
    }
    
    public void setNumberOfTimesWeHaveGotPrice(int numberOfTimesWeHaveGotPrice) {
        this.numberOfTimesWeHaveGotPrice = numberOfTimesWeHaveGotPrice;
    }
}
