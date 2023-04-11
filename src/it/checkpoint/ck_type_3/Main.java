package it.checkpoint.ck_type_3;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        Path path = Path.of("src/it/checkpoint/ck_type_3/resources/test.txt");
        Path outputPath = Path.of("src/it/checkpoint/ck_type_3/resources/output.txt");
        
        List<String> lines = Operations.loadLines(path);
        System.out.println(lines);
        Operations.calculateTotalWords(path);
        
        Set<String> uniqueWords = Operations.printUniqueWords(path);
        Operations.getUniqueWordsSorted(uniqueWords);
        Operations.writeUniqueWords(outputPath, uniqueWords);
        
    }
    
}
