package it.checkpoint.ck_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Student {
    
    /**
     * 1) Design a Student class with the following private attributes:
     * - Freshman Num.
     * - First Name
     * - Last Name
     * - Grades // map <String, Integer>.
     * - Number of students created // counter to keep track of how many instances
     * are created
     */
    private int freshmanNum;
    private String firstName;
    private String lastName;
    private Map<String, Integer> grades;
    private int numberOfStudentsCreated = 1;
    private int increment = numberOfStudentsCreated++;
    
    /**
     * ● Implement at least two types of constructors and their getters and setters for
     * each variable.
     */
    public Student(String firstName,
            String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = new HashMap<>();
        this.numberOfStudentsCreated = increment++;
    }
    
    public Student() { }
    
    public int getFreshmanNum() {
        return freshmanNum;
    }
    
    public void setFreshmanNum(int freshmanNum) {
        this.freshmanNum = freshmanNum;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public Map<String, Integer> getGrades() {
        return grades;
    }
    
    public void setGrades(Map<String, Integer> grades) {
        this.grades = grades;
    }
    
    public int getNumberOfStudentsCreated() {
        return numberOfStudentsCreated;
    }
    
    public void setNumberOfStudentsCreated(int numberOfStudentsCreated) {
        this.numberOfStudentsCreated = numberOfStudentsCreated;
    }
    
    /**
     * ● Implement a method to add a new evaluation
     * to the map
     */
    public void addEvaluation(String evaluation) {
        Random random = new Random();
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            entry.setValue(entry.getValue() + (random.nextInt()*10));
        }
    }
    /**
     * ● Implement the toString() method to output some info about
     * the class instance.
     */
    @Override
    public String toString() {
        return firstName + " - " + lastName + " - " + grades.toString() + " - " + numberOfStudentsCreated;
    }
}
