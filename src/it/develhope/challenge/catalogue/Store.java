package it.develhope.challenge.catalogue;

import it.develhope.challenge.catalogue.storeSettings.Article;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

class Store {
    private String name;
    private Map<Article, Integer> catalog;
    
    public Store(String name) {
        this.name = name;
        this.catalog = new HashMap<>();
    }
    
    public void addArticle(Article article) {
        if (!catalog.containsKey(article)) {
            catalog.put(article, 1);
        } else {
            catalog.put(article, catalog.get(article) + 1);
        }
    }
    
    public void removeArticle(Article article) {
        if (!catalog.containsKey(article)) {
            throw new IllegalArgumentException("No such article: " + article);
        }
        int value = catalog.get(article);
        if (value == 1) {
            catalog.remove(article);
        } else {
            catalog.put(article, value - 1);
        }
    }
    
    public Article getArticle(String name) {
        for (Article article : catalog.keySet()) {
            if (article.getName().equals(name)) {
                return article;
            }
        }
        throw new IllegalArgumentException("No such article: " + name);
    }
    
    public void applyDiscountForType(TypeProduct type, double discount) {
        for (Article article : catalog.keySet()) {
            if (article.getType().equals(type)) {
                article.applyDiscount(discount);
                System.out.println("Discount of " + discount + "% applied to " + article.getName() + ".");
            }
        }
    }
    
    public void saveCatalog(String filename) throws IOException {
//        FileWriter writer = new FileWriter(filename);
        File file = new File(filename);
        BufferedWriter writer = new BufferedWriter((new FileWriter(file)));
        for (Article article : catalog.keySet()) {
            int id = article.getId();
            String name = article.getName();
            double price = article.getPrice();
            String description = article.getDescription();
            TypeProduct type = article.getType();
            double discount = article.getDiscount();
            writer.write(id + ", " + name + ", " + price + ", " + description + ", " +
                                 type + ", " + discount + ", " + catalog.get(article) + "\n");
        }
        writer.close();
    }
    
    public void loadCatalog(String filename) throws IOException {
        FileReader reader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line = bufferedReader.readLine();
        while (line != null) {
            String[] fields = line.split(", ");
            int id = Integer.parseInt(fields[0]);
            String name = fields[1];
            double price = Double.parseDouble(fields[2]);
            String description = fields[3];
            TypeProduct type = TypeProduct.valueOf(fields[4]);
            double discount = Double.parseDouble(fields[5]);
            Article article = new Article(name, price, type);
            article.setId(id);
            article.setDescription(description);
            article.setDiscount(discount);
            addArticle(article);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
    }
}