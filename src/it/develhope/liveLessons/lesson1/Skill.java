package it.develhope.liveLessons.lesson1;

import java.util.ArrayList;

public class Skill {
    
    //Attributes
    
    private String name;
    private int damage;
    private double hitChance;
    
    //Constructors
    
    
    public Skill(String name, int damage) {
        this.name = name;
        this.damage = damage;
        this.hitChance = Math.random();
    }
    
    //Getters and setters
    
    
    public String getName() {
        return name;
    }
    
    public Skill setName(String name) {
        this.name = name;
        return this;
    }
    
    public int getDamage() {
        return damage;
    }
    
    public Skill setDamage(int damage) {
        this.damage = damage;
        return this;
    }
    
    public double getHitChance() {
        return hitChance;
    }
    
    public Skill setHitChance(double hitChance) {
        this.hitChance = hitChance;
        return this;
    }
}
