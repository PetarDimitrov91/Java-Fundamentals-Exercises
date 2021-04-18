package com.fundamenals;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int snowballsCount = Integer.parseInt(console.nextLine());
        double bestValue = 0;
        boolean isBest = false;

        int snowballSnow = 0;
        int snowballTime = 0;
        int snowballQuantity = 0;

        int snowballSnowBest = 0;
        int snowballTimeBest = 0;
        int snowballQuantityBest = 0;

        for (int i = 1; i <= snowballsCount; i++) {

            snowballSnow = Integer.parseInt(console.nextLine());
            snowballTime = Integer.parseInt(console.nextLine());
            snowballQuantity = Integer.parseInt(console.nextLine());

            double value = Math.pow((double) snowballSnow / snowballTime,snowballQuantity);

            if (value > bestValue) {
                bestValue = value;
                isBest = true;
                snowballSnowBest = snowballSnow;
                snowballTimeBest = snowballTime;
                snowballQuantityBest = snowballQuantity;

            }

        }
        if (isBest) {
            System.out.printf("%d : %d = %.0f (%d)", snowballSnowBest, snowballTimeBest, bestValue, snowballQuantityBest);
        }

    }
}
