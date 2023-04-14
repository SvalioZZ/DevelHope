package it.checkpoint.ck_biblioteca;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Main {
    
    public static void main(String[] args) throws IOException {
    
        Libro libro = new Libro(1, Genere.PER_RAGAZZI, 13.99);
        Libro libroA = new Libro(2, Genere.PER_RAGAZZI, 13.99);
        Libro libroB = new Libro(3, Genere.STORICO, 13.99);
        Libro libroC = new Libro(4, Genere.STORICO, 13.99);
        Libro libroD = new Libro(5, Genere.STORICO, 13.99);
        Libro libroE = new Libro(6, Genere.ROMANZO, 13.99);
        Libro libroF = new Libro(7, Genere.ROMANZO, 13.99);
        Libro libroBello = new Libro(8, Genere.ROMANZO, 11.99);
        Libro libroBrutto = new Libro(9, Genere.FANTASY, 21.99);
        Libro libroStrano = new Libro(10, Genere.FANTASY, 18.99);
        Libro libroOttuso = new Libro(11, Genere.FANTASY, 16.99);
        Libro libroGattuso = new Libro(12, Genere.FANTASY, 11.99);
    
        HashMap<Libro, Integer> mappaDiLibri = new HashMap<Libro, Integer>();
        mappaDiLibri.put(libro, 5);
        mappaDiLibri.put(libroA, 31);
        mappaDiLibri.put(libroB, 9);
        mappaDiLibri.put(libroC, 14);
        mappaDiLibri.put(libroD, 3);
        mappaDiLibri.put(libroE, 23);
        mappaDiLibri.put(libroF, 16);
        mappaDiLibri.put(libroBrutto, 4);
        mappaDiLibri.put(libroStrano, 43);
        mappaDiLibri.put(libroOttuso, 40);
        mappaDiLibri.put(libroGattuso, 32);
    
        Biblioteca biblioteca = new Biblioteca(mappaDiLibri);
        biblioteca.salvaSuFile("src/it/checkpoint/ck_biblioteca/resources/listaLibri.txt");
    
        biblioteca.stampaLibri();
    
        Biblioteca newBiblioteca = new Biblioteca();
    
        newBiblioteca.caricaDaFile("src/it/checkpoint/ck_biblioteca/resources/listaLibri.txt");
    
    
        newBiblioteca.stampaLibri();
    
        List<Libro> libriFiltrati = newBiblioteca.filtraLibri(Genere.FANTASY);
    
        libriFiltrati.forEach(System.out::println);
    }
}
