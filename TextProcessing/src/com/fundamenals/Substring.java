package com.fundamenals;

import java.util.Scanner;

public class Substring {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String wordToRemove = console.nextLine();
		String input = console.nextLine();
		while (input.contains(wordToRemove)) {
			input = removeOccurrences(input, wordToRemove);
		}
		System.out.println(input);
	}

	private static String removeOccurrences(String input, String wordToRemove) {
		int beginIndex = input.indexOf(wordToRemove);
		int endIndex = beginIndex + wordToRemove.length();
		return input.substring(0, beginIndex) + input.substring(endIndex);
	}
}
