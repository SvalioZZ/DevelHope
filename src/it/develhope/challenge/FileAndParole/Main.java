package it.develhope.challenge.FileAndParole;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Main {
    
    public static void main(String[] args) throws IOException {
        List<String> lines = FileAndParole.loadLines("src/it/develhope/challenge/FileAndParole/resources/text.txt");
        System.out.println(lines);
        HashMap<Integer, String> lineMap = FileAndParole.processLines(lines);
        System.out.println(lineMap);
        FileAndParole.writeLines("src/it/develhope/challenge/FileAndParole/resources/MappedValues.txt", lineMap);
    }
    
}
