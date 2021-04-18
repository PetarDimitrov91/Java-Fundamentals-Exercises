package com.fundamenals;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        printTopNumbers(number);

    }

    private static void printTopNumbers(int number) {
        for (int i = 10; i <= number; i++) {
            if (sumDivisibleByEight(i) && atLeastOneOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean sumDivisibleByEight(int i) {
        int number = i;
        int digitSum = 0;
        while (number > 0){
            int lastDigit = number % 10;
            digitSum += lastDigit;
            number /=10;
        }
            return digitSum % 8 ==0;
    }

    private static boolean atLeastOneOddDigit(int i) {
        int number = i;
        while (number > 0){
            int lastDigit = number%10;
            number /= 10;
            if (lastDigit % 2 == 1){
                return true;
            }
        }
        return false;
    }
}



