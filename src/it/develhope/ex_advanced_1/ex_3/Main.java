package it.develhope.ex_advanced_1.ex_3;

public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        
        add(num1, num2);
    }
    
    // puoi scrivere un metodo qui
    
    public Main(){
    
    }
    
    public static void add(int num1, int num2) {
        num1 += num2;
        System.out.println("Sum of the two intger is: \n" + num1);
    }
}
