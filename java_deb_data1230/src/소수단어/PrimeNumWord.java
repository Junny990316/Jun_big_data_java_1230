package 소수단어;

import java.util.Scanner;

public class PrimeNumWord {
    public static void main(String[] args) {
        int sum = 0;
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        String alphabet = sc.next();

        for (int i = 0; i < alphabet.length(); i++) {
            if (alphabet.charAt(i) >= 'a') sum += alphabet.charAt(i) - 'a' + 1;
             else sum += alphabet.charAt(i) - 'A' + 27;
        }
        System.out.println("합 : " + sum);

        for (int i = 2; i < sum; i++) {
            if (sum % i == 0) isPrime = false;

        }
        if (isPrime) System.out.println("it is not a prime word");
         else System.out.println("it is a prime word");

    }
}
