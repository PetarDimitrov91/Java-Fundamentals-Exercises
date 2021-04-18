package com.fundamenals;

import java.util.Scanner;

public class RepeatStrings {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		String[] words = console.nextLine().split(" ");

		for (String word : words) {
			String repeatedWord = repeatWord(word, word.length());
			System.out.print(repeatedWord);
		}
	}

	private static String repeatWord(String word, int length) {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < length; i++) {
			str.append(word);
		}
		return str.toString();
	}
}
