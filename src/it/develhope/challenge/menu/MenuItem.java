package it.develhope.challenge.menu;

public class MenuItem{
    
    String name;
    double price;
    
    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return name + " - " + price;
    }
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    //
//    // beverages:
//
//    MenuItem cocaCola = new MenuItem("Coca-Cola", 2.99);
//    MenuItem sprite = new MenuItem("Sprite", 2.99);
//    MenuItem sevenUp = new MenuItem("7-Up", 2.99);
//    MenuItem fanta = new MenuItem("Fanta", 2.99);
//    MenuItem sparklingWater = new MenuItem("Sparkling Water", 1.50);
//    MenuItem stillWater = new MenuItem("Still Water", 1.50);
//
//    // first courses:
//
//    MenuItem first_1 = new MenuItem("Pasta Bucatini with Amatriciana sauce", 14.50);
//    MenuItem first_2 = new MenuItem("Pasta Rigatoni with Carbonara sauce", 14.50);
//    MenuItem first_3 = new MenuItem("Pasta Pappardella with Wild Boar Ragù sauce", 12.50);
//    MenuItem first_4 = new MenuItem("Pasta Spaghetti with Bolognese sauce", 12.50);
//    MenuItem first_5 = new MenuItem("Pasta Spaghetti with Shrimp and Porcini Mushrooms sauce", 18.00);
//
//    // second courses:
//
//    MenuItem second_1 = new MenuItem("Scallops with white wine", 15);
//    MenuItem second_2 = new MenuItem("Fillet with porcini mushrooms", 24.99);
//    MenuItem second_3 = new MenuItem("Sliced Beef with Rucola & Grana", 18.99);
//    MenuItem second_4 = new MenuItem("Dolphin Thread", 29);
//    MenuItem second_5 = new MenuItem("Kobe's Thread (Not Bryant)", 129.99);
//
    
}
