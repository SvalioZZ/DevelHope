package it.develhope.challenge.catalogue;

import it.develhope.challenge.catalogue.storeSettings.Article;
import it.develhope.challenge.catalogue.storeSettings.Product;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        
        Store store = new Store("My New Store");
        
        Article article1 = new Article("Laptop", 1000.0, TypeProduct.ELECTRONICS);
        Article article2 = new Article("T-Shirt", 20.0, TypeProduct.CLOTHING);
        Article article3 = new Article("Milk", 2.0, TypeProduct.GROCERY);
        
        store.addArticle(article1);
        store.addArticle(article2);
        store.addArticle(article2);
        store.addArticle(article2);
        store.addArticle(article2);
        store.addArticle(article3);
        store.addArticle(article3);
        store.addArticle(article3);
        store.addArticle(article3);
        store.addArticle(article1);
        store.addArticle(article1);
        store.addArticle(article1);
        store.addArticle(article1);
        
        store.applyDiscountForType(TypeProduct.CLOTHING, 10.0);
        
        store.saveCatalog("src/it/develhope/challenge/catalogue/storeSettings/catalog.csv");
        
        Store newStore = new Store("My New Store 2");
        newStore.loadCatalog("src/it/develhope/challenge/catalogue/storeSettings/catalog.csv");
        
        newStore.getArticle("Laptop");
        newStore.getArticle("T-Shirt");
        newStore.getArticle("Milk");
        
        article1.applyDiscount(15.0);
        article1.printInfo();
        store.saveCatalog("src/it/develhope/challenge/catalogue/storeSettings/catalog.csv");
        
        List<Article> listing = store.getCatalog().keySet().stream().
                                        filter(x -> x.getType() == TypeProduct.ELECTRONICS)
                                        .toList();
        
        listing.forEach(Article::printInfo);
        store.countItemsFromCatalog(article1);
        store.countItemsFromCatalog(article2);
        store.countItemsFromCatalog(article3);
        
        
        double sum = store.getCatalog().keySet().stream()
                             .map(Product::getPrice).reduce(0.0,Double::sum);
        
        boolean isTech = store.getCatalog().keySet().stream().anyMatch(x -> x.getType().equals(TypeProduct.ELECTRONICS));
        
        boolean nonFood = store.getCatalog().keySet().stream().filter(x -> !x.getType().equals(TypeProduct.GROCERY)).allMatch(x -> x.getPrice() > 1);
        
        boolean allMaxEuro = store.getCatalog().keySet().stream().allMatch(x -> x.getPrice() > 1);
        
        boolean noFuffa = store.getCatalog().keySet().stream().noneMatch(article -> article.getName().equals("fuffa"));
        
        List<String> fileLines = Files.lines(Path.of("src/it/develhope/challenge/catalogue/storeSettings/catalog.csv")).toList();
        fileLines.forEach(System.out::println);
    }
}
