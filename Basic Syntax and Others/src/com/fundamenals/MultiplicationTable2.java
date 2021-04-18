package com.fundamenals;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int multiplier = Integer.parseInt(console.nextLine());

        int result = 0;
        if (multiplier > 10) {
            result = n * multiplier;
            System.out.printf("%d X %d = %d%n", n, multiplier, result);
        } else {
            for (int i = multiplier; i <= 10; i++) {
                result = n * i;
                System.out.printf("%d X %d = %d%n", n, i, result);

            }

        }
    }
}
