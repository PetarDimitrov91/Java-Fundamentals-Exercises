package com.fundamenals;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String username = console.nextLine();
        StringBuilder passwordBuilder = new StringBuilder();

        for (int position = username.length() - 1; position >= 0; position--) {
            char currentSymbol = username.charAt(position);
            passwordBuilder.append(currentSymbol);

        }

        String password = passwordBuilder.toString();
        String command = console.nextLine();
        int count = 0;
        while (!command.equals(password)) {
            System.out.println("Incorrect password. Try again.");
            count++;
            if (count == 3) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            command = console.nextLine();

        }
        if (command.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
