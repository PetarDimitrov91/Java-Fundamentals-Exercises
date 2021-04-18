package com.fundamenals;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int lostGames = Integer.parseInt(console.nextLine());
        double headsetPrice = Double.parseDouble(console.nextLine());
        double mousePrice = Double.parseDouble(console.nextLine());
        double keyboardPrice = Double.parseDouble(console.nextLine());
        double displayPrice = Double.parseDouble(console.nextLine());

        int countHeadset = lostGames / 2;
        double sumHeadset = countHeadset * headsetPrice;

        int countMouse = lostGames / 3;
        double sumMouse = countMouse * mousePrice;

        int countKeyboard = lostGames / 6;
        double sumKeyboard = countKeyboard * keyboardPrice;

        int countDisplay = lostGames / 12;
        double sumDisplay = countDisplay * displayPrice;

        double expenses = sumHeadset + sumMouse + sumKeyboard + sumDisplay;

        System.out.printf("Rage expenses: %.2f lv.", expenses);


    }
}
