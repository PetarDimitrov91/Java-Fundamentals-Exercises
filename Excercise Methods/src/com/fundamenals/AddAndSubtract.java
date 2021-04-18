package com.fundamenals;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstNumber = Integer.parseInt(console.nextLine());
        int secondNumber = Integer.parseInt(console.nextLine());
        int thirdNumber = Integer.parseInt(console.nextLine());
        result(firstNumber,secondNumber,thirdNumber);
    }

    private static void result(int firstNumber, int secondNumber, int thirdNumber) {
        int result = firstAndSecondSum(firstNumber,secondNumber) - thirdNumber;
        System.out.println(result);
    }

    private static int firstAndSecondSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
