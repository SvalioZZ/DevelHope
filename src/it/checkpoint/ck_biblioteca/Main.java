package it.checkpoint.ck_biblioteca;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        Libro libro = new Libro(1, Genere.ROMANZO, 13.99);
        Libro libroBello = new Libro(2, Genere.ROMANZO, 11.99);
        Libro libroBrutto = new Libro(3, Genere.FANTASY, 21.99);
    
        HashMap<Libro, Integer> mappaDiLibri = new HashMap<Libro, Integer>();
        mappaDiLibri.put(libro, 5);
        mappaDiLibri.put(libroBello, 2);
        mappaDiLibri.put(libroBrutto, 4);
        
        Biblioteca biblioteca = new Biblioteca(mappaDiLibri);
        biblioteca.salvaSuFile("src/it/checkpoint/ck_biblioteca/resources/listaLibri.txt");
        
        biblioteca.stampaLibri();
        
        Biblioteca newBiblioteca = new Biblioteca();
        
        newBiblioteca.caricaDaFile("src/it/checkpoint/ck_biblioteca/resources/listaLibri.txt");
        
        
        newBiblioteca.stampaLibri();
        
        List<Libro> libriFiltrati = newBiblioteca.filtraLibri(Genere.ROMANZO);
        
        libriFiltrati.forEach(System.out::println);
        
        
        //----------------------------------------------------------------
        
        List<Integer> listaNumeri = new ArrayList<>();
        listaNumeri.add(1);
        listaNumeri.add(3);
        listaNumeri.add(4);
        listaNumeri.add(7);
        listaNumeri.add(2);
        listaNumeri.add(9);
    
        Collections.sort(listaNumeri);  //compareTo()
        listaNumeri.forEach(System.out::println);
        
        selectionSort(listaNumeri.toArray(new Integer[listaNumeri.size()]));
        listaNumeri.forEach(System.out::println);
        
        
    }
    
    public static <T extends Comparable<? super T>> void selectionSort(T[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            T temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
