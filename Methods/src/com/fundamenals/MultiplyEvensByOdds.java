package com.fundamenals;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Math.abs(Integer.parseInt(console.nextLine()));
        getMultipleOfEvenAndOdds(number);
    }

    private static void getMultipleOfEvenAndOdds(int number) {
        System.out.println(evenSum(number) * oddSum(number));
    }

    private static int evenSum(int number) {
        int evenSum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            }
            number /= 10;
        }
        return evenSum;
    }

    private static int oddSum(int number) {
        int oddSum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                oddSum += digit;
            }
            number /= 10;
        }
        return oddSum;
    }
}
