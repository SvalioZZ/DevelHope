package it.develhope.challenge.FileAndParole;

import java.io.IOException;
import java.nio.file.Path;

public class Main {
    
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/it/develhope/challenge/FileAndParole/testo.txt");
        System.out.println(FileAndParole.contaParole(path));
        System.out.println(FileAndParole.paroleInRima(path));
    }
    
}
