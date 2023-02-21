package it.develhope.classes.ex3;


import java.util.Arrays;

public class Student {
        private String name;
        private int age;
        private String surname;
        private String address;
        private int addressId;
        
        private int count = 0;
    
        public String getName() {
            String[] chars = name.trim().split("");
            String[] numbers = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
            System.out.println(Arrays.toString(chars));
            for (String c : chars) {
                for (String i : numbers) {
                    if (c.equals(i)) {
                        count++;
                    }
                }
            }
            System.out.println(count);
            return name;
        }
    
        public Student setName(String name) {
            this.name = name;
            return this;
        }
    
        public int getAge() {
            return age;
        }
    
        public Student setAge(int age) {
            if (age > 0) {
                this.age = age;
            } else {
                System.out.println("Invalid");
            }
            return this;
        }
    
        public String getSurname() {
            String[] chars = surname.trim().split("");
            String[] numbers = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
            System.out.println(Arrays.toString(chars));
            int count = 0;
            for (String c : chars) {
                for (String i : numbers) {
                    if (c.equals(i)) {
                        count++;
                    }
                }
            }
            System.out.println(count);
            return surname;
        }
    
        public void setSurname(String surname) {
            this.surname = surname;
        }
    
        public String getAddress() {
            return address;
        }
    
        public void setAddress(String address) {
            this.address = address;
        }
    
        public int getAddressId() {
            return addressId;
        }
    
        public void setAddressId(int addressId) {
            this.addressId = addressId;
        }
    
        public Student(String name, int age) {
            System.out.println("Constructing...");
            System.out.println("Constructed!");
            this.name = name;
            this.age = age;
        }
    
        public Student(String name) {
            this.name = name;
        }
    
        public Student(int age) {
            this.age = age;
        }
    
        public Student() {
        }
    
        @Override
        public String toString() {
            return "*** New Student ***\nName: " + name + "\nAge: " + age;
        }
        
        public int getNameCount() {
            return count;
        }
        public  int getSurnameCount() {
            return count;
        }
        
    }

