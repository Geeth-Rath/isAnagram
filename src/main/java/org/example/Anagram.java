package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
    public void isAnagram(){
        String str1 = "Race";
        String str2 = "Care";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char [] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();

        System.out.println(s1);
        Arrays.sort(s1);
        Arrays.sort(s2);
        System.out.println(s1);

        Boolean a = str1.length() == str2.length();
        Boolean b = Arrays.equals(s1,s2);
        if(a==b){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }

        }
    }

