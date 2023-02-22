package it.develhope.liveLessons.lesson1;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        // skills instance
        Skill kamehameha = new Skill("Kamehameha", 80);
        Skill kienzan = new Skill("Kienzan", 35);
        Skill genkidama = new Skill("Genkidama", 65);
        Skill gyarriku_bureiza = new Skill("Gyarriku Bureiza", 100);
        Skill big_bang = new Skill("Big Bang", 90);
        Skill galick_cannon = new Skill("Galick Cannon", 85);
        Skill explosion = new Skill("Explosion", Integer.MAX_VALUE);
        
        // pre set skills lists
        
        ArrayList<Skill> skills_set1 = new ArrayList<>();
        skills_set1.add(kamehameha);
        skills_set1.add(kienzan);
        skills_set1.add(genkidama);
        skills_set1.add(gyarriku_bureiza);
        
        ArrayList<Skill> skills_set2 = new ArrayList<>();
        skills_set2.add(galick_cannon);
        skills_set2.add(big_bang);
        skills_set2.add(explosion);
        skills_set2.add(kienzan);
        
        ArrayList<Skill> skills_set3 = new ArrayList<>();
        skills_set3.add(kamehameha);
        skills_set3.add(genkidama);
        skills_set3.add(gyarriku_bureiza);
        skills_set3.add(big_bang);
        
        // Characters
        
        Character goku = new Character("Goku", 100, 12, CharacterType.SAIYAN, skills_set1);
        Character vegeta = new Character("Vegeta", 100, 10, CharacterType.SAIYAN, skills_set2);
        Character cell = new Character("Cell", 100, 20, CharacterType.CYBORG, skills_set3);
        Character majin_bu = new Character("Majin Bu", 100, 15, CharacterType.DEMON, skills_set1);
        
        // Characters list
        ArrayList<Character> characters = new ArrayList<>();
        
        characters.add(goku);
        characters.add(vegeta);
        characters.add(cell);
        characters.add(majin_bu);
        
        
        Scanner user_scanner = new Scanner(System.in);
        int input = 1;
        printCharacter(characters);
        tournament(input, characters, user_scanner);
        
    }
    
    public static void printCharacter(ArrayList<Character> characters) {
        System.out.println("Choose a character for a Fight: \n");
        for (int i = 0; i < characters.size(); i++) {
            System.out.println(i + ". " + characters.get(i).getCharName());
        }
    }
    
    static <input> void tournament(
            int input,
            ArrayList<Character> players,
            Scanner scanner
    ) {
        while (input != 0) {
            try {
                System.out.println("Choose first character: \n");
                Character player_1 = players.get(scanner.nextInt());
                System.out.println("Choose second character: \n");
                Character player_2 = players.get(scanner.nextInt());
                Fight.fight(player_1, player_2);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("!!! Index out of bounds !!!");
                System.out.println("Your input was: " + input);
                System.out.println("Enter a number from 0 to " + (players.size() - 1));
                e.printStackTrace();
            }
            
//            switch (input) {
//                case 1:
//                    System.out.println("You chose: " + players.get(0).getCharName());
//                    Character player_1 = players.get(0);
//                    input = 0;
//                    break;
//                case 2:
//                    System.out.println("You chose: " + players.get(1).getCharName());
//                    player_1 = players.get(1);
//                    input = 0;
//                    break;
//                case 3:
//                    System.out.println("You chose: " + players.get(2).getCharName());
//                    player_1 = players.get(2);
//                    input = 0;
//                    break;
//                case 4:
//                    System.out.println("You chose: " + players.get(3).getCharName());
//                    player_1 = players.get(3);
//                    input = 0;
//                    break;
//                default:
//                    System.out.println("Invalid input, retry");
//                    input = scanner.nextInt();
//                    break;
//            }
//            while (input != 0) {
//                System.out.println("Second character:\n");
//                switch (input) {
//                    case 1:
//                        System.out.println("You chose: " + players.get(0).getCharName());
//                        Character player_2 = players.get(0);
//                        Fight fight = new Fight(player_1, player_2);
//                        input = 0;
//                        break;
//                    case 2:
//                        System.out.println("You chose: " + players.get(1).getCharName());
//                        player_2 = players.get(1);
//                        input = 0;
//                        break;
//                    case 3:
//                        System.out.println("You chose: " + players.get(2).getCharName());
//                        player_2 = players.get(2);
//                        input = 0;
//                        break;
//                    case 4:
//                        System.out.println("You chose: " + players.get(3).getCharName());
//                        player_2 = players.get(3);
//                        input = 0;
//                        break;
//                    default:
//                        System.out.println("Invalid input, retry");
//                        input = scanner.nextInt();
//                        break;
//                }
//            }
            input = 0;
        }
    }
}
    
