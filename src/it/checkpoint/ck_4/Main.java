package it.checkpoint.ck_4;

public class Main {
    public static void main(String[] args) {
        /**
         * Creare una classe Main nella quale:
         * ● Istanziare 3 oggetti di tipo Auto di cui due della stessa marca.
         */
        Auto bmw1 = new Auto("BMW", "X5", 49999.99);
        Auto bmw2 = new Auto("BMW", "X6", 89999.99);
        Auto fiat1 = new Auto("Fiat", "Uno", 749.99);
    
        /**
         * ● Istanziare un oggetto concessionaria e aggiungere le auto create.
         */
        Concessionaria pierotti = new Concessionaria("Pierotti Auto");
        
        pierotti.aggiungiAuto(bmw1);
        pierotti.aggiungiAuto(bmw2);
        pierotti.aggiungiAuto(fiat1);
    
        /**
         * ● Stampare le auto presenti nella concessionaria.
         */
        
        pierotti.stampaAuto();
        
        /**
         * ● Creare una nuova auto e aggiungerla alla concessionaria rimuovendo una
         * delle auto presenti.
         */
        
        Auto bmw3 = new Auto("BMW", "M4", 129999.99);
        pierotti.aggiungiAuto(bmw3);
        pierotti.rimuoviAuto(fiat1);
        
        pierotti.stampaAuto();
    
    
        /**
         * ● Effettuare una ricerca usando il metodo implementato
         */
    
        System.out.println(pierotti.cercaAuto("BMW"));
    
    
        /**
         * ● Mappare le informazioni relative al numero di auto presenti rispetto alla marca
         */
    
        System.out.println(pierotti.conteggioAutoPerMarca());
        
    }
}
