package com.fundamenals;


import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();

        printMiddleCharacter(input);
    }

    private static void printMiddleCharacter(String input) {

        if (input.length() % 2 == 0) {
            char first = input.charAt(input.length() / 2 - 1);
            char second = input.charAt(input.length() / 2);
            System.out.printf("%c%c", first, second);
        }else {
            char middle = input.charAt(input.length()/2);
            System.out.println(middle);
        }

    }
}
