package com.fundamenals;

import java.util.Scanner;

public class ValidUsernames {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String[] usernames = console.nextLine().split(", ");
		for (String username : usernames) {
			if (isValidUserName(username)) {
				System.out.println(username);
			}
		}
	}

	private static boolean isValidUserName(String username) {

		if (username.length() < 3 || username.length() > 16) {
			return false;
		}
		for (int i = 0; i < username.length(); i++) {
			char currentSymbol = username.charAt(i);
			if (!Character.isLetterOrDigit(currentSymbol) && currentSymbol != '-' && currentSymbol != '_') {
				return false;
			}
		}
		return true;
	}
}
