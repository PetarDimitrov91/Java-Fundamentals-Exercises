package com.fundamenals;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int height = Integer.parseInt(console.nextLine());
        printTriangle(height);
    }

    private static void printTriangle(int height) {
        printTopHalf(height);
        printToBottom(height);
    }

    private static void printTopHalf(int height) {
        for (int i = 1; i <= height; i++) {
            printSingleLine(i);
        }
    }

    private static void printToBottom(int height) {
        for (int i = height - 1; i >= 1; i--) {
            printSingleLine(i);
        }
        System.out.println();
    }

    private static void printSingleLine(int length) {
        for (int i = 1; i <= length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
