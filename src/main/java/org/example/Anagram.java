package org.example;

public class Anagram {
    public void isAnagram(){
        String str1 = "Race";
        String str2 = "Care";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char [] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();

        System.out.println("str1 : " + str1);
//        System.out.println(str2);
        char temp ;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= str1.length()-1; i++) {
            for (int j = i; j <= str1.length()-1; j++) {

                temp =  str1.charAt(i);
                s1[i] = s1[j];
                s1[j] = temp;
//                System.out.println("tem: " + new String(s1));
                System.out.println(str1.charAt(i));

            }
//            if(s1 == s2) {
//                System.out.println("yes");
//            }
//            System.out.println(s1);
        }




    }
}
