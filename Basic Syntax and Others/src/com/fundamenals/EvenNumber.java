package com.fundamenals;

import java.util.Scanner;

public class EvenNumber {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        while (true) {

            int n = Integer.parseInt(console.nextLine());

            if (n % 2 == 0){
                System.out.printf("The number is: %d",Math.abs(n));
                break;
            }else {
                System.out.println("Please write an even number.");
            }
        }
    }
}
