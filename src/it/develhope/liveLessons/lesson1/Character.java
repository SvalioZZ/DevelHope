package it.develhope.liveLessons.lesson1;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Random;

public class Character {
    
    //Attributes
    
    private String charName;
    private int hp;
    private int strength;
    private double dodgeChance;
    private double armor;
    private CharacterType type;
    
    private ArrayList<Skill> skills;
    
    //Constructors
    
    
    public Character(String charName, int hp, int strength, CharacterType type, ArrayList<Skill> skills) {
        this.charName = charName;
        this.hp = hp;
        this.strength = strength;
        this.dodgeChance = Math.random();
        this.armor = Math.random();
        this.type = type;
        this.skills = skills;
        
        //must add basic skill attack here
        
        Skill basicAttack = new Skill("Basic Attack", this.strength);
        skills.add(basicAttack);
        
    }
    
    //getters and setters
    
    public String getCharName() {
        return charName;
    }
    
    public Character setCharName(String charName) {
        this.charName = charName;
        return this;
    }
    
    public int getHp() {
        return hp;
    }
    
    public Character setHp(int hp) {
        this.hp = hp;
        return this;
    }
    
    public int getStrength() {
        return strength;
    }
    
    public Character setStrength(int strength) {
        this.strength = strength;
        return this;
    }
    
    public double getDodgeChance() {
        return dodgeChance;
    }
    
    public Character setDodgeChance(double dodgeChance) {
        this.dodgeChance = dodgeChance;
        return this;
    }
    
    public double getArmor() {
        return armor;
    }
    
    public Character setArmor(double armor) {
        this.armor = armor;
        return this;
    }
    
    public CharacterType getType() {
        return type;
    }
    
    public Character setType(CharacterType type) {
        this.type = type;
        return this;
    }
    
    public ArrayList<Skill> getSkills() {
        return skills;
    }
    
    public Character setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
        return this;
    }
    
    // Methods
    
    public void attack(Character target) {
        
        Random random = new Random();
        
        // 1_ select random an attack from list skill
        
        int randomIndex = random.nextInt(skills.size());
        Skill chosenSkill = skills.get(randomIndex);
        
        // 2_ probability of hit chance
        
        double probability = chosenSkill.getHitChance() * target.getDodgeChance();
        double randomChoice = Math.random();
        
        if (probability < randomChoice) {
            
            // Hit!
            int damage = (int) (chosenSkill.getDamage() * target.getArmor());
           
            target.setHp(target.getHp() - damage);
            
            if (chosenSkill.getName().equals("Explosion")) {
                
                System.out.println("Both players are out of tournament!");
            } else {
                System.out.println(this.charName + " hit " + target.getCharName() +
                                           "\nwith " + chosenSkill.getName() +
                                           " and deal " + damage + " damage!");
            }
            
        } else {
            
            System.out.println("Missed!");
        }
        
    }
}
