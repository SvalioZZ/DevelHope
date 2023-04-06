package it.checkpoint.ck_type_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Simulation {
    
    public static List<String> loadLines(String filePath) throws IOException {
        /*FileReader fileReader = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<String>();
        while (br.ready()) {
            lines.add(br.readLine());
        }
        br.close();
        return lines;*/
        // return Files.readAllLines(Path.of(filePath));
        return Files.lines(Path.of(filePath)).toList();
    }
    
    public static HashMap<String, Integer> processLines(List<String> lines) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();
        for (String line : lines) {
            if (line.length() == 0) continue;
//            if (!line.contains("$")) System.out.println("Error!");
            if (line.indexOf("$") == -1) System.out.println("Error!");
            else {
                String [] lineSplit = line.split("\\$");
                String key = lineSplit[0].strip();
                int value = lineSplit[1].strip().split(" ").length;
                map.put(key, value);
            }
        }
        return map;
    }
    
    public static void writeLines (String filePath, HashMap<String, Integer> map) throws IOException {
        FileWriter fw = new FileWriter(filePath);
        BufferedWriter bw = new BufferedWriter(fw);
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            bw.write(entry.getKey().toUpperCase() + " - " + entry.getValue()  +"\n");
        }
        bw.close();
    }
    
}
