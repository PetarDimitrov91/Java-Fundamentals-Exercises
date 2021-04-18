package com.fundamenals;

import java.util.Arrays;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int[] nums = Arrays.stream(console.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();

        int[] condensed = new int[nums.length - 1];

        for (int index = 0; index < nums.length ; index++) {
            for (int i = 0; i < nums.length - 1  ; i++) {
                condensed[i] = nums[i] + nums[i + 1];

            }
            nums = condensed;
        }
        System.out.println(condensed[0]);

    }
}


