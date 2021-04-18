package com.fundamenals;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        double number1 = Double.parseDouble(console.nextLine());
        String operator = console.nextLine();
        double number2 = Double.parseDouble(console.nextLine());
        System.out.println(new DecimalFormat("0.####").format(result(number1, operator, number2)));

    }

    private static double result(double number1, String operator, double number2) {
        double result = 0.0;
        switch (operator) {
            case "/":
                result = number1 / number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
        }
        return result;
    }
}
