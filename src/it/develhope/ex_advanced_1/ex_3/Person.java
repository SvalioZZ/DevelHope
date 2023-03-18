package it.develhope.ex_advanced_1.ex_3;

import java.util.Objects;

public class Person {
    
    private String name;
    private int age;
    private String address;
    
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    @Override
    public String toString() {
        return String.format("Name: %s,\nAge: %d,\nAddress: %s", name, age, address);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && name.equals(person.name) && address.equals(person.address);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name, age, address);
    }
}
