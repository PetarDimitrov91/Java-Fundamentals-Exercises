package com.fundamenals;

import java.util.Scanner;

public class Passed {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double grade = Double.parseDouble(console.nextLine());

        if (grade >= 3) {
            System.out.println("Passed!");

        }
    }
}