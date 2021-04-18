package com.fundamenals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		String input = console.nextLine();
		String regexEmojis = "([:]{2})[A-Z][a-z]{2,}\\1|([*]{2})[A-Z][a-z]{2,}\\2";
		String regexNumbers = "([0-9])";
		long coolThreshold = 1;
		int emojisCount = 0;
		List<String> emojisList = new ArrayList<>();
		Pattern numberPattern = Pattern.compile(regexNumbers);
		Matcher numberMatcher = numberPattern.matcher(input);
		int bestSum = 0;
		String coolestEmoji = "";

		while (numberMatcher.find()) {
			int currentNumber = Integer.parseInt(numberMatcher.group(1));
			coolThreshold *= currentNumber;
		}
		Pattern emojiPattern = Pattern.compile(regexEmojis);
		Matcher emojiMatcher = emojiPattern.matcher(input);
		while (emojiMatcher.find()) {
			emojisCount++;
			String currentEmoji = emojiMatcher.group();
			int sumOfLetters = 0;
			for (int i = 0; i < currentEmoji.length(); i++) {
				char currentCharacter = currentEmoji.charAt(i);
				if (Character.isAlphabetic(currentCharacter)) {
					sumOfLetters += currentCharacter;
				}
			}
			if (sumOfLetters >= coolThreshold) {
				emojisList.add(currentEmoji);
				if (sumOfLetters > bestSum) {
					bestSum = sumOfLetters;
					coolestEmoji = currentEmoji;
				}
			}
		}
		System.out.println("Cool threshold: " + coolThreshold);
		System.out.println(emojisCount + " emojis found in the text. The cool ones are:");
		if (!emojisList.isEmpty()) {
			emojisList.forEach(System.out::println);
		}
	}
}
