package com.fundamenals;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
// First way to read Array
         int[] firstArray = Arrays.stream(console.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

// Second way to read Array
         String input = console.nextLine();
         String[] splittedInput = input.split( " ");
         int secondArray[] = new int[splittedInput.length];

        for (int i = 0; i < splittedInput.length ; i++) {
        secondArray[i] = Integer.parseInt(splittedInput[i]);
        }

        int sum = 0;
        boolean isFalse = false;

        for (int i = 0; i <firstArray.length ; i++) {
            sum+=firstArray[i];
            if(firstArray[i] != secondArray[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                isFalse = true;
                break;
            }
        }
        if(!isFalse)
        System.out.printf("Arrays are identical. Sum: %d",sum);
    }
}
