package it.develhope.challenge.openAi.ex_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NewExeption {
    
        StudentManagement studentManagement = new StudentManagement();
        Student std1 = new Student("John", "Doyle", 0);
        Student std2 = new Student("Francis", "Capone", 1);
        Student std3 = new Student("Martin", "Doyle", 2);
        Student std4 = new Student("Jeremy", "Irons", 3);
        Student std5 = new Student("Helena", "Bonham Carter", 4);
        Student std6 = new Student("Jessica", "Alba", 5);
        Student std7 = new Student("Dorothy", "Farrel", 6);
        
        studentManagement.addStudent(std1);
        studentManagement.addStudent(std2);
        studentManagement.addStudent(std3);
        studentManagement.addStudent(std4);
        studentManagement.addStudent(std5);
        studentManagement.addStudent(std6);
        studentManagement.addStudent(std7);

        printOptions();
        Scanner scanner = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);
        int userInput = scanner.nextInt();
        
        while (userInput != 0) {
            switch (userInput) {
                case 1:
                    try {
                        scannerString.nextLine();
                        System.out.println("Insert the name of the new student:");
                        Student newStudent = new Student();
                        newStudent.setName(scannerString.nextLine());
                        System.out.println("Insert the surname of the new student:");
                        newStudent.setSurname(scannerString.nextLine());
                        System.out.println("Insert the ID of the new student:");
                        newStudent.setId(scannerString.nextInt());
                        studentManagement.addStudent(newStudent);
                        System.out.println("New student has been added!\n\n");
                        printOptions();
                        userInput = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Error: " + e.getMessage());
                        userInput = 1;
                    }
                    break;
                case 2:
                    System.out.println("All students:");
                    studentManagement.printStudents();
                    printOptions();
                    userInput = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Select the ID of the student you want to delete:");
                    studentManagement.removeStudent(studentManagement.getStudents(inputInt.nextInt()).getId());
                    printOptions();
                    userInput = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("Select the ID of the student you want to search:");
                    Student searched = studentManagement.getStudents(inputInt.nextInt());
                    searched.printInfo();
                    System.out.println("\n");
                    printOptions();
                    userInput = scanner.nextInt();
                    break;
                case 5:
                    System.out.println("Ordered list of students by surname:\n");
                    studentManagement.sortStudentsBySurname();
                    printOptions();
                    userInput = scanner.nextInt();
                    break;
                case 6:
                    System.out.println("Reordered list of students by ID:\n");
                    studentManagement.sortById();
                    printOptions();
                    userInput = scanner.nextInt();
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        System.out.println("There was an error!" + e.getMessage());
                    }
                    System.out.println("*** Correctly exited program ***");
                    userInput = 0;
                    break;
                default:
                    System.out.println("Insert a valid option!");
                    printOptions();
                    userInput = scanner.nextInt();
                    break;
            }
        }
    }
    
    public static void printOptions() {
        System.out.println("""
                Welcome to Student Management System!
                
                What do you want to do?
                
                1. Add a new student;
                2. View all students;
                3. Delete a student;
                4. Search for a student by id;
                5. Order a student by surname;
                6. Reorder all students by ID;
                7. Exit program.
                
                """);
    }
    
}
