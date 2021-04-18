package com.fundamenals;

import java.util.Scanner;

public class ConvertMetersToKilometers {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int meters = Integer.parseInt(console.nextLine());
        double kilometers = (double) meters / 1000;


        System.out.printf("%.2f",kilometers);



    }
}
