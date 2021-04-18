package com.fundamenals;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String dayType = console.nextLine();
        int age = Integer.parseInt(console.nextLine());
        boolean isValid = false;

        int ticketPrice = 0;

        switch (dayType) {
            case "Weekday":
                if (age >= 0 && age <= 18) {
                    ticketPrice = 12;
                } else if (age > 18 && age <= 64) {
                    ticketPrice = 18;
                } else if (age > 64 && age <= 122) {
                    ticketPrice = 12;
                } else {
                    isValid = true;
                    System.out.println("Error!");
                }
                break;
            case "Weekend":
                if (age >= 0 && age <= 18) {
                    ticketPrice = 15;
                } else if (age > 18 && age <= 64) {
                    ticketPrice = 20;
                } else if (age > 64 && age <= 122) {
                    ticketPrice = 15;
                } else {
                    isValid = true;
                    System.out.println("Error!");
                }
                break;
            case "Holiday":
                if (age >= 0 && age <= 18) {
                    ticketPrice = 5;
                } else if (age > 18 && age <= 64) {
                    ticketPrice = 12;
                } else if (age > 64 && age <= 122) {
                    ticketPrice = 10;
                } else {
                    isValid = true;
                    System.out.println("Error!");
                }
                break;
        }
        if (!isValid) {
            System.out.printf("%d$", ticketPrice);
        }

    }
}
