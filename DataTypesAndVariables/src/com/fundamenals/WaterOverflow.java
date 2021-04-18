package com.fundamenals;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int sumOfLiters = 0;

        for (int i = 1; i <= n; i++) {

            int liters = Integer.parseInt(console.nextLine());
            sumOfLiters += liters;

            if(sumOfLiters >255){
                System.out.printf("Insufficient capacity!%n");
                sumOfLiters -= liters;
            }


        }
        System.out.println(sumOfLiters);
    }
}
