package com.fundamenals;



import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        int[] arrayOfNumbers = Arrays.stream(console.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int sum = 0;

        for (int arrayOfNumber : arrayOfNumbers) {
            if(arrayOfNumber % 2 == 0){
                sum += arrayOfNumber;
            }

        }

        System.out.println(sum);


    }
}
