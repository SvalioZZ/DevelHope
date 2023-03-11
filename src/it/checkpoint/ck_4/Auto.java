package it.checkpoint.ck_4;

public class Auto {
    
    /**
     * 1) Progettare una classe Auto con i seguenti attributi privati:
     * - Marca
     * - Modello
     * - Prezzo
     */
    private String marca;
    private String modello;
    private double prezzo;
    
    /**
     * ● Implementare almeno due tipologie di costruttori e i relativi getter e setter per
     * ciascuna variabile.
     */
    
    public Auto(String marca, String modello, double prezzo) {
        this.marca = marca;
        this.modello = modello;
        this.prezzo = prezzo;
    }
    public Auto() {}
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModello() {
        return modello;
    }
    
    public void setModello(String modello) {
        this.modello = modello;
    }
    
    public double getPrezzo() {
        return prezzo;
    }
    
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    
    /**
     * ● Implementare il metodo toString() per mostrare in output alcune info relative
     * all’istanza della classe.
     */
    
    @Override
    public String toString() {
        return marca + " - " + modello + " - " + prezzo + " €";
    }
}
