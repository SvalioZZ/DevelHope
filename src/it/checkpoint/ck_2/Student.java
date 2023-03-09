package it.checkpoint.ck_2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    
    /**
     * Design a Student class with the following private attributes:
     * - Freshman Num.
     * - First Name
     * - Surname
     * - Home address
     */
    private int id;
    private String name;
    private String surname;
    private String address;
    
    /**
     * Implement at least two types of constructors and their getters and setters for
     * each variable.
     */
    
    public Student(int id, String name, String surname, String address) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.address = address;
        List<Course> courses = new ArrayList<>();
    }
    
    public Student() {
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSurname() {
        return surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * Implement the toString() method to output some info about
     * to the class instance.
     */
    
    @Override
    public String toString() {
        return id + " - " + name + " - " + surname + " - " + address + "\n";
    }
    
}
