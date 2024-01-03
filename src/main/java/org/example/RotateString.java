package org.example;

public class RotateString {
    String word = "java";
    public Boolean isRotated(String checkWord){
        String conword = word+word;
        Boolean flag = conword.contains(checkWord);
        return flag;

    }
}
