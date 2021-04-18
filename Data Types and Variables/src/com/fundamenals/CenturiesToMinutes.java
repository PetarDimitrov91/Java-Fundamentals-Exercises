package com.fundamenals;

import java.util.Scanner;

public class CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int centuries = Integer.parseInt(console.nextLine());

        int years = centuries * 100;
        int days = (int) (years * 365.2422);
        int hours = 24 * days;
        int minutes = 60 * hours;

        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes",centuries,years,days,hours,minutes );
    }
}
