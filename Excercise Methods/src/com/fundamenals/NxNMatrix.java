package com.fundamenals;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());

        printNxNMatrix(number);
    }

    private static void printNxNMatrix(int number) {

        for (int i = 0; i < number ; i++) {
            printLine(number);
            System.out.println();
        }
    }

    private static void printLine(int number) {
        for (int i = 0; i < number ; i++) {
            System.out.print(number + " ");
        }
    }
}
