package it.checkpoint.ck_type_4;

import java.io.IOException;
import java.util.Map;

public class Main {
    
    public static void main(String[] args) throws IOException {
    
        OperationsFile.getCharacterFile("src/it/checkpoint/ck_type_4/resources/test.txt");
        OperationsFile.countWords("src/it/checkpoint/ck_type_4/resources/test.txt");
        Map<String, Integer> frequency = OperationsFile.getMostFrequentWord("src/it/checkpoint/ck_type_4/resources/test.txt");
        System.out.println(frequency);
        
    }
    
}
