package com.fundamenals;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int first = Integer.parseInt(console.nextLine());
        int second = Integer.parseInt(console.nextLine());
        long factorialFirst = factorialFirstNumber(first);
        long factorialSecond = factorialSecondNumber(second);
        printResult(factorialFirst, factorialSecond);
    }

    private static long factorialFirstNumber(int first) {
        float factorial = 1;
        for (int i = 1; i <= first; i++) {
            factorial *= i;
        }
        return (long) factorial;
    }

    private static long factorialSecondNumber(int second) {
        float factorial = 1;
        for (int i = 1; i <= second; i++) {
            factorial *= i;
        }
        return (long) factorial;
    }

    private static void printResult(long factorialFirst, long factorialSecond) {
        float result = (float) (1.0 * factorialFirst / factorialSecond);
        System.out.printf("%.2f", result);
    }
}
