package com.fundamenals;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int power = Integer.parseInt(console.nextLine());
        int distance = Integer.parseInt(console.nextLine());
        int factor = Integer.parseInt(console.nextLine());
        double half = power / 2.0;
        int countPokedTarget = 0;

        while (power >= distance) {
            power -= distance;
            countPokedTarget++;

            if (power == half) {
                if (factor != 0) {
                    power = power / factor;
                }
            }

        }
        System.out.println(power);
        System.out.println(countPokedTarget);

    }
}
