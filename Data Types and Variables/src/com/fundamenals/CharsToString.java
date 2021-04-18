package com.fundamenals;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        char first = console.nextLine().charAt(0);
        char second = console.nextLine().charAt(0);
        char third = console.nextLine().charAt(0);

        String together = String.format("%c%c%c",first,second,third);
        System.out.println(together);

    }
}
