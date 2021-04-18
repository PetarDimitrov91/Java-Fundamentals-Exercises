package com.fundamenals;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        StringBuilder email = new StringBuilder(console.nextLine());
        String input = console.nextLine().trim();
        while (!input.equals("Complete")) {
            String[] inputData = input.split("\\s+");
            String command = inputData[0];
            switch (command) {
                case "Make":
                    String secondCommand = inputData[1];
                    switch (secondCommand) {
                        case "Upper":
                            String toUpperCase = email.toString().toUpperCase();
                            email.setLength(0);
                            email.append(toUpperCase);
                            print(email);
                            break;
                        case "Lower":
                            String toLowerCase = email.toString().toLowerCase();
                            email.setLength(0);
                            email.append(toLowerCase);
                            print(email);
                            break;
                    }
                    break;
                case "GetDomain":
                    int n = Integer.parseInt(inputData[1]);
                    String substring = email.substring(email.length() - n);
                    System.out.println(substring);
                    break;
                case "GetUsername":
                    if (email.toString().contains("@")) {
                        int index = email.indexOf("@");
                        String username = email.substring(0, index);
                        System.out.println(username);
                    } else {
                        System.out.printf("The email %s doesn't contain the @ symbol. %n", email);
                    }
                    break;
                case "Replace":
                    String replacement = inputData[1];
                    String newEmail = email.toString().replace(replacement, "-");
                    email.setLength(0);
                    email.append(newEmail);
                    print(email);
                    break;
                case "Encrypt":
                    for (int i = 0; i < email.length(); i++) {
                        int toPrint = email.charAt(i);
                        System.out.print(toPrint + " ");
                    }
                    break;
            }

            input = console.nextLine();
        }

    }

    static void print(StringBuilder email) {
        System.out.println(email);
    }
}

//likedMeals
//				.entrySet()
//				.stream()
//				.sorted(comparingInt(e -> e.getValue().size()).reversed())
//				.forEach(e -> System.out.printf("%s: %s%n", e.getKey(), String.join(", ", e.getValue())));
