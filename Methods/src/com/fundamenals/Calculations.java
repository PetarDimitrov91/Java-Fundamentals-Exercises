package com.fundamenals;

import java.util.Scanner;


public class Calculations {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String command = console.nextLine();
        double a = Double.parseDouble(console.nextLine());
        double b = Double.parseDouble(console.nextLine());
        result(command, a, b);
    }

    private static void result(String command, double a, double b) {
        switch (command) {
            case "add":
                System.out.printf("%.0f", add(a, b));
                break;
            case "subtract":
                System.out.printf("%.0f", subtract(a, b));
                break;
            case "multiply":
                System.out.printf("%.0f", multiply(a, b));
                break;
            case "divide":
                System.out.printf("%.0f", divide(a, b));
                break;
        }
    }

    private static double add(double a, double b) {
        return a + b;
    }

    private static double subtract(double a, double b) {
        return a - b;
    }

    private static double multiply(double a, double b) {
        return a * b;
    }

    private static double divide(double a, double b) {
        return a / b;
    }
}
