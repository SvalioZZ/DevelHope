package it.develhope.challenge.menu;

import java.util.*;

public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        
        Scanner scanner_input = new Scanner(System.in);
        
        ArrayList<String> order = new ArrayList<>();
        
        ArrayList<Double> prices = new ArrayList<>();
        
        ArrayList<MenuItem> menuBev = new ArrayList<>();
        menuBev.add(new MenuItem("Coca-Cola", 2.99));
        menuBev.add(new MenuItem("\nSprite", 2.99));
        menuBev.add(new MenuItem("\n7-Up", 2.99));
        menuBev.add(new MenuItem("\nFanta", 2.99));
        menuBev.add(new MenuItem("\nSparkling Water", 1.50));
        menuBev.add(new MenuItem("\nStill Water", 1.50));
        
        ArrayList<MenuItem> menuFirst = new ArrayList<>();
        menuFirst.add(new MenuItem("Pasta Bucatini with Amatriciana sauce", 14.50));
        menuFirst.add(new MenuItem("\nPasta Rigatoni with Carbonara sauce", 14.50));
        menuFirst.add(new MenuItem("\nPasta Pappardella with Wild Boar Ragù sauce", 12.50));
        menuFirst.add(new MenuItem("\nPasta Spaghetti with Bolognese sauce", 12.50));
        menuFirst.add(new MenuItem("\nPasta Spaghetti with Shrimp and Porcini Mushrooms sauce", 18.00));
        
        ArrayList<MenuItem> menuSecond = new ArrayList<>();
        menuSecond.add(new MenuItem("Scallops with white wine", 15.00));
        menuSecond.add(new MenuItem("\nFillet with porcini mushrooms", 24.99));
        menuSecond.add(new MenuItem("\nSliced Beef with Rucola & Grana", 18.99));
        menuSecond.add(new MenuItem("\nDolphin Thread", 29.0));
        menuSecond.add(new MenuItem("\nKobe's Thread (Not Bryant)", 129.99));
        
        
        printMenu();
        String input = scanner_input.nextLine();
        customerOrder(input, menuBev, menuFirst, menuSecond, order, prices, scanner_input);
        
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
            String input,
            ArrayList<MenuItem> menuBev,
            ArrayList<MenuItem> menuFirst,
            ArrayList<MenuItem> menuSecond,
            ArrayList<String> order,
            ArrayList<Double> prices,
            Scanner scanner
    ) throws InterruptedException {
        while (!Objects.equals(input, "0")) {
            switch (String.valueOf(input)) {
                case "1":
                    System.out.println("Beverages: \n" +
                                               menuBev.get(0).toString() + '€'  +
                                               menuBev.get(1).toString() + '€'  +
                                               menuBev.get(2).toString() + '€'  +
                                               menuBev.get(3).toString() + '€'  +
                                               menuBev.get(4).toString() + '€'  +
                                               menuBev.get(5).toString() + '€'
                    );
                    String bevInput = scanner.nextLine();
                    while (!Objects.equals(bevInput, "0")) {
                        switch (String.valueOf(bevInput)) {
                            case "1":
                                order.add(menuBev.get(0).getName());
                                prices.add(menuBev.get(0).getPrice());
                                System.out.println("You ordered: " + order);
                                bevInput = "0";
                                break;
                            case "2":
                                order.add(menuBev.get(1).getName());
                                prices.add(menuBev.get(1).getPrice());
                                System.out.println("You ordered: " + order);
                                bevInput = "0";
                                break;
                            case "3":
                                order.add(menuBev.get(2).getName());
                                prices.add(menuBev.get(2).getPrice());
                                System.out.println("You ordered: " + order);
                                bevInput = "0";
                                break;
                            case "4":
                                order.add(menuBev.get(3).getName());
                                prices.add(menuBev.get(3).getPrice());
                                System.out.println("You ordered: " + order);
                                bevInput = "0";
                                break;
                            case "5":
                                order.add(menuBev.get(4).getName());
                                prices.add(menuBev.get(4).getPrice());
                                System.out.println("You ordered: " + order);
                                bevInput = "0";
                                break;
                            case "6":
                                order.add(menuBev.get(5).getName());
                                prices.add(menuBev.get(5).getPrice());
                                System.out.println("You ordered: " + order);
                                bevInput = "0";
                                break;
                            case "end":
                                System.out.println("Exiting section -> Your order is: " + order);
                                bevInput = "0";
                                printMenu();
                                input = scanner.nextLine();
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
                                               menuFirst.get(0).toString() + '€' +
                                               menuFirst.get(1).toString() + '€' +
                                               menuFirst.get(2).toString() + '€' +
                                               menuFirst.get(3).toString() + '€' +
                                               menuFirst.get(4).toString() + '€'
                    );
                    String firstCourseInput = scanner.nextLine();
                    while (!Objects.equals(firstCourseInput, "0")) {
                        switch (String.valueOf(firstCourseInput)) {
                            case "1":
                                order.add(menuFirst.get(0).getName());
                                prices.add(menuFirst.get(0).getPrice());
                                System.out.println("You ordered " + order);
                                firstCourseInput = "0";
                                break;
                            case "2":
                                order.add(menuFirst.get(1).getName());
                                prices.add(menuFirst.get(1).getPrice());
                                System.out.println("You ordered " + order);
                                firstCourseInput = "0";
                                break;
                            case "3":
                                order.add(menuFirst.get(2).getName());
                                prices.add(menuFirst.get(2).getPrice());
                                System.out.println("You ordered " + order);
                                firstCourseInput = "0";
                                break;
                            case "4":
                                order.add(menuFirst.get(3).getName());
                                prices.add(menuFirst.get(3).getPrice());
                                System.out.println("You ordered " + order);
                                firstCourseInput = "0";
                                break;
                            case "5":
                                order.add(menuFirst.get(4).getName());
                                prices.add(menuFirst.get(4).getPrice());
                                System.out.println("You ordered " + order);
                                firstCourseInput = "0";
                                break;
                            case "end":
                                System.out.println("Exiting section -> your order is: " + order);
                                firstCourseInput = "0";
                                printMenu();
                                input = scanner.nextLine();
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
                                               menuSecond.get(0).toString() + '€' +
                                               menuSecond.get(1).toString() + '€' +
                                               menuSecond.get(2).toString() + '€' +
                                               menuSecond.get(3).toString() + '€' +
                                               menuSecond.get(4).toString() + '€'
                    );
                    String secondCourseInput = scanner.nextLine();
                    while (!Objects.equals(secondCourseInput, "0")) {
                        switch (String.valueOf(secondCourseInput)) {
                            case "1":
                                order.add(menuSecond.get(0).getName());
                                prices.add(menuSecond.get(0).getPrice());
                                System.out.println("You ordered " + order);
                                secondCourseInput = "0";
                                break;
                            case "2":
                                order.add(menuSecond.get(1).getName());
                                prices.add(menuSecond.get(1).getPrice());
                                System.out.println("You ordered " + order);
                                secondCourseInput = "0";
                                break;
                            case "3":
                                order.add(menuSecond.get(2).getName());
                                prices.add(menuSecond.get(2).getPrice());
                                System.out.println("You ordered " + order);
                                secondCourseInput = "0";
                                break;
                            case "4":
                                order.add(menuSecond.get(3).getName());
                                prices.add(menuSecond.get(3).getPrice());
                                System.out.println("You ordered " + order);
                                secondCourseInput = "0";
                                break;
                            case "5":
                                order.add(menuSecond.get(4).getName());
                                prices.add(menuSecond.get(4).getPrice());
                                System.out.println("You ordered " + order);
                                secondCourseInput = "0";
                                break;
                            case "end":
                                System.out.println("Exiting section -> your order is: " + order);
                                secondCourseInput = "0";
                                printMenu();
                                input = scanner.nextLine();
                                break;
                            default:
                                System.out.println("Invalid order");
                                secondCourseInput = "0";
                                break;
                        }
                    }
                    break;
                case "4":
                    System.out.println("Side Courses \n");
                    break;
                case "5":
                    System.out.println("Appetizers: \n");
                    break;
                case "6":
                    System.out.println("Desserts: \n");
                    break;
                case "end":
                    System.out.println("Thank you for choosing us! Have a nice day!");
                    System.out.println("Your order is: " + order +
                                               "\n --- Payment in process --- \n");
                    Thread.sleep(1500);
                    System.out.println(".");
                    Thread.sleep(1500);
                    System.out.println("..");
                    Thread.sleep(1500);
                    System.out.println("...");
                    Thread.sleep(1500);
                    
                    double getOrderPrice = 0;
                    for (Double price : prices) {
                        getOrderPrice += price;
                    }
                    System.out.println("Your total is " + getOrderPrice + '€');
                    input = "0";
                    break;
                default:
                    System.out.println("The number you entered is not valid");
                    input = scanner.nextLine();
                    break;
            }
        }
        System.out.println("\n. \n.. \n... \n *** You have finished your order ***");
    }
}
