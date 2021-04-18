package com.fundamenals;

import java.util.Scanner;

public class TextFilter {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		String[] bannedWords = console.nextLine().split(", ");
		String text = console.nextLine();
		if (text.contains(bannedWords[1]) || text.contains(bannedWords[0])) {
			text = replaceWords(bannedWords, text);
		}
		System.out.println(text);
	}

	private static String replaceWords(String[] bannedWords, String text) {
		StringBuilder replacement = new StringBuilder();
		for (String wordToReplace : bannedWords) {
			for (int j = 0; j < wordToReplace.length(); j++) {
				replacement.append("*");
			}
			text = text.replaceAll(wordToReplace, replacement.toString());
			replacement.setLength(0);
		}
		return text;
	}
}
