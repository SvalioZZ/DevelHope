package it.checkpoint.ck_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Main {
    
    public static void main(String[] args) {
    
        /**
         * Create a Main class in which:
         * - Instantiate 3 objects of type Students using the 2 constructors created.
         * - Instantiate two objects of type Course A and B by enrolling the created students.
         */
        System.out.println("*** Initializing Main program ***\n");
        
        List<Student> students = new ArrayList<>();
        
        Student s1 = new Student(0,"John", "Freedom", "Sesame Street, 21");
        Student s2 = new Student(1,"Jane", "Ouster", "West Central St. , 35");
        Student s3 = new Student();
        s3.setId(2);
        s3.setName("Frank");
        s3.setSurname("Wilson");
        s3.setAddress("Benjamin St. , 21");
        
        students.add(s1);
        students.add(s2);
        students.add(s3);
        
    
        System.out.println("----------------------------------");
        
        List<Course> courses = new ArrayList<>();
        Course c1 = new Course("Java", 12);
        
        c1.addStudent(s1);
        c1.addStudent(s2);
        c1.printStudents();
    
        Course c2 = new Course("C++", 10);
        
        c2.addStudent(s1);
        c2.addStudent(s3);
        c2.printStudents();
    
        System.out.println("----------------------------------");
        
        Course c3 = new Course("Python", 6);
        
        // ----------------------------------------------------------------
        
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
    
        System.out.println(c1.totalCredit(courses));

//        ----------------------------------------------------------------
        
        Student s4 = new Student(3, "Wilfred", "Wilson", "West Central St., 35");
        c3.addStudent(s4);
    
        students.add(s4);
    
        System.out.println("----------------------------------");
        
        System.out.println(c3.checkStudent(s4));
        System.out.println(c1.checkStudent(s4));
        System.out.println(c2.checkStudent(s4));
    
        System.out.println("----------------------------------");
    
        List<Student> searchedStudents = Course.search(students, "jo");
        System.out.println("Researching students results: ");
        for (Student s : searchedStudents) {
            System.out.println(s);
        }
    
    
        System.out.println("----------------------------------\n" +
                                   "All students from all courses: \n" +
                                   students
        );
    }
}
