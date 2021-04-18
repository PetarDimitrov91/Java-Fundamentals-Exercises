package com.fundamenals;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int result = 0;

        for (int i = 1; i <= 10; i++) {

            result = n * i;

            System.out.printf("%d X %d = %d%n",n,i,result);

        }


    }
}
