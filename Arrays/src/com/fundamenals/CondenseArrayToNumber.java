package com.fundamenals;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] array = console.nextLine().split(" ");
        int[] nums = Arrays.stream(array).mapToInt(e -> Integer.parseInt(e)).toArray();

        int[] condensed = new int[nums.length - 1];
        if (nums.length == 1) {
            System.out.println(nums[0]);
        } else {
            for (int index = 0; index < nums.length; index++) {
                for (int i = 0; i < nums.length - 1; i++) {
                    condensed[i] = nums[i] + nums[i + 1];

                }
                nums = condensed;
            }
            System.out.println(condensed[0]);
        }
    }
}
