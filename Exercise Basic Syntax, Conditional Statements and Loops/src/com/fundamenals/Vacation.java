package com.fundamenals;

import java.util.Scanner;

public class Vacation {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int countOfPeople = Integer.parseInt(console.nextLine());
        String kindOfPeople = console.nextLine();
        String day = console.nextLine();

        double priceProPerson = 0;

        switch (kindOfPeople) {
            case "Students":
                switch (day) {
                    case "Friday":
                        priceProPerson = 8.45;
                        break;
                    case "Saturday":
                        priceProPerson = 9.80;
                        break;
                    case "Sunday":
                        priceProPerson = 10.46;
                        break;
                }
                break;
            case "Business":
                switch (day) {
                    case "Friday":
                        priceProPerson = 10.90;
                        break;
                    case "Saturday":
                        priceProPerson = 15.60;
                        break;
                    case "Sunday":
                        priceProPerson = 16.00;
                        break;
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        priceProPerson = 15.00;
                        break;
                    case "Saturday":
                        priceProPerson = 20.00;
                        break;
                    case "Sunday":
                        priceProPerson = 22.50;
                        break;
                }
                break;
        }
        double totalPrice = countOfPeople * priceProPerson;

        if (countOfPeople >= 30 && kindOfPeople.equals("Students")) {
            totalPrice *= 0.85;
        } else if (countOfPeople >= 100 && kindOfPeople.equals("Business")) {
            totalPrice -= 10 * priceProPerson;
        } else if (countOfPeople >= 10 && countOfPeople <= 20 && kindOfPeople.equals("Regular")) {
            totalPrice *= 0.95;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
