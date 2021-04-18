package com.fundamenals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number1 = Integer.parseInt(console.nextLine());
        int number2 = Integer.parseInt(console.nextLine());
        int number3 = Integer.parseInt(console.nextLine());
        printSmallestNumber(number1, number2, number3);
    }

    private static void printSmallestNumber(int number1, int number2, int number3) {
        if (number1 <= number2 && number1 <= number3) {
            System.out.println(number1);
        } else if (number2 <= number1 && number2 <= number3) {
            System.out.println(number2);
        } else {
            System.out.println(number3);
        }
    }
}
