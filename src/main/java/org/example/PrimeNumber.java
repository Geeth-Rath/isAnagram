package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrimeNumber {
    public void isPrimeNumber(String s){
        String input = "The price is $50, and the quantity is 3.";
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(input);

        while (m.find()){
//            System.out.println(m.group());
            String num = m.group();
            System.out.println("num:" + num);
            int x = Integer.parseInt(num);
            System.out.println(x);
            isPrime(x);
            System.out.println(isPrime(x));
        }
    }

    // Helper method to check if a number is prime
    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
