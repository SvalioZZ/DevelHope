package it.checkpoint.ck_biblioteca;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Biblioteca {
    
    private HashMap<Libro, Integer> mappaDiLibri;
    
    public Biblioteca(HashMap<Libro, Integer> mappaDiLibri) {
        this.mappaDiLibri = mappaDiLibri;
    }
    
    public Biblioteca() {
        this.mappaDiLibri = new HashMap<>();
    }
    
    public HashMap<Libro, Integer> getMappaDiLibri() {
        return mappaDiLibri;
    }
    
    public void setMappaDiLibri(HashMap<Libro, Integer> mappaDiLibri) {
        this.mappaDiLibri = mappaDiLibri;
    }
    
    
    public void salvaSuFile (String filePath) throws IOException {
        BufferedWriter br = new BufferedWriter(new FileWriter(filePath));
        for (Map.Entry<Libro, Integer> entry : mappaDiLibri.entrySet()) {
            br.write(entry.getKey().toString() + ", copies: " + entry.getValue());
            br.newLine();
        }
        br.close();
    }
    
    public void caricaDaFile(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        HashMap<Libro, Integer> mappaLibri = new HashMap<>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] tokens = line.split(",");
            Genere genere = Genere.valueOf(tokens[0].split(": ")[1]);
            int id = Integer.parseInt(tokens[1].split(": ")[1]);
            double prezzo = Double.parseDouble(tokens[2].split(": ")[1]);
            int quantita = Integer.parseInt(tokens[3].split(": ")[1]);
            Libro libro = new Libro(id, genere, prezzo);
            mappaLibri.put(libro, quantita);
        }
        br.close();
        this.mappaDiLibri = mappaLibri;
    }
    
    public void stampaLibri() {
        for (Map.Entry<Libro, Integer> entry : mappaDiLibri.entrySet()){
            System.out.println(entry.getKey().toString() + " - quantità disponibile: " + entry.getValue());
        }
    }
    
    public List<Libro> filtraLibri(Genere genere) {
        List<Libro> libriFiltrati = mappaDiLibri.keySet().stream()
                                            .filter(libro -> libro.getGenere().equals(genere))
                                            .sorted((l1, l2) -> mappaDiLibri.get(l2).compareTo(mappaDiLibri.get(l1)))
                                            .collect(Collectors.toList());
        return libriFiltrati;
    }
    
}
