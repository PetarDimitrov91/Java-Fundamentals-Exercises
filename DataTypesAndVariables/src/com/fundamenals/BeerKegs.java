package com.fundamenals;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int countOfKegs = Integer.parseInt(console.nextLine());
        double maxVolume = Double.MIN_VALUE;
        String maxKeg = "";

        for (int i = 1; i <= countOfKegs; i++) {
            String model = console.nextLine();
            double radius = Double.parseDouble(console.nextLine());
            int height = Integer.parseInt(console.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume > maxVolume){
                maxVolume = volume;
                maxKeg = model;
            }
        }
        System.out.println(maxKeg);
    }
}
