package com.fundamenals;

import java.util.Scanner;

public class PoundsToDollars {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double pounds = Double.parseDouble(console.nextLine());
        double exchangeCourse = 1.31;
        double dollars = pounds * exchangeCourse;

        System.out.printf("%.3f", dollars);

    }
}
