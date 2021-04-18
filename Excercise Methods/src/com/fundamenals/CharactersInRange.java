package com.fundamenals;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        char ch1 = console.nextLine().charAt(0);
        char ch2 = console.nextLine().charAt(0);
        printCharactersInRange(ch1, ch2);
    }

    private static void printCharactersInRange(char ch1, char ch2) {
        if (ch1 < ch2) {
            for (int i = ch1 + 1; i < ch2; i++) {
                char ch = (char) i;
                System.out.print(ch + " ");
            }
        } else {
            for (int i = ch2 + 1; i <= ch1 - 1; i++) {
                char ch = (char) i;
                System.out.print(ch + " ");
            }
        }
    }
}
