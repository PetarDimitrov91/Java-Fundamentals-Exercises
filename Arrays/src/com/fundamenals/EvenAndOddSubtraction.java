package com.fundamenals;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] input = console.nextLine().split(" ");
        int [] numbers = Arrays.stream(input).mapToInt(e -> Integer.parseInt(e)).toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int number : numbers) {
            if(number % 2 == 0){
                evenSum += number;
            }else{
                oddSum += number;
            }

        }

        System.out.println(evenSum - oddSum);

    }
}
