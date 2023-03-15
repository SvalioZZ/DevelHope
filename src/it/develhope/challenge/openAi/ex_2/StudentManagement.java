package it.develhope.challenge.openAi.ex_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentManagement {
    
    private List<Student> students;
    
    public StudentManagement() {
        this.students = new ArrayList<>();
    }
    
    public void printStudents() {
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getSurname() + " - " + student.getId());
        }
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    public boolean removeStudent(Student student) {
        return students.remove(student);
    }
    
    public Student getStudents(int id) {
        Student result = new Student();
        try {
            result = students.get(id);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return result;
    }
    
    public void sortById() {
        int n = students.size();
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (students.get(j).getId() > students.get(j + 1).getId()){
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
    
    public void sortStudentsBySurname() {
//      List<Student> sortedStudents = students.stream().sorted(Comparator.comparing(Student::getSurname)).toList();
//      for (Student student : sortedStudents) {
//          student.printInfo();
//      }
        int n = students.size();
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (students.get(j).getSurname().compareTo(students.get(j + 1).getSurname()) > 0) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, the list is already sorted
            if (!swapped) {
                break;
            }
        }
        students.forEach(Student::printInfo);
    }
    
}
