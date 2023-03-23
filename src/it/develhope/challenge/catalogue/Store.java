package it.develhope.challenge.catalogue;

import it.develhope.challenge.catalogue.storeSettings.Article;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class Store {
    private String name;
    private Map<String, Article> catalog;
    
    public Store(String name) {
        this.name = name;
        this.catalog = new HashMap<>();
    }
    
    public void addArticle(Article article) {
        String name = article.getName();
        if (catalog.containsKey(name)) {
            System.out.println(name + " already exists in the catalog.");
        } else {
            catalog.put(name, article);
            System.out.println(name + " added to the catalog.");
        }
    }
    
    public void removeArticle(String name) {
        if (catalog.containsKey(name)) {
            catalog.remove(name);
            System.out.println(name + " removed from the catalog.");
        } else {
            System.out.println(name + " not found in the catalog.");
        }
    }
    
    public Article getArticle(String name) {
        if (catalog.containsKey(name)) {
            Article article = catalog.get(name);
            System.out.println(name + " found in the catalog.");
            return article;
        } else {
            System.out.println(name + " not found in the catalog.");
            return null;
        }
    }
    public void applyDiscountForType(TypeProduct type, double discount) {
        for (Article article : catalog.values()) {
            if (article.getType().equals(type)) {
                article.applyDiscount(discount);
                System.out.println("Discount of " + discount + "% applied to " + article.getName() + ".");
            }
        }
    }
    public void saveCatalog(String filename) throws IOException {
        FileWriter writer = new FileWriter(filename);
        for (Article article : catalog.values()) {
            int id = article.getId();
            String name = article.getName();
            double price = article.getPrice();
            String description = article.getDescription();
            TypeProduct type = article.getType();
            double discount = article.getDiscount();
            writer.write(id + "," + name + "," + price + "," + description + "," + type + "," + discount + "\n");
        }
        writer.close();
    }
    public void loadCatalog(String filename) throws IOException {
        FileReader reader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line = bufferedReader.readLine();
        while (line != null) {
            String[] fields = line.split(",");
            int id = Integer.parseInt(fields[0]);
            String name = fields[1];
            double price = Double.parseDouble(fields[2]);
            String description = fields[3];
            TypeProduct type = TypeProduct.valueOf(fields[4]);
            double discount = Double.parseDouble(fields[5]);
            Article article = new Article(id, name, price, description, type);
            article.setDiscount(discount);
            addArticle(article);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
    }
}