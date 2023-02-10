package it.develhope.challenge;

import java.util.ArrayList;
import java.util.List;

public class Entities {
    
    public static String name;
    public static int id;
    
    public Entities(int id, String name) {
        Entities.id = id;
        Entities.name = name;
    }
    
    Entities o1 = new Entities(21, "Bowling Ball");
    Entities o2 = new Entities(2, "Dirty Sock");
    Entities o3 = new Entities(1, "Hair Pin");
    Entities o4 = new Entities(5, "Microphone");
    
    Entities i1 = new Entities(2, "Hair Pin");
    Entities i2 = new Entities(3, "Half-Eaten Apple");
    Entities i3 = new Entities(67, "Bowling Ball");
    Entities i4 = new Entities(7, "Toothpaste");
   
    
}
