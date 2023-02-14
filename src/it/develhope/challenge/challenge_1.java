package it.develhope.challenge;

import java.util.*;

import static java.lang.reflect.Array.set;

public class challenge_1 {
    
    //method for sorting challenge

//    public static ArrayList<Integer> SymDiff(ArrayList<Integer>... sets){
//
//        ArrayList<Integer> finalSet = new ArrayList<>();
//        ArrayList<Integer> alreadyInserted = new ArrayList<>();
//
//        for(ArrayList<Integer> set : sets){
//            for(int number : set){
//                if(!finalSet.contains(number) && !alreadyInserted.contains(number)){
//                    finalSet.add(number);
//                }
//                else{
//                    finalSet.removeIf(eachNumber -> eachNumber == number && !alreadyInserted.contains(number));
//                }
//                alreadyInserted.add(number);
//            }
//            alreadyInserted.clear();
//        }
//        Collections.sort(finalSet);
//        System.out.println(finalSet);
//        return finalSet;
//    }
//}
    
    public static ArrayList<Integer> symDiff(ArrayList<Integer>... sets) {
        
        ArrayList<Integer> finalSet = new ArrayList<>();
        ArrayList<Integer> sym = new ArrayList<>();
        
        for (ArrayList<Integer> xet : sets) {
            for (int number : xet) {
                if (!finalSet.contains(number)) {
                    finalSet.add(number);
                } else {
                    finalSet.removeIf(eachNumber -> eachNumber == number && !sym.contains(number));
                }
                sym.add(number);
            }
            sym.clear();
        }
        
        Collections.sort(finalSet);
        return finalSet;
    }
    
    public static void main(String[] args) {
        
        System.out.println(symDiff(new ArrayList<>(Arrays.asList(3, 3, 3, 2, 5)),
                new ArrayList<>(Arrays.asList(2, 1, 5, 7)),
                new ArrayList<>(Arrays.asList(3, 4, 6, 6)),
                new ArrayList<>(Arrays.asList(1, 2, 3)),
                new ArrayList<>(Arrays.asList(5, 3, 9, 8)),
                new ArrayList<>(List.of(1))));
        //should return [1, 2, 4, 5, 6, 7, 8, 9]);
    }
    
}