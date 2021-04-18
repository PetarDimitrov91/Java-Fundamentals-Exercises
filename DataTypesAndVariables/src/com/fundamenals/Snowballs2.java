package com.fundamenals;

import java.util.Scanner;

public class Snowballs2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        byte snowballsCount = Byte.parseByte(console.nextLine());
        double bestValue = 0.0D;
        boolean isBest = false;

        short snowballSnow;
        short snowballTime;
        short snowballQuantity;

        short snowballSnowBest = 0;
        short snowballTimeBest = 0;
        short snowballQuantityBest = 0;

        for (int i = 1; i <= snowballsCount; i++) {

            snowballSnow = Short.parseShort(console.nextLine());
            snowballTime = Short.parseShort(console.nextLine());
            snowballQuantity = Short.parseShort(console.nextLine());

            double value=  Math.pow(1.0 * snowballSnow / snowballTime,snowballQuantity);

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
