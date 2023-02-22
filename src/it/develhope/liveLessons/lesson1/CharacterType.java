package it.develhope.liveLessons.lesson1;

public enum CharacterType {
    
    HUMAN("Peolple who live on Earth"),
    SAIYAN("People from Vegeta Planet"),
    NAMECCIAN("Green people from Namecc"),
    ALIEN("Some piece of shit like Freezer"),
    CYBORG("Robots created by Dr. Gero"),
    DEMON("This little freak Majin Bu");
    private final String description;
    
    CharacterType(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
}
