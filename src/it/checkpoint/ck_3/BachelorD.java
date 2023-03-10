package it.checkpoint.ck_3;

import java.util.ArrayList;
import java.util.List;

public class BachelorD {
    /**
     * 2) Design a BachelorD class that allows to store:
     * - Course Name
     * - Students
     */
    private String courseName;
    private List<Student> students;
    
    /**
     * ● Implement a constructor that receives only as input the name of the course
     * degree.
     */
    
    public BachelorD(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }
    
    /**
     * ● Implement getters and setters for each variable.
     */
    
    public String getCourseName() {
        return courseName;
    }
    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public List<Student> getStudents() {
        return students;
    }
    
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    /**
     * ● Implement a method that prints the students enrolled in the degree program.
     */
    
    public void printStudents() {
        System.out.println("List of the student: " + students);
    }
    
    /**
     * ● Implement a method to add a student to the students enrolled in the
     * course.
     */
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    /**
     * ● Implement a method to remove a student from the undergraduate
     * degree
     */
    
    public void removeStudent(Student student) {
        students.remove(student);
    }
}
