package it.develhope.challenge.catalogue;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        
        Store store = new Store("My New Store");
        
        Article article1 = new Article(1, "Laptop", 1000.0, "A powerful laptop for work and gaming", TypeProduct.ELECTRONICS);
        Article article2 = new Article(2, "T-Shirt", 20.0, "A comfortable and stylish t-shirt", TypeProduct.CLOTHING);
        Article article3 = new Article(3, "Milk", 2.0, "A carton of whole milk", TypeProduct.GROCERY);
        
        store.addArticle(article1);
        store.addArticle(article2);
        store.addArticle(article3);
        
        store.applyDiscountForType(TypeProduct.CLOTHING, 10.0);
        
        store.saveCatalog("catalog.txt");
        
        Store newStore = new Store("My New Store 2");
        newStore.loadCatalog("catalog.txt");
        
        newStore.getArticle("Laptop");
        newStore.getArticle("T-Shirt");
        newStore.getArticle("Milk");
        
        article1.applyDiscount(15.0);
        article1.printInfo();
        store.saveCatalog("catalog.txt");
    }
}
