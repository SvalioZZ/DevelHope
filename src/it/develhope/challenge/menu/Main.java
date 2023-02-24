package it.develhope.challenge.menu;

import java.awt.*;
import java.util.*;

import static it.develhope.challenge.menu.MenuItem.round;

public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        
        Scanner scanner_input = new Scanner(System.in);
        
        ArrayList<String> order = new ArrayList<>();
        
        ArrayList<Double> prices = new ArrayList<>();
        
        ArrayList<MenuItem> menuBev = new ArrayList<>();
        menuBev.add(new MenuItem("\nCoca-Cola", 2.99));
        menuBev.add(new MenuItem("\nSprite", 2.99));
        menuBev.add(new MenuItem("\n7-Up", 2.99));
        menuBev.add(new MenuItem("\nFanta", 2.99));
        menuBev.add(new MenuItem("\nSparkling Water", 1.50));
        menuBev.add(new MenuItem("\nStill Water", 1.50));
        
        ArrayList<MenuItem> menuFirst = new ArrayList<>();
        menuFirst.add(new MenuItem("\nPasta Bucatini with Amatriciana sauce", 14.50));
        menuFirst.add(new MenuItem("\nPasta Rigatoni with Carbonara sauce", 14.50));
        menuFirst.add(new MenuItem("\nPasta Pappardella with Wild Boar Ragù sauce", 12.50));
        menuFirst.add(new MenuItem("\nPasta Spaghetti with Bolognese sauce", 12.50));
        menuFirst.add(new MenuItem("\nPasta Spaghetti with Shrimp and Porcini Mushrooms sauce", 18.00));
        
        ArrayList<MenuItem> menuSecond = new ArrayList<>();
        menuSecond.add(new MenuItem("\nScallops with white wine", 15.00));
        menuSecond.add(new MenuItem("\nFillet with porcini mushrooms", 24.99));
        menuSecond.add(new MenuItem("\nSliced Beef with Rucola & Grana", 18.99));
        menuSecond.add(new MenuItem("\nDolphin Thread", 29.0));
        menuSecond.add(new MenuItem("\nKobe's Thread (Not Bryant)", 129.99));
        
        ArrayList<MenuItem> menuApp = new ArrayList<>();
        menuApp.add(new MenuItem("\nLiver Croutons", 9.99));
        menuApp.add(new MenuItem("\nCroutons with Tomatoes", 9.99));
        menuApp.add(new MenuItem("\nChicken Wings", 20.99));
        menuApp.add(new MenuItem("\nGolden Cheese", 120.00));
        menuApp.add(new MenuItem("\nA Whole Boar", 23.99));
        
        ArrayList<MenuItem> menuDess = new ArrayList<>();
        menuDess.add(new MenuItem("\nChocolate/Strawberry Cheesecake", 7.99));
        menuDess.add(new MenuItem("\nTiramisù", 9.99));
        menuDess.add(new MenuItem("\nApple Pie", 5.99));
        menuDess.add(new MenuItem("\nRed Velvet Cake", 7.99));
        menuDess.add(new MenuItem("\nBrownie", 4.99));
        
        
        printMenu();
        String input = scanner_input.nextLine();
        customerOrder(input, menuBev, menuApp, menuFirst, menuSecond, menuDess, order, prices, scanner_input);
    }
    
    
    static void printMenu() {
        System.out.println("""
                                
                *** Restaurant Menu ***
                                
                Insert a number to navigate in the menu ...
                                
                1 - BEVERAGES
                2 - APPETIZERS
                3 - FIRST COURSES
                4 - SECOND COURSES
                5 - DESSERT
                0 - FINISH ORDER
                END - RETURN IN THE PREVIOUS ORDER
                """);
    }
    
    static void customerOrder(
            String input,
            ArrayList<MenuItem> menuBev,
            ArrayList<MenuItem> menuApp,
            ArrayList<MenuItem> menuFirst,
            ArrayList<MenuItem> menuSecond,
            ArrayList<MenuItem> menuDess,
            ArrayList<String> order,
            ArrayList<Double> prices,
            Scanner scanner
    ) throws InterruptedException {
        while (!Objects.equals(input, "0")) {
            switch (String.valueOf(input)) {
                case "1":
                    System.out.println("Beverages: \n" +
                                               menuBev.get(0).toString() + '€' +
                                               menuBev.get(1).toString() + '€' +
                                               menuBev.get(2).toString() + '€' +
                                               menuBev.get(3).toString() + '€' +
                                               menuBev.get(4).toString() + '€' +
                                               menuBev.get(5).toString() + '€'
                    );
                    String bevInput = scanner.nextLine();
                    while (!Objects.equals(bevInput, "0")) {
                        switch (String.valueOf(bevInput)) {
                            case "1":
                                order.add(menuBev.get(0).getName());
                                prices.add(menuBev.get(0).getPrice());
                                System.out.println("You ordered: \n" + order);
                                bevInput = "0";
                                break;
                            case "2":
                                order.add(menuBev.get(1).getName());
                                prices.add(menuBev.get(1).getPrice());
                                System.out.println("You ordered: \n" + order);
                                bevInput = "0";
                                break;
                            case "3":
                                order.add(menuBev.get(2).getName());
                                prices.add(menuBev.get(2).getPrice());
                                System.out.println("You ordered: \n" + order);
                                bevInput = "0";
                                break;
                            case "4":
                                order.add(menuBev.get(3).getName());
                                prices.add(menuBev.get(3).getPrice());
                                System.out.println("You ordered: \n" + order);
                                bevInput = "0";
                                break;
                            case "5":
                                order.add(menuBev.get(4).getName());
                                prices.add(menuBev.get(4).getPrice());
                                System.out.println("You ordered: \n" + order);
                                bevInput = "0";
                                break;
                            case "6":
                                order.add(menuBev.get(5).getName());
                                prices.add(menuBev.get(5).getPrice());
                                System.out.println("You ordered: \n" + order);
                                bevInput = "0";
                                break;
                            case "x":
                                System.out.println("Exiting section -> Your order is: \n" + order);
                                bevInput = "0";
                                printMenu();
                                input = scanner.nextLine();
                                break;
                            default:
                                System.out.println("Try with a different input");
                                bevInput = "0";
                                break;
                        }
                    }
                    break;
                case "2":
                    System.out.println("Appetizers: \n" +
                                               menuApp.get(0).toString() + '€' +
                                               menuApp.get(1).toString() + '€' +
                                               menuApp.get(2).toString() + '€' +
                                               menuApp.get(3).toString() + '€' +
                                               menuApp.get(4).toString() + '€'
                    );
                    String appetizerInput = scanner.nextLine();
                    while (!Objects.equals(appetizerInput, "0")) {
                        switch (String.valueOf(appetizerInput)) {
                            case "1":
                                order.add(menuApp.get(0).getName());
                                prices.add(menuApp.get(0).getPrice());
                                System.out.println("You ordered: \n" + order);
                                appetizerInput = "0";
                                break;
                            case "2":
                                order.add(menuApp.get(1).getName());
                                prices.add(menuApp.get(1).getPrice());
                                System.out.println("You ordered: \n" + order);
                                appetizerInput = "0";
                                break;
                            case "3":
                                order.add(menuApp.get(2).getName());
                                prices.add(menuApp.get(2).getPrice());
                                System.out.println("You ordered: \n" + order);
                                appetizerInput = "0";
                                break;
                            case "4":
                                order.add(menuApp.get(3).getName());
                                prices.add(menuApp.get(3).getPrice());
                                System.out.println("You ordered: \n" + order);
                                appetizerInput = "0";
                                break;
                            case "5":
                                order.add(menuApp.get(4).getName());
                                prices.add(menuApp.get(4).getPrice());
                                System.out.println("You ordered: \n" + order);
                                appetizerInput = "0";
                                break;
                            case "x":
                                System.out.println("Exiting section -> your order is: \n" + order);
                                appetizerInput = "0";
                                printMenu();
                                input = scanner.nextLine();
                                break;
                            default:
                                System.out.println("Try with a different input");
                                appetizerInput = "0";
                                break;
                        }
                    }
                    break;
                case "3":
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
                                System.out.println("You ordered: \n" + order);
                                firstCourseInput = "0";
                                break;
                            case "2":
                                order.add(menuFirst.get(1).getName());
                                prices.add(menuFirst.get(1).getPrice());
                                System.out.println("You ordered: \n" + order);
                                firstCourseInput = "0";
                                break;
                            case "3":
                                order.add(menuFirst.get(2).getName());
                                prices.add(menuFirst.get(2).getPrice());
                                System.out.println("You ordered: \n" + order);
                                firstCourseInput = "0";
                                break;
                            case "4":
                                order.add(menuFirst.get(3).getName());
                                prices.add(menuFirst.get(3).getPrice());
                                System.out.println("You ordered: \n" + order);
                                firstCourseInput = "0";
                                break;
                            case "5":
                                order.add(menuFirst.get(4).getName());
                                prices.add(menuFirst.get(4).getPrice());
                                System.out.println("You ordered: \n" + order);
                                firstCourseInput = "0";
                                break;
                            case "x":
                                System.out.println("Exiting section -> your order is: \n" + order);
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
                case "4":
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
                                System.out.println("You ordered: \n" + order);
                                secondCourseInput = "0";
                                break;
                            case "2":
                                order.add(menuSecond.get(1).getName());
                                prices.add(menuSecond.get(1).getPrice());
                                System.out.println("You ordered: \n" + order);
                                secondCourseInput = "0";
                                break;
                            case "3":
                                order.add(menuSecond.get(2).getName());
                                prices.add(menuSecond.get(2).getPrice());
                                System.out.println("You ordered: \n" + order);
                                secondCourseInput = "0";
                                break;
                            case "4":
                                order.add(menuSecond.get(3).getName());
                                prices.add(menuSecond.get(3).getPrice());
                                System.out.println("You ordered: \n" + order);
                                secondCourseInput = "0";
                                break;
                            case "5":
                                order.add(menuSecond.get(4).getName());
                                prices.add(menuSecond.get(4).getPrice());
                                System.out.println("You ordered: \n" + order);
                                secondCourseInput = "0";
                                break;
                            case "x":
                                System.out.println("Exiting section -> your order is: \n" + order);
                                secondCourseInput = "0";
                                printMenu();
                                input = scanner.nextLine();
                                break;
                            default:
                                System.out.println("Try with a different input");
                                secondCourseInput = "0";
                                break;
                        }
                    }
                    break;
                case "5":
                    System.out.println("Desserts: \n" +
                                               menuDess.get(0).toString() + '€' +
                                               menuDess.get(1).toString() + '€' +
                                               menuDess.get(2).toString() + '€' +
                                               menuDess.get(3).toString() + '€' +
                                               menuDess.get(4).toString() + '€'
                    );
                    String dessertInput = scanner.nextLine();
                    while(!Objects.equals(dessertInput, "0")){
                        switch (String.valueOf(dessertInput)){
                            case "1":
                                order.add(menuDess.get(0).getName());
                                prices.add(menuDess.get(0).getPrice());
                                System.out.println("You ordered: \n" + order);
                                dessertInput = "0";
                                break;
                            case "2":
                                order.add(menuDess.get(1).getName());
                                prices.add(menuDess.get(1).getPrice());
                                System.out.println("You ordered: \n" + order);
                                dessertInput = "0";
                                break;
                            case "3":
                                order.add(menuDess.get(2).getName());
                                prices.add(menuDess.get(2).getPrice());
                                System.out.println("You ordered: \n" + order);
                                dessertInput = "0";
                                break;
                            case "4":
                                order.add(menuDess.get(3).getName());
                                prices.add(menuDess.get(3).getPrice());
                                System.out.println("You ordered: \n" + order);
                                dessertInput = "0";
                                break;
                            case "5":
                                order.add(menuDess.get(4).getName());
                                prices.add(menuDess.get(4).getPrice());
                                System.out.println("You ordered: \n" + order);
                                dessertInput = "0";
                                break;
                            case "x":
                                System.out.println("Exiting section -> your order is: \n" + order);
                                dessertInput = "0";
                                printMenu();
                                input = scanner.nextLine();
                                break;
                            default:
                                System.out.println("Try with a different input");
                                dessertInput = "0";
                                break;
                        }
                    }
                    break;
                case "x":
                    System.out.println("Thank you for choosing us! Have a nice day!");
                    System.out.println("Your order is: \n" + order +
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
                    System.out.println("Your total is: \n" + round(getOrderPrice, 2) + '€');
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
