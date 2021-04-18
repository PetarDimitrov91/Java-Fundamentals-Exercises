package com.fundamenals;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String product = console.nextLine();
        int quantity = Integer.parseInt(console.nextLine());
        totalPrice(product, quantity);
    }

    private static void totalPrice(String product, int quantity) {
        double productPrice = 0;
        switch (product) {
            case "coffee":
                productPrice = 1.50;
                break;
            case "water":
                productPrice = 1.00;
                break;
            case "coke":
                productPrice = 1.40;
                break;
            case "snacks":
                productPrice = 2.00;
                break;
            default:
                break;
        }
        double result = productPrice * quantity;
        System.out.printf("%.2f", result);
    }

}
