package it.checkpoint.ck_biblioteca;

public class Libro {
    
    private int id;
    
    private Genere genere;
    
    private double prezzo;
    
    public Libro(int id, Genere genere, double prezzo) {
        this.id = id;
        this.genere = genere;
        this.prezzo = prezzo;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public Genere getGenere() {
        return genere;
    }
    
    public void setGenere(Genere genere) {
        this.genere = genere;
    }
    
    public double getPrezzo() {
        return prezzo;
    }
    
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    
    @Override
    public String toString() {
        return "Genere: " + genere + ", Id: " + id + ", Prezzo: " + prezzo;
    }
}
