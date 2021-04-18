package com.fundamenals;

import java.util.Scanner;

public class ReplaceRepeatingChars {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		StringBuilder input = new StringBuilder(console.nextLine());

		for (int i = 1; i <= input.length() - 1; i++) {
			char currentSymbol = input.charAt(i-1);
			if (currentSymbol == input.charAt(i)) {
				input.deleteCharAt(i);
				i--;
			}
		}
		System.out.println(input);
	}

}

