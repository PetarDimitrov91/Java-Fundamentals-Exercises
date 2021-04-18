package com.fundamenals;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int people = Integer.parseInt(console.nextLine());
        int capacity = Integer.parseInt(console.nextLine());

        double curses =  Math.ceil(1.0 * people / capacity);

        System.out.printf("%.0f",curses);
    }
}
