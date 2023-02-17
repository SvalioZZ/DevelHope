package it.develhope.classes.ex1;

public class Student {
    
    String name;
    int age;
    
    @Override
    public String toString() {
        return "*** NEW STUDENT CREATED ***\n" + name + " " + age;
    }
}
