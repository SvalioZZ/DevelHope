package it.checkpoint.ck_type_1;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Main {
    
    public static void main(String[] args) throws IOException {
    
        List<String> lines = Simulation.loadLines("src/it/checkpoint/ck_type_1/resources/test.txt");
    
        HashMap<String, Integer> map = Simulation.processLines(lines);
        
        Simulation.writeLines("src/it/checkpoint/ck_type_1/resources/result.txt", map);
        
    }
    
}
