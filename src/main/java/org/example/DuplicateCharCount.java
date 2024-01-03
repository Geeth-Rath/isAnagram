package org.example;

import java.util.Arrays;

public class DuplicateCharCount {
    public void isDuplicate(){
        String word = "anndkggee";
        int count = 1;

        char [] c = word.toCharArray();
        System.out.println("unsorted: "+ Arrays.toString(c));
        Arrays.sort(c);
        System.out.println("sorted: " + Arrays.toString(c));
        int i = 0;
        while(i<= c.length-2){
            if (c[i] == c[i+1]) {
                count++;
            }else{
                System.out.print(c[i] +" " +count+" ");
                count = 1;
            }
            i++;
        }
        System.out.print(c[c.length-1] +" " +count);

    }
}
