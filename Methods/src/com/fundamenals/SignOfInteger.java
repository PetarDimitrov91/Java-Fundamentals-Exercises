package com.fundamenals;

import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        printSign(number);
    }

    private static void printSign(int number) {
        if (number < 0) {
            System.out.printf("The number %d is negative.", number);
        }else if(number>0){
            System.out.printf("The number %d is positive.",number);
        }else{
            System.out.printf("The number %d is zero.", number);
        }
    }
}
