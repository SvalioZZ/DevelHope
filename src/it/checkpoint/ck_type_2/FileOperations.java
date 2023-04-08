package it.checkpoint.ck_type_2;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;


public class FileOperations {
    
    /**
     * Reads a text file and returns a map of word frequencies.
     * Words are sorted in alphabetical order.
     * @param file the path to the input file
     * @return a map of word frequencies
     * @throws IOException if an I/O error occurs
     */
    public static Map<String, Integer> wordFrequencies(String file) throws IOException {
        Map<String, Integer> frequencies = new TreeMap<>();
        // use a TreeMap to automatically sort the keys in alphabetical order
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\W+");
                // split the line into words using a regular expression that matches non-word characters
                for (String word : words) {
                    if (!word.isEmpty()) {
                        frequencies.put(word.toLowerCase(), frequencies.getOrDefault(word.toLowerCase(), 0) + 1);
                        // add the word to the map, converting it to lowercase to ignore case sensitivity
                    }
                }
            }
        }
        return frequencies;
    }
    
    /**
     * Writes a map of word frequencies to a text file.
     * @param frequencies the map of word frequencies
     * @param file the path to the output file
     * @throws IOException if an I/O error occurs
     */
    public static void writeFrequencies(Map<String, Integer> frequencies, String file) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (Map.Entry<String, Integer> entry : frequencies.entrySet()) {
                if (entry.getValue() > 1) {
                    writer.write("Word: " + entry.getKey().toUpperCase() + " - Counted: " + entry.getValue() + " times\n");
                } else {
                    writer.write("Word: " + entry.getKey().toUpperCase() + " - Counted: " + entry.getValue() + " time\n");
                }
                    writer.newLine();
                    // write each word frequency pair to a new line in the file
            }
            writer.close();
        }
}
