package com.fundamenals;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int start = Integer.parseInt(console.nextLine());
        int end = Integer.parseInt(console.nextLine());

        for (int i = start; i <= end ; i++) {

            char ch = (char)i;

            System.out.print(ch + " ");
        }

    }
}
