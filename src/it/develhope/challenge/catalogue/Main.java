package it.develhope.challenge.catalogue;

import it.develhope.challenge.catalogue.storeSettings.Article;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        
        Store store = new Store("My New Store");
        
        Article article1 = new Article("Laptop", 1000.0, TypeProduct.ELECTRONICS);
        Article article2 = new Article("T-Shirt", 20.0, TypeProduct.CLOTHING);
        Article article3 = new Article("Milk", 2.0, TypeProduct.GROCERY);
        
        store.addArticle(article1);
        store.addArticle(article2);
        store.addArticle(article3);
        
        store.applyDiscountForType(TypeProduct.CLOTHING, 10.0);
        
        store.saveCatalog("catalog.csv");
        
        Store newStore = new Store("My New Store 2");
        newStore.loadCatalog("catalog.csv");
        
        newStore.getArticle("Laptop");
        newStore.getArticle("T-Shirt");
        newStore.getArticle("Milk");
        
        article1.applyDiscount(15.0);
        article1.printInfo();
        store.saveCatalog("catalog.csv");
    }
}
