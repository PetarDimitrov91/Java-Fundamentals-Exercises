package com.fundamenals;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int startYield = Integer.parseInt(console.nextLine());
        int yield = 0;
        int dayCounter = 0;

        while (startYield >= 100) {

            yield += startYield;
            dayCounter++;
            startYield -= 10;
            if (yield > 26) {
                yield -= 26;
            }
        }

        if (yield > 26) {
            yield -= 26;
        }

        System.out.println(dayCounter);
        System.out.println(yield);
    }
}
