package it.checkpoint.ck_2;

import java.util.ArrayList;
import java.util.List;

public class Course {
    
    /**
     * Designing a class Course that enables memorization:
     * - Course name
     * - Course credits
     * - Students enrolled
     */
    
    private String courseName;
    private int credits;
    private List<Student> students;
    
    /**
     * Implement a constructor that initializes only the name and number of
     * credits.
     */
    
    public Course(String courseName, int credits){
        this.courseName = courseName;
        this.credits = credits;
        this.students = new ArrayList<>();
    }
    
    /**
     * Implement getters and setters for each variable.
     */
    
    public String getCourseName() {
        return courseName;
    }
    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public int getCredits() {
        return credits;
    }
    
    public void setCredits(int credits) {
        this.credits = credits;
    }
    
    public List<Student> getStudents() {
        return students;
    }
    
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    /**
     * Realize a method for adding a student to the students enrolled in the
     * course.
     */
    
    public void addStudent(Student student){
        students.add(student);
    }
    
    /**
     * Making a method that molds students enrolled in the course.
     */
    
    public void printStudents(){
        System.out.println("Students enrolled in the course " +
                                   this.courseName + ":\n" + students);
        
    }
    
    /**
     * Realize a method that takes as input a list of courses and outputs
     * the corresponding number of total credits.
     */
    
    public static void totalCredit(List<Course> courses){
        int totalCredits = 0;
        for (Course course : courses) {
            totalCredits += course.getCredits();
        }
        System.out.println("Total credits: " + totalCredits);
    }
    
    /**
     * Realize a CheckStudent enrollment method that takes as input a
     * student and returns whether the student is present among the enrolled
     */
    
    public boolean checkStudent(Student student){
        return students.contains(student);
    }
    
    /**
     * Realize a method that allows searching based on a string passed
     * as input (keySearch) and that returns a list of students consistent with the search
     * performed.
     */
    
    public static List<Student> search(List<Student> students, String keySearch){
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            String fullName = student.getName() + " " + student.getSurname();
            if (fullName.toLowerCase().contains(keySearch.toLowerCase())) {
                result.add(student);
            }
        }
        return result;
    }
    
}
