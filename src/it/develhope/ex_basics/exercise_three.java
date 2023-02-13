package it.develhope.ex_basics;

public class exercise_three {

        public static void main(String[] args) {
            exercise1();
            exercise2();
            exercise3();
        }

        /**
         * 1: Store your age in an appropriate variable, print it out in
         *    one line using the "+" in your print statement. Only use 1 print statement
         */
        private static void exercise1() {
            System.out.println("Exercise 1:");
            int age = 24;
            System.out.println("your age = " + age);
        }

        /**
         * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
         *
         *    And then print them out on the same line using the following idea
         *
         *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
         */
        private static void exercise2() {
            System.out.println("\nExercise 2:");
            int age = 24;
            String myInitial = "V";
            System.out.println("My Age=" + age +", my initial=" + myInitial);

        }

        /**
         * 3: Write comments above each line of code, describing what the line of code is doing
         */
        private static void exercise3() {
            /**
             * in this fragment we have a print function that says in console
             * "Exercise 3:", whit initial "\n" we intend to go one line under the actual
             * print function.
             */
            System.out.println("\nExercise 3:");

            /**
             * this is a primitive type variable named boolean, with the function to
             * return true or false, in a statement for example or an "if" condition.
             */
            boolean hasEatenLunch = false;

            /**
             * the double variable, another primitive type variable, represents every kind of number
             * even decimal number with your preferred range input. i.g.: 4.567342452353423 ...
             */
            double lunchCost = 5.99;

            /**
             * another print function that recalls the previous initialized variable lunchCost.
             */
            System.out.println("Lunch cost=" + lunchCost);
            /**
             * last print function that recalls the other previous initialized variable hasEatenLunch
             */
            System.out.println("Has Eaten lunch=" + hasEatenLunch);
        }
    }

