package it.checkpoint.ck_type_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Stream;

public class OperationsFile {
    
    /**
     * 1_ Contare il numero totale di caratteri presenti in tutti i paragrafi.
     */
    
    public static void getCharacterFile(String filename) throws IOException {
        FileReader reader = new FileReader(filename);
        BufferedReader br = new BufferedReader(reader);
        int charCount = 0;
        String line;
        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (!line.isEmpty()) {
                charCount += line.length();
            }
        }
        br.close();
        System.out.println("All characters in file: " + charCount);
    }
    
    /**
     * 2_ Count all words from the given file
     */
    public static void countWords(String filename) throws IOException {
         /*FileReader reader = new FileReader(filename);
         BufferedReader br = new BufferedReader(reader);
         String line = br.readLine();
         int countWords = 0;
         while (line != null) {
             if(!line.isEmpty()) {
                 String[] words = line.trim().split("\\s+");
                 for (String word : words) {
                     countWords++;
                 }
             }
         }
         br.close();
         System.out.println("Total words: " + countWords);
     }
         FileReader reader = new FileReader(filename);
         BufferedReader br = new BufferedReader(reader);
    
         int countWords = 0;
    
         String line;
         while ((line = br.readLine()) != null) {
             line = line.trim();
             if (!line.isEmpty()) {
                 String[] words = line.split("\\s+");
                 for (String word : words) {
                     if (!word.isEmpty()) {
                         countWords++;
                     }
                 }
             }
         }
    
         br.close();
    
         System.out.println("Total words: " + countWords);
     }*/
        long countWords = Files.lines(Path.of(filename))
                                  .map(String::trim)
                                  .filter(line -> !line.isEmpty())
                                  .flatMap(line -> Stream.of(line.split("\\s+")))
                                  .filter(word -> !word.isEmpty())
                                  .count();
        System.out.println("Total words: " + countWords);
    }
    
    /**
     * 3_ Trovare la parola più frequente in tutti i paragrafi.
     */
    
    public static Map<String, Integer> getMostFrequentWord(String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        Map<String, Integer> mapFreq = new HashMap<>();
        Map<String, Integer> result = new HashMap<>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] words = line.trim().toLowerCase().split("\\s+");
            if (words != null) {
                Arrays.stream(words).forEach(word -> mapFreq.put(word, mapFreq.getOrDefault(word, 0) + 1));
            }
            String mostFrequentWord = null;
            int maxCount = 0;
            for (Map.Entry<String, Integer> entry : mapFreq.entrySet()) {
                if (entry.getValue() > maxCount) {
                    mostFrequentWord = entry.getKey();
                    maxCount = entry.getValue();
                }
            }
            result.put(mostFrequentWord, maxCount);
        }
        return result;
    }
}
