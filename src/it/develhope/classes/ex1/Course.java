package it.develhope.classes.ex1;

import java.util.ArrayList;
import java.util.List;

public class Course {
    String courseName;
    int maxStudents;
    int qualityRatingOutOf10;
    
    // my variables
    
    int courseId;
    String fieldOfCompetence;
    
   ArrayList<Student> students = new ArrayList<Student>();
   
   String name;
   
   int age;
    
    @Override
    public String toString() {
        return "*** NEW STUDENT CREATED ***\n" + name + " " + age;
    }
}

