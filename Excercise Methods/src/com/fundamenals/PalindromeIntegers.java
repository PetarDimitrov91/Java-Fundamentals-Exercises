package com.fundamenals;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        while (!input.equals("END")) {
            palindromeNumber(input);
            input = console.nextLine();
        }
    }

    private static void palindromeNumber(String number) {
        if (checkTheNumberForPalindrome(number)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    static boolean checkTheNumberForPalindrome(String number) {
        StringBuilder reversedNumber = new StringBuilder();
        reversedNumber.append(number);
        reversedNumber.reverse();
        String newReversedNumber = reversedNumber.toString();
        return newReversedNumber.equals(number);
    }

}


