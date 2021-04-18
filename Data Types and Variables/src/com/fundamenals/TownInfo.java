package com.fundamenals;

import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String town = console.nextLine();
        int population = Integer.parseInt(console.nextLine());
        int area = Integer.parseInt(console.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", town, population, area);
    }
}
