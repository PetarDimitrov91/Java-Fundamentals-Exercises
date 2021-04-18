package com.fundamenals;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double number = Double.parseDouble(console.nextLine());
        double power = Double.parseDouble(console.nextLine());
        double result = getPower(number, power);
        System.out.println(new DecimalFormat("0.####").format(result));
    }

    private static double getPower(double a, double b) {
        return  Math.pow(a, b);
    }
}
