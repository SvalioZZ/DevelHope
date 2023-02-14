package it.develhope.classes.ex1;

public class Student {
    
    String name;
    int age;
    
    @Override
    public String toString() {
        return "Student { " +
                       "name = '" + name + '\'' +
                       ", age = " + age +
                       '}';
    }
}
