package com.fundamenals;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int num = Integer.parseInt(console.nextLine());
        int startNumber = num;

        int factSum = 0;

        while (num != 0) {

            int digit = num % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            factSum += fact;
            num /= 10;
        }

        if (factSum == startNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");

        }
    }
}
