package it.develhope;

public class exercise_ten_switch {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3Bonus();
//        getPrime(17);
    }

    /**
     * 1: Finish this switch statement to include:
     * "cheeseburger" cost: 7.99 and calories 850
     * "fries" cost: 3.99 and calories 250
     */
    public static void exercise1() {
        System.out.println("Exercise 1 - Fast Food Order:");
        String fastFoodOrder = "hamburger";
        double orderCost = 0;
        int orderCalories = 0;

        switch (fastFoodOrder) {
        case "hamburger":
            orderCalories = 700;
            orderCost = 5.99;
            break;
        case "milkshake":
            orderCalories = 600;
            orderCost = 2.50;
            break;
        // Your cases here!
        case "cheeseburger":
            orderCost = 7.99;
            orderCalories = 850;
            break;
        case "fries":
            orderCost = 3.99;
            orderCalories = 250;
            break;

        }

        System.out.println("Order receipt:" +
                "\nOrder item=" + fastFoodOrder +
                "\nkCal=" + orderCalories +
                "\ncost=€" + orderCost
        );
    }

    /**
     * 2: Complete a switch statement to achieve the following
     * <p>
     * If the user enters a prime number between 0-20 (2, 3, 5, 7, 11, 13, 17, 19)
     * <p>
     * Print "This is the nth largest prime number under 20", i.e.
     * 19 -> "This the largest prime number under 20"
     * 11 -> "This is the 4th largest prime number under 20"
     * <p>
     * If the number is above 20, or not prime number print: "Invalid entry", use a 'default'
     * statement for this
     */
    public static void exercise2() {
        System.out.println("\nExercise 2 - Prime numbers:");

        int inputNumber = 16;

        /**
         *     i = 2;
         *     boolean flag = false;
         *     while (i <= num / 2) {
         *       // condition for non prime number                 this is a method to define whether a number
         *       if (num % i == 0) {                               is a prime one, or not.
         *         flag = true;
         *         break;
         *       }
         *
         *       ++i;
         *     }
         */

        // Your switch statement here
            switch (inputNumber) {
                case 19:
                    System.out.println("this is the first prime number under 20");
                    break;
                case 17:
                    System.out.println("this is the second largest prime number under 20");
                    break;
                case 13:
                    System.out.println("this is the third largest prime number under 20");
                    break;
                case 11:
                    System.out.println("this is the fourth largest prime number under 20");
                    break;
                case 7:
                    System.out.println("this is the fifth largest prime number under 20");
                    break;
                case 5:
                    System.out.println("this is the sixth largest prime number under 20");
                    break;
                case 3:
                    System.out.println("this is the penultimate prime number under 20");
                    break;
                case 1:
                    System.out.println("this is the last prime number under 20");
                    break;
                default:
                    System.out.println("insert a valid number");
                    break;
            }

        }


    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * -------------------------------------------------------------------------
     * Complete exercise 2 a switch statement with -> instead of :
     * i.e. case 19 -> System.out.print("Largest prime under 20");
     */
    public static void exercise3Bonus() {
        System.out.println("\nExercise 3 - Prime  numbers (Bonus)");
        
        int inputNumber = 17;
        
        // Your switch statement here
        
        switch (inputNumber) {
            case 19 -> System.out.println("this is the first prime number under 20");
            case 17 -> System.out.println("this is the second largest prime number under 20");
            case 13 -> System.out.println("this is the third largest prime number under 20");
            case 11 -> System.out.println("this is the fourth largest prime number under 20");
            case 7 -> System.out.println("this is the fifth largest prime number under 20");
            case 5 -> System.out.println("this is the sixth largest prime number under 20");
            case 3 -> System.out.println("this is the penultimate prime number under 20");
            case 1 -> System.out.println("this is the last prime number under 20");
            default -> System.out.println("insert a valid number");
        }
        
    }
}
    
//    public static void getPrime (int input) {
//            int i = 2;
//            if (input % i == 0) {
//                System.out.println("this is not a prime number");
//            } else {
//                System.out.println("This is a prime number: " + input);
//            }
//        }
//    }

