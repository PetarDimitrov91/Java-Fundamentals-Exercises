package com.fundamenals;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        int repeatTimes = Integer.parseInt(console.nextLine());
        StringBuilder newOutput = repeatString(input, repeatTimes);
        System.out.println(newOutput);
    }

    private static StringBuilder repeatString(String text , int times) {

        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < times ; i++) {
            newString.append(text);
        }
        return newString;
    }
}
