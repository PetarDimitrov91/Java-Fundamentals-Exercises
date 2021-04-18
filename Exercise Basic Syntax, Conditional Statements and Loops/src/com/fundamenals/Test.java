package com.fundamenals;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double nutsPrice = 2.0;
        double waterPrice = 0.7;
        double crispsPrice = 1.5;
        double sodaPrice = 0.8;
        double cokePrise = 1.0;

        double totalAmount = 0;
        String command = console.nextLine();

        while (!command.equals("Start")) {
            double amount = Double.parseDouble(command);
            totalAmount += amount;

            if (amount != 0.1 && amount != 0.2 && amount != 0.5 && amount != 1.0 && amount != 2) {
                System.out.printf("Cannot accept %.2f%n", amount);
                totalAmount -= amount;
            }
            command = console.nextLine();
        }
        command = console.nextLine();
        while (!command.equals("End")) {

            switch (command) {
                case "Nuts":
                    totalAmount -= nutsPrice;
                    System.out.println("Purchased " + command);
                    break;
                case "Water":
                    totalAmount -= waterPrice;
                    System.out.println("Purchased " + command);
                    break;
                case "Crisps":
                    totalAmount -= crispsPrice;
                    System.out.println("Purchased " + command);
                    break;
                case "Soda":
                    totalAmount -= sodaPrice;
                    System.out.println("Purchased " + command);
                    break;
                case "Coke":
                    totalAmount -= cokePrise;
                    System.out.println("Purchased " + command);
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            if (totalAmount < 0) {
                System.out.println("Sorry, not enough money");
                switch (command) {
                    case "Nuts":
                        totalAmount += nutsPrice;
                        break;
                    case "Water":
                        totalAmount += waterPrice;
                        break;
                    case "Crisps":
                        totalAmount += crispsPrice;
                        break;
                    case "Soda":
                        totalAmount += sodaPrice;
                        break;
                    case "Coke":
                        totalAmount += cokePrise;
                        break;
                    default:
                }
            }
            command = console.nextLine();
        }
        System.out.printf("Change: %.2f", totalAmount);
    }
}
