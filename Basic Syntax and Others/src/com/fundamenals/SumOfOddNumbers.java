package com.fundamenals;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        int n = Integer.parseInt(console.nextLine());
        int sum = 0;
        int count = 0;

        for (int i = 1;; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum += i;
                count++;
            }
            if (count==n){
                break;
            }
        }
        System.out.println("Sum: " + sum);
    }
}
