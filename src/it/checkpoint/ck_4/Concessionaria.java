package it.checkpoint.ck_4;

import java.util.*;

public class Concessionaria {
    
    /**
     * Progettare una classe Concessionaria che permetta di memorizzare:
     * - Nome della concessionaria
     * - Lista di auto presenti nella concessionaria
     */
    private String nomeConcessionaria;
    private List<Auto> autoPresenti;
    
    /**
     * ● Implementare un costruttore che riceva solamente in input il nome della
     * concessionaria.
     */
    
    public Concessionaria(String nomeConcessionaria) {
        this.nomeConcessionaria = nomeConcessionaria;
        this.autoPresenti = new ArrayList<>();
    }
    
    /**
     * ● Implementare i getter e i setter per ciascuna variabile.
     */
    public String getNomeConcessionaria() {
        return nomeConcessionaria;
    }
    
    public void setNomeConcessionaria(String nomeConcessionaria) {
        this.nomeConcessionaria = nomeConcessionaria;
    }
    
    public List<Auto> getAutoPresenti() {
        return autoPresenti;
    }
    
    public void setAutoPresenti(List<Auto> autoPresenti) {
        this.autoPresenti = autoPresenti;
    }
    
    /**
     * ● Realizzare un metodo che stampi le auto presenti nella concessionaria.
     */
    public void stampaAuto() {
        System.out.println("Auto presenti nella concessionaria: ");
        for (Auto auto : autoPresenti) {
            System.out.println(auto.getMarca() + " - " + auto.getModello() + " - " + auto.getPrezzo() + " €");
        }
    }
    
    /**
     * ● Realizzare un metodo per aggiungere un auto alla concessionaria.
     */
    public void aggiungiAuto(Auto auto){
        autoPresenti.add(auto);
    }
    
    /**
     * ● Realizzare un metodo che permetta di rimuovere un auto dalla concessionaria
     */
    public void rimuoviAuto(Auto auto){
        autoPresenti.remove(auto);
    }
    
    /**
     * ● Realizzare un metodo che permetta di effettuare una ricerca delle auto
     * presenti nella concessionaria in base alla marca.
     */
    
    public List<Auto> cercaAuto(String marca){
        List<Auto> listaAutoCercate = new ArrayList<>();
        for (Auto auto : autoPresenti) {
            if (auto.getMarca().equals(marca)) {
                listaAutoCercate.add(auto);
            }
        }
        return listaAutoCercate;
    }
    
    /**
     * ● Realizzare un metodo che non prende in input alcun parametro e restituisce
     * una mappa che tiene traccia del conteggio delle auto presenti nella
     * concessionaria in base alla marca.
     */

    public Map<String, Integer> conteggioAutoPerMarca() {
        Map<String, Integer> conteggio = new HashMap<>();
        for (Auto auto : autoPresenti) {
            String marca = auto.getMarca();
            conteggio.put(marca, conteggio.getOrDefault(marca, 0) + 1);
        }
        return conteggio;
    }
    
}
