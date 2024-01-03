package org.example;

public class UniqueString {
    public void isUnique(){
//        String word ="hutg9mnd!nk9";
        String word ="abcd10jk";
        char [] c = word.toCharArray();
        for (int i = 0; i <= word.length()-1; i++) {
            for (int j = i+1; j <= word.length()-1; j++) {
                if (c[i] == c[j]) {
                    System.out.println(c[i]);
                    System.out.println("j: "+c[j]);
                    System.out.println("False");
                    return;
                }
            }
        }
        System.out.println("unique word");
    }
}
