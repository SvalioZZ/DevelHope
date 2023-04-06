package it.checkpoint.ck_type_2;

import java.io.IOException;
import java.util.Map;

public class Main {
    
    public static void main(String[] args) throws IOException {
    
        Map<String, Integer> map = FileOperations.wordFrequencies("src/it/checkpoint/ck_type_2/resources/text.txt");
        FileOperations.writeFrequencies(map, "src/it/checkpoint/ck_type_2/resources/frequencies.csv");
        
    }
    
}
