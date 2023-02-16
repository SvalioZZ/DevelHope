package it.develhope.challenge.menu;

import java.util.*;

import static java.awt.SystemColor.menu;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.valueOf;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner_input = new Scanner(System.in);
        
        ArrayList<String> order = new ArrayList<>();
        
        ArrayList<MenuItem> menuBev = new ArrayList<>();
        menuBev.add(new MenuItem("Coca-Cola", 2.99));
        menuBev.add(new MenuItem("Sprite", 2.99));
        menuBev.add(new MenuItem("7-Up", 2.99));
        menuBev.add(new MenuItem("Fanta", 2.99));
        menuBev.add(new MenuItem("Sparkling Water", 1.50));
        menuBev.add(new MenuItem("Still Water", 1.50));
        
        ArrayList<MenuItem> menuFirst = new ArrayList<>();
        menuFirst.add(new MenuItem("Pasta Bucatini with Amatriciana sauce", 14.50));
        menuFirst.add(new MenuItem("Pasta Rigatoni with Carbonara sauce", 14.50));
        menuFirst.add(new MenuItem("Pasta Pappardella with Wild Boar Ragù sauce", 12.50));
        menuFirst.add(new MenuItem("Pasta Spaghetti with Bolognese sauce", 12.50));
        menuFirst.add(new MenuItem("Pasta Spaghetti with Shrimp and Porcini Mushrooms sauce", 18.00));
        
        ArrayList<MenuItem> menuSecond = new ArrayList<>();
        menuSecond.add(new MenuItem("Scallops with white wine", 15.00));
        menuSecond.add(new MenuItem("Fillet with porcini mushrooms", 24.99));
        menuSecond.add(new MenuItem("Sliced Beef with Rucola & Grana", 18.99));
        menuSecond.add(new MenuItem("Dolphin Thread", 29));
        menuSecond.add(new MenuItem("Kobe's Thread (Not Bryant)", 129.99));
        
        
        printMenu();
        int input = parseInt(scanner_input.nextLine());
        customerOrder(input, menuBev, menuFirst, menuSecond, order, scanner_input);
        
    }
    
    
    static void printMenu() {
        System.out.println("""
                                
                *** Restaurant Menu ***
                                
                Insert a number to navigate in the menu ...
                                
                1 - BEVERAGES
                2 - FIRST COURSES
                3 - SECOND COURSES
                4 - SIDES COURSES
                5 - DESSERT
                6 - APPETIZERS
                0 - FINISH ORDER
                END - RETURN IN THE PREVIOUS ORDER
                """);
    }
    
    static void customerOrder(
            int input,
            ArrayList<MenuItem> menuBev,
            ArrayList<MenuItem> menuFirst,
            ArrayList<MenuItem> menuSecond,
            ArrayList<String> order,
            Scanner scanner
    ) {
        while (input != 0) {
            switch (String.valueOf(input)) {
                case "1":
                    System.out.println("Beverages: \n" +
                                               menuBev.get(0).toString() + "\n" +
                                               menuBev.get(1).toString() + "\n" +
                                               menuBev.get(2).toString() + "\n" +
                                               menuBev.get(3).toString() + "\n" +
                                               menuBev.get(4).toString() + "\n" +
                                               menuBev.get(5).toString() + "\n"
                    );
                    String bevInput = scanner.nextLine();
                    while (!Objects.equals(bevInput, "0")) {
                        switch (String.valueOf(bevInput)) {
                            case "1":
                                order.add(menuBev.get(0).getName());
                                System.out.println("You ordered: " + order);
                                bevInput = "0";
                                break;
                            case "2":
                                order.add(menuBev.get(1).getName());
                                System.out.println("You ordered: " + order);
                                bevInput = "0";
                                break;
                            case "3":
                                order.add(menuBev.get(2).getName());
                                System.out.println("You ordered: " + order);
                                bevInput = "0";
                                break;
                            case "4":
                                order.add(menuBev.get(3).getName());
                                System.out.println("You ordered: " + order);
                                bevInput = "0";
                                break;
                            case "5":
                                order.add(menuBev.get(4).getName());
                                System.out.println("You ordered: " + order);
                                bevInput = "0";
                                break;
                            case "6":
                                order.add(menuBev.get(5).getName());
                                System.out.println("You ordered: " + order);
                                bevInput = "0";
                                break;
                            case "end":
                                System.out.println("Exiting section -> Your order is: " + order);
                                bevInput = "0";
                                printMenu();
                                input = scanner.nextInt();
                                break;
                            default:
                                System.out.println("Invalid order");
                                bevInput = "0";
                                break;
                        }
                    }
                    break;
                case "2":
                    System.out.println("First Courses: \n" +
                                               menuFirst.get(0).toString() + "\n" +
                                               menuFirst.get(1).toString() + "\n" +
                                               menuFirst.get(2).toString() + "\n" +
                                               menuFirst.get(3).toString() + "\n" +
                                               menuFirst.get(4).toString() + "\n"
                    );
                    String firstCourseInput = scanner.nextLine();
                    while (!Objects.equals(firstCourseInput, "0")) {
                        switch (String.valueOf(firstCourseInput)) {
                            case "1":
                                order.add(menuFirst.get(0).getName());
                                System.out.println("You ordered " + order);
                                firstCourseInput = "0";
                                break;
                            case "2":
                                order.add(menuFirst.get(1).getName());
                                System.out.println("You ordered " + order);
                                firstCourseInput = "0";
                                break;
                            case "3":
                                order.add(menuFirst.get(2).getName());
                                System.out.println("You ordered " + order);
                                firstCourseInput = "0";
                                break;
                            case "4":
                                order.add(menuFirst.get(3).getName());
                                System.out.println("You ordered " + order);
                                firstCourseInput = "0";
                                break;
                            case "5":
                                order.add(menuFirst.get(4).getName());
                                System.out.println("You ordered " + order);
                                firstCourseInput = "0";
                                break;
                            case "end":
                                System.out.println("Exiting section -> your order is: " + order);
                                firstCourseInput = "0";
                                printMenu();
                                input = scanner.nextInt();
                                break;
                            default:
                                System.out.println("Try with a different input");
                                firstCourseInput = "0";
                                break;
                        }
                    }
                    break;
                case "3":
                    System.out.println("Second Courses: \n" +
                                               menuSecond.get(0).toString() + "\n" +
                                               menuSecond.get(1).toString() + "\n" +
                                               menuSecond.get(2).toString() + "\n" +
                                               menuSecond.get(3).toString() + "\n" +
                                               menuSecond.get(4).toString() + "\n"
                    );
                    String secondCourseInput = scanner.nextLine();
                    while (!Objects.equals(secondCourseInput, "0")) {
                        switch (String.valueOf(secondCourseInput)) {
                            case "1":
                                order.add(menuSecond.get(0).getName());
                                System.out.println("You ordered " + order);
                                secondCourseInput = "0";
                                break;
                            case "2":
                                order.add(menuSecond.get(1).getName());
                                System.out.println("You ordered " + order);
                                secondCourseInput = "0";
                                break;
                            case "3":
                                order.add(menuSecond.get(2).getName());
                                System.out.println("You ordered " + order);
                                secondCourseInput = "0";
                                break;
                            case "4":
                                order.add(menuSecond.get(3).getName());
                                System.out.println("You ordered " + order);
                                secondCourseInput = "0";
                                break;
                            case "5":
                                order.add(menuSecond.get(4).getName());
                                System.out.println("You ordered " + order);
                                secondCourseInput = "0";
                                break;
                            case "end":
                                System.out.println("Exiting section -> your order is: " + order);
                                secondCourseInput = "0";
                                printMenu();
                                input = scanner.nextInt();
                                break;
                            default:
                                System.out.println("Invalid order");
                                secondCourseInput = "0";
                                break;
                        }
                    }
                    break;
                case "4":
                    System.out.println("Third Courses: \n");
                    break;
                case "5":
                    System.out.println("Sides Courses: \n");
                    break;
                case "6":
                    System.out.println("Appetizers: \n");
                    break;
                case "end":
                    System.out.println("Thank you for choosing us! Have a nice day!");
                    break;
                default:
                    System.out.println("The number you entered is not valid");
                    break;
            }
        }
        System.out.println("You have finished your order");
    }
}
