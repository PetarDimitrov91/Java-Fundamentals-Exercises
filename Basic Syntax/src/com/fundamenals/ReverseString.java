package com.fundamenals;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();

        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1.reverse();

        System.out.println(input1);
    }


}
