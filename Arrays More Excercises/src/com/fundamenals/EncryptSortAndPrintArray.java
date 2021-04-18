package com.fundamenals;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int numberOfInputs = Integer.parseInt(console.nextLine());
        int[] arrayOfResults = new int[numberOfInputs];
        int sum = 0;

        for (int i = 0; i < numberOfInputs; i++) {
            String name = console.nextLine();
            char[] arrayOfNameChars = new char[name.length()];
            for (int j = 0; j < name.length(); j++) {
                char ch = name.charAt(j);
                arrayOfNameChars[j] = ch;
                boolean isVowel = false;
                boolean isConsonant = false;
                switch (ch) {
                    case 'A':
                    case 'a':
                    case 'E':
                    case 'e':
                    case 'I':
                    case 'i':
                    case 'O':
                    case 'o':
                    case 'U':
                    case 'u':
                        isVowel = true;
                        break;
                    default:
                        isConsonant = true;
                        break;
                }
                if (isVowel) {
                    sum += name.charAt(j) * name.length();
                } else {
                    sum += name.charAt(j) / name.length();
                }
            }
            arrayOfResults[i] = sum;
            sum = 0;

        }
        Arrays.sort(arrayOfResults);
        for (int arrayOfResult : arrayOfResults) {
            System.out.println(arrayOfResult);
        }
    }
}

