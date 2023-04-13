package it.checkpoint.ck_biblioteca;

public enum Genere {
    
    STORICO("Per chi ama la Storia e vuole conoscerne i segreti ..!"),
    PER_RAGAZZI("Un genere leggero, indicato per tutte le età"),
    FANTASY("IN CERCA DI AVVENTURA?! SEI NEL POSTO GIUSTO!"),
    ROMANZO("Un genere molto diffuso, per gli appassionati di storie di tutti i tipi!");
    
    private final String description;
    
    Genere (String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
    
}
