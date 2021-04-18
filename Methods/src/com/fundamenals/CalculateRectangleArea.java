package com.fundamenals;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());
        double area = getArea(a,b);
        System.out.printf("%.0f",area);
    }

    private static double getArea(int a, int b) {
        return a * b;
    }
}
