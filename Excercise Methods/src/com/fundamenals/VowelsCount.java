package com.fundamenals;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        printVowelsCount(input);
    }

    private static void printVowelsCount(String input) {
        int vowelsCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            switch (ch) {
                case 'A':
                case 'a':
                case 'E':
                case 'e':
                case 'I':
                case 'i':
                case 'O':
                case 'o':
                case 'U':
                case 'u':
                    vowelsCount++;
                    break;
            }
        }
        System.out.println(vowelsCount);
    }
}
