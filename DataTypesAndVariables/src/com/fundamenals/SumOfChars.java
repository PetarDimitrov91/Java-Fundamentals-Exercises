package com.fundamenals;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int countSymbols = Integer.parseInt(console.nextLine());
        int sum = 0;

        for (int i = 1; i <=countSymbols ; i++) {
            char symbol = console.nextLine().charAt(0);
            sum += symbol;

        }
        System.out.printf("The sum equals: %d", sum);
    }
}
