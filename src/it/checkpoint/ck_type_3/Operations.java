package it.checkpoint.ck_type_3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Operations {
    //1_ Load the lines in the file into a list of strings and print the list on the screen.
    
    public static List<String> loadLines(Path filePath) throws IOException {
        List<String> lines = new ArrayList<>();
        Files.lines(Path.of(filePath.toUri())).forEach(lines::add);
        return lines;
    }
    //2_ Calculate the total number of words in the file,
    // excluding the blank lines, and print it on the screen.
    
    public static void calculateTotalWords(Path filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath.toFile());
        BufferedReader br = new BufferedReader(fileReader);
        int wordCount = 0;
        while (br.ready()) {
            String line = br.readLine();
            if (!line.isEmpty()) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        }
        br.close();
        System.out.println("Total number of words: " + wordCount);
    }
    
    /**
     * 3_ Delete any repeated words in the file
     * and print the list of unique words on the screen.
     * @param filePath
     * @throws IOException
     */
    
    public static Set<String> printUniqueWords(Path filePath) throws IOException {
        FileReader fr = new FileReader(filePath.toFile());
        BufferedReader br = new BufferedReader(fr);
        Set<String> uniqueWords = new HashSet<>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] words = line.toUpperCase().split("\\s+");
            for (String word : words) {
                if (!word.isEmpty()) {
                    uniqueWords.add(word);
                }
            }
        }
//        for (String word : uniqueWords) {
//            System.out.println(word);
//        }
        return uniqueWords;
    }
    
    /**
     * 4_ Sort the list of unique words alphabetically
     * and print it on the screen.
     */
    
    public static void getUniqueWordsSorted(Set<String> uniqueWords) {
        System.out.println(new TreeSet<>(uniqueWords));
    }
    
    /**
     * 5 - Write to a new text file "file_modified.txt"
     * the list of unique words sorted alphabetically, one by line.
     */
    
    public static void writeUniqueWords (Path filePath, Set<String> uniqueWords) throws IOException {
        FileWriter fw = new FileWriter(filePath.toFile());
        BufferedWriter bf = new BufferedWriter(fw);
        int id = 1;
        for (String word : uniqueWords) {
            bf.write(id++ + "° word: " + word.toUpperCase() + ";");
            bf.newLine();
        }
        bf.close();
    }
}
