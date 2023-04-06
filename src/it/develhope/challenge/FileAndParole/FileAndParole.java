package it.develhope.challenge.FileAndParole;

import java.io.BufferedReader;;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class FileAndParole {
    
    public static void stampaParole(Path file) throws IOException {
        FileReader fileReader = new FileReader(file.toFile());
        BufferedReader reader = new BufferedReader(fileReader);
        while (reader.ready()) {
            Arrays.stream(reader.readLine().split(" ")).forEach(System.out::println);
        }
    }
    
    public static HashMap<String, Integer> contaParole(Path file) throws IOException {
        HashMap<String, Integer> occorrenze = new HashMap();
        FileReader fileReader = new FileReader(file.toFile());
        BufferedReader reader = new BufferedReader(fileReader);
        while (reader.ready()) {
            ArrayList<String> parole = getFrequency(file);
            for (String parola : parole) {
                if (occorrenze.containsKey(parola)) {
                    occorrenze.put(parola, occorrenze.get(parola) + 1);
                } else {
                    occorrenze.put(parola, 1);
                }
            }
        }
        reader.close();
        
//        Files.lines(file).forEach(line -> Arrays.stream(line.split(" ")).map(parola -> occorrenze.put(parola, occorrenze.getOrDefault(parola, 1))));
        Files.lines(file)
                .forEach(line -> Arrays.stream(line.toLowerCase().replaceAll("\\W", " ").split(" "))
                                         .forEach(parola -> occorrenze.put(parola, occorrenze.getOrDefault(parola,0) + 1)));
    return occorrenze;
    }

    
    
    
    public static HashMap<String, ArrayList<String>> paroleInRima(Path file) throws IOException {
        FileReader fileReader = new FileReader(file.toFile());
        BufferedReader br = new BufferedReader(fileReader);
        HashMap<String, ArrayList<String>> rime = new HashMap<>();
        while (br.ready()) {
            ArrayList<String> parole = getFrequency(file);
            for (String parola : parole) {
                if (parola.length() < 4) continue;
                char ultimo = parola.charAt(parola.length()-1);
                if (! (ultimo == 'a' || ultimo == 'e' || ultimo == 'i' || ultimo == 'o' || ultimo == 'u')) continue;
                String dittongo;
                char terzultimo = parola.charAt(parola.length() - 3);
                if (terzultimo == 'a' || terzultimo == 'e' || terzultimo == 'i' || terzultimo == 'o' || terzultimo == 'u') {
                    dittongo = parola.substring(parola.length()-3);
                }
                else {
                    char quartultimo = parola.charAt(parola.length() - 4);
                    if (! (quartultimo == 'a' || quartultimo == 'e' || quartultimo == 'i' || quartultimo == 'o' || quartultimo == 'u')) continue;
                    dittongo = parola.substring(parola.length()-4);
                }
                ArrayList<String> paroleDittongo = rime.getOrDefault(dittongo, new ArrayList<>());
                if (!paroleDittongo.contains(parola)) {
                    paroleDittongo.add(parola);
                    rime.put(dittongo, paroleDittongo);
                }
            }
        }
        br.close();
        return rime;
    }
    
    public static HashMap<Character, Integer> getLetterFrequency(Path filePath) throws IOException {
        ArrayList<String> words = getFrequency(filePath);
        HashMap<Character, Integer> map = new HashMap<>();
        for (String word : words) {
            char [] c = word.toCharArray();
            for (char ch : c) {
                if(!map.containsKey(ch)){
                    map.put(ch, 1);
                }
                else {
                    map.put(ch, map.get(ch) + 1);
                }
            }
        }
        return map;
    }
    
    public static ArrayList<String> getFrequency(Path filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath.toFile());
        BufferedReader br = new BufferedReader(fileReader);
        ArrayList<String> lines = new ArrayList<>();
        while (br.ready()) {
            for (String line : lines) {}
            String[] paroleRiga = br.readLine().toLowerCase().replaceAll("\\d+", "").split("\\W+");
            lines.addAll(Arrays.asList(paroleRiga));
        }
        br.close();
        return lines;
    }
}
