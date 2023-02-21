package it.develhope.classes.ex3;

public class Encapsulation {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }
    
    /**
     * 1: Copy over the student class
     * <p>
     * Make sure there are 5 fields inside, if they are not simply create some more.
     * make every field private first.
     * <p>
     * Then create getters and setters for each of these 5 fields.
     * <p>
     * Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        Student student = new Student();
        // Write and use your 5 getters and setters!
        
        student.setName("V4l3r10");
        student.setSurname("C0r4ll1n1");
        student.setAge(23);
        student.setAddress("Via Napoli");
        student.setAddressId(11);
        
        System.out.println(
                student.getName() + "\n" +
                        student.getSurname() + "\n" +
                        student.getAge() + "\n" +
                        student.getAddress() + "\n" +
                        student.getAddressId()
        
        );
    
        System.out.println("Total count for number occurencies of both name and surname: " +
                                   (student.getNameCount() + student.getSurnameCount()));
    }
    
    /**
     * 2: Create 3 setter constraints for the student class
     * <p>
     * Think about what reasonably constraints are?
     * <p>
     * Should a student be able to be a negative age?
     * <p>
     * Create a counter for one of the getters, try to think about
     * what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        //Write your code here
        Student student = new Student();
        student.setName("Viorica Gabriela");
        student.setSurname("Hacman");
        student.setAge(24);
        student.setAddress("Via Napoli");
        student.setAddressId(11);
        
        System.out.println(
                student.getName() + "\n" +
                        student.getSurname() + "\n" +
                        student.getAge() + "\n" +
                        student.getAddress() + "\n" +
                        student.getAddressId()
        
        );
        System.out.println("Total count for number occurencies of both name and surname: " +
                                   (student.getNameCount() + student.getSurnameCount()));
    }
    
}
