package com.fundamenals;

import java.util.Scanner;

public class CharacterMultiplier {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String[] input = console.nextLine().split("\\s+");
		String firstWord = input[0];
		String secondWord = input[1];
		double sum = calculate(firstWord, secondWord);
		System.out.printf("%.0f",sum);

	}

	private static double calculate(String firstWord, String secondWord) {
		double sum = 0;
		if (firstWord.length() == secondWord.length()) {
			for (int i = 0; i < firstWord.length(); i++) {
				char currentSymbolFirstWord = firstWord.charAt(i);
				char currentSymbolSecondWord = secondWord.charAt(i);
				sum += currentSymbolFirstWord * currentSymbolSecondWord;
			}
		} else if (firstWord.length() > secondWord.length()) {
			for (int i = 0; i < secondWord.length(); i++) {
				char currentSymbolFirstWord = firstWord.charAt(i);
				char currentSymbolSecondWord = secondWord.charAt(i);
				sum += currentSymbolFirstWord * currentSymbolSecondWord;
			}
			String restWord = firstWord.substring(secondWord.length());
			for (int i = 0; i < restWord.length(); i++) {
				char currentSymbol = restWord.charAt(i);
				sum += currentSymbol;
			}
		} else {
			for (int i = 0; i < firstWord.length(); i++) {
				char currentSymbolFirstWord = firstWord.charAt(i);
				char currentSymbolSecondWord = secondWord.charAt(i);
				sum += currentSymbolFirstWord * currentSymbolSecondWord;
			}
			String restWord = secondWord.substring(firstWord.length());
			for (int i = 0; i < restWord.length(); i++) {
				char currentSymbol = restWord.charAt(i);
				sum += currentSymbol;
			}
		}
		return sum;
	}
}
