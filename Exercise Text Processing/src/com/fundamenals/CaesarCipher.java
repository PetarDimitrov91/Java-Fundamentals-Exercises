package com.fundamenals;

import java.util.Scanner;

public class CaesarCipher {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String input = console.nextLine();
		StringBuilder encryptedInput = new StringBuilder();
		for (int i = 0; i <input.length() ; i++) {
			char currentSymbol = input.charAt(i);
			currentSymbol += 3;
			encryptedInput.append(currentSymbol);
		}
		System.out.println(encryptedInput.toString());
	}
}
