package com.fundamenals;

import java.util.Scanner;

public class IntegerOperations {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number1 = Integer.parseInt(console.nextLine());
        int number2 = Integer.parseInt(console.nextLine());
        int number3 = Integer.parseInt(console.nextLine());
        int number4 = Integer.parseInt(console.nextLine());

        int result = ((number1 + number2) / number3) * number4;

        System.out.println(result);


    }
}
