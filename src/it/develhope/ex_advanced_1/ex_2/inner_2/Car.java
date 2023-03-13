package it.develhope.ex_advanced_1.ex_2.inner_2;

public class Car implements Movable{
    private int speed;
    private String name;
    
    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public void moveForward(int timeInSeconds) {
        System.out.println(getName() + " is moving forward at: " + getSpeed() + " km/h\n" +
                                   "Time in seconds: " + timeInSeconds + "\n" +
                                   "Travelled distance is approximately: " + (timeInSeconds * Math.round(getSpeed()/3.6)) + " meters");
    }
    
    @Override
    public void moveBackward(int timeInSeconds) {
        System.out.println(getName() + " is moving backward at: " + getSpeed() + " km/h\n" +
                                  "Time in seconds: " + timeInSeconds + "\n" +
                                  "Travelled distance is approximately: " + (timeInSeconds * Math.round(getSpeed()/3.6)) + " meters");
    }
    
}
