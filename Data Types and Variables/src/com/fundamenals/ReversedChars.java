package com.fundamenals;

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        char firstChar = console.nextLine().charAt(0);
        char secondChar = console.nextLine().charAt(0);
        char thirdChar = console.nextLine().charAt(0);

        System.out.printf("%c %c %c", thirdChar, secondChar, firstChar);
    }
}
