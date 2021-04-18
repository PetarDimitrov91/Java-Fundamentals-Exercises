package com.fundamenals;

import java.util.Scanner;

public class GreaterOfTwoValues2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String typeOfInput = console.nextLine();
        switch (typeOfInput){
            case "int":
                int first = Integer.parseInt(console.nextLine());
                int second = Integer.parseInt(console.nextLine());
                System.out.println(getMax(first,second));
                break;
            case "char":
                char firstChar = console.nextLine().charAt(0);
                char secondChar = console.nextLine().charAt(0);
                System.out.println(getMax(firstChar,secondChar));
                break;
            case "string":
                String firstString = console.nextLine();
                String secondString = console.nextLine();
                System.out.println(getMax(firstString,secondString));
                break;
        }
    }

    private static int getMax(int first, int second) {
        return Math.max(first,second);
    }

    private static char getMax(char first, char second) {
        if(first > second){
            return first;
        }
        return second;
    }

    private static String getMax(String first, String second) {
        if(first.compareTo(second) >= 0){
            return first;
        }
        return second;
    }
}
