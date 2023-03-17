package it.develhope.challenge.openAi.ex_2;

public class NewExeption extends Exception {
    private String message;
    
    public NewExeption(String message) {
        super(message);
    }
}
