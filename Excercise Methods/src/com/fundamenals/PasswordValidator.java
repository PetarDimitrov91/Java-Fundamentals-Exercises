package com.fundamenals;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String password = console.nextLine();
        boolean validCountOfCharacters = checkTheCountOfCharacters(password);
        boolean validLettersAndDigits = checkForLettersAndDigits(password);
        boolean validCountOfDigits = checkTheCountOfDigits(password);

        if (validCountOfCharacters && validLettersAndDigits && validCountOfDigits) {
            System.out.println("Password is valid");
        }
        if (!validCountOfCharacters) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!validLettersAndDigits) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!validCountOfDigits) {
            System.out.println("Password must have at least 2 digits");
        }
    }

    private static boolean checkTheCountOfCharacters(String password) {
        int passwordLength = password.length();
        return passwordLength >= 6 && passwordLength <= 10;
    }

    private static boolean checkForLettersAndDigits(String password) {
        boolean letterOrDigit = false;
        for (int i = 0; i < password.length(); i++) {
            char currentSymbol = password.charAt(i);
            if (Character.isDigit(currentSymbol) || Character.isLetter(currentSymbol)) {
                letterOrDigit = true;
            } else {
                return false;
            }
        }
        return letterOrDigit;
    }

    private static boolean checkTheCountOfDigits(String password) {
        int countOfDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            char currentSymbol = password.charAt(i);
            if (Character.isDigit(currentSymbol)){
                countOfDigits++;
            }
        }
        return countOfDigits >= 2;
    }
}
