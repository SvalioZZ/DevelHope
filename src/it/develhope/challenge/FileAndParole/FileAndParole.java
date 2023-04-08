package it.develhope.challenge.FileAndParole;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

;


public class FileAndParole {
    
    /**
     * Creates a new FileAndParole
     * Scrivere un metodo loadLines(String filePath) che carichi le linee di un
     * file di testo con percorso “filePath” e le ritorni come lista di stringhe.
     * @param filePath
     */
    public static List<String> loadLines(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            if (!line.equals("")) {
                lines.add(line);
            }
        }
        br.close();
        return lines;
    }
    
    /**
     * Write a method processLines(List<String> lines) that scrolls the
     * list of input strings and returns a HashMap that has as keys integers
     * and strings as values.
     * For each string in the list, the method must perform the following
     * operations:
     * - If a line is empty it must do nothing
     * - Calculate the length of the string, removing spaces at the beginning and
     * at the end, saving it in a variable of type integer.
     * - Maps an entry having as key the length
     * of the string and as its value the first half of the string (index 0
     * to length/2).
     * - In case an entry with the
     * same key, it prints an error message.
     */
    
    public static HashMap<Integer, String> processLines(List<String> lines) throws IOException {
        HashMap<Integer, String> result = new HashMap<>();
        for (String line : lines) {
            if (!line.equals("")) {
                int lineLength = line.strip().length();
                /**
                 * Maps an entry having as key the length
                 * of the string and as its value the first half of the string (index 0
                 * to length/2).
                 */
                if (!result.containsKey(lineLength)) {
                    result.put(lineLength, line.substring(0,lineLength/2));
                } else {
                    System.out.println("Error, key: " + lineLength + " value already in map");
                }
            }
        }
        return result;
    }
    
    /**
     * Scrivere un metodo writeLines(String filePath, HashMap<Integer,
     * String> entries) che scriva le entry nella mappa su un file di testo al
     * percorso ‘filePath’, una per riga, nel seguente formato: “KEY - VALORE”.
     */
    public static void writeLines(String filePath, HashMap<Integer, String> entries) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        BufferedWriter buff = new BufferedWriter(writer);
        for (Map.Entry<Integer, String> entry : entries.entrySet()) {
            buff.write("Keys: " + entry.getKey() + " - Values: " + entry.getValue().toUpperCase() + "\n");
            buff.newLine();
        }
        buff.close();
    }
}