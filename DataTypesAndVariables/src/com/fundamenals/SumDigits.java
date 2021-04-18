package com.fundamenals;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int sum = 0;

        while (n > 0) {

            int lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }
        System.out.println(sum);
    }
}
