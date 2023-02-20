package it.develhope.classes.ex3;


    public class Student {
        private String name;
        private int age;
        private String surname;
        private String address;
        private int addressId;
    
        public String getName() {
            return name;
        }
    
        public Student setName(String name) {
            char [] chars = name.toCharArray();
            for (char c : chars) {
                if (Character.isDigit(c)){
                    return this;
                }
            }
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
            return surname;
        }
    
        public Student setSurname(String surname) {
            char [] chars = name.toCharArray();
            for (char c : chars) {
                if (Character.isDigit(c)){
                    return this;
                }
            }
            this.name = name;
            this.surname = surname;
            return this;
        }
    
        public String getAddress() {
            return address;
        }
    
        public Student setAddress(String address) {
            this.address = address;
            return this;
        }
    
        public int getAddressId() {
            return addressId;
        }
    
        public Student setAddressId(int addressId) {
            this.addressId = addressId;
            return this;
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
        
        
    }

