package org.example;

public class AllSubStrings {
    public void getAllSubStrings(){
        String word = "Hellow";
        for (int i = 0; i <= word.length()-1 ; i++) {
            for (int j = i+1; j <= word.length()-1; j++) {
//                System.out.println("i: "+ i + " j: " + j);
                System.out.print(word.substring(i,j) + ",");
            }
        }
    }
}
