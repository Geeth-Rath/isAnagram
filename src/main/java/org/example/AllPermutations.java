package org.example;

import java.util.Arrays;

public class AllPermutations {
    public void getAllPermutations(char[] c, int cid){
        if(cid == c.length-1){
//            System.out.println(c);
            return;
        }
        for(int i = cid; i<= c.length-1; i++){
//            System.out.println("I: "+ i);
            swap(c,i,cid);
            getAllPermutations(c, cid+1);
            System.out.println("****************");
            swap(c,i,cid);

        }

    }
    public void swap(char [] c, int x, int y){
        System.out.println(x +" " + y);
        System.out.println("c:" + Arrays.toString(c));
        char temp = c[x];
        c[x] = c[y];
        c[y] = temp;
        System.out.println("swaped" + Arrays.toString(c));
    }
}
