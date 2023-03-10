package it.checkpoint.ck_3;

import it.checkpoint.ck_2.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    
    public static void main(String[] args) {
        
        /**
         * 3) Create a Main class in which to:
         * ● Instantiate 3 objects of type Students.
         * ● Instantiate a DegreeCourse object and enroll the students created.
         * ● Print the students enrolled in the degree course object.
         * ● Create a new student and print the updated count of instances
         * created
         * ● Remove one of the students from the course and print the list of students
         * updated.
         */
        Map<String, Integer> g1 = Map.of("A", 10);
        Map<String, Integer> g2 = Map.of("B", 9);
        Map<String, Integer> g3 = Map.of("C", 8);
        Map<String, Integer> g4 = Map.of("D", 7);
        Map<String, Integer> g5 = Map.of("E", 6);
        Map<String, Integer> g6 = Map.of("F", 5);
        
        Student s1 = new Student("Valerio", "Corallini");
        Student s2 = new Student("Federico", "Scozzari");
        Student s3 = new Student("Daniele", "Romani Tabai");
    
        List<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        
        int increment = 1;
        
        Student s4 = new Student("Kristian", "Bikaj");
        students.add(s4);
        
        for (Student s : students){
            s.setNumberOfStudentsCreated(increment++);
        }
    
        System.out.println("Instances created: " + students.size());
        
        s1.setGrades(g2);
        s2.setGrades(g3);
        s3.setGrades(g4);
        s4.setGrades(g3);
        
        BachelorD c1 = new BachelorD("Java");
        c1.addStudent(s1);
        c1.addStudent(s2);
        c1.addStudent(s3);
        c1.addStudent(s4);
        
        c1.printStudents();
        
        c1.removeStudent(s3);
        
        c1.printStudents();
        
    }

}
