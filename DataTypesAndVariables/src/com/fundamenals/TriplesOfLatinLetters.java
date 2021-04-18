package com.fundamenals;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int i = 0 ; i < n ; i++) {
            char firstChar = (char)('a' + i);
            for (int j = 0; j < n; j++) {
                char secondChar = (char)('a' + j);
                for (int k = 0; k < n; k++) {
                    char thirdChar = (char)('a' + k);


                    String chars = String.format("%c%c%c",firstChar,secondChar,thirdChar);
                    System.out.println(chars);
                }

            }

        }
    }

}
