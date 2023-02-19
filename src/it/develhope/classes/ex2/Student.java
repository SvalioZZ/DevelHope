package it.develhope.classes.ex2;

public class Student {
    String name;
    int age;
    
    public Student(String name, int age) {
        System.out.println("Constructing...");
        System.out.println("Constructed!");
        this.name = name;
        this.age = age;
    }
    
    public Student (String name){
        this.name = name;
    }
    
    public Student (int age){
        this.age = age;
    }
    
    public Student () { }
    
    @Override
    public String toString() {
        return "*** New Student ***\nName: " + name + "\nAge: " + age;
    }
}
