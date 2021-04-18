package Exam3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String regex = "([#@])[A-Za-z]{3,}\\1\\1[A-Za-z]{3,}\\1";
		Pattern pattern = Pattern.compile(regex);
		String input = console.nextLine();
		Matcher matcher = pattern.matcher(input);
		List<String> matchedWords = new ArrayList<>();
		while (matcher.find()) {
			matchedWords.add(matcher.group());
		}
		List<String> mirrorWords = new ArrayList<>();

		for (String matchedWord : matchedWords) {
			String[] currentWords = matchedWord.trim().split("[@#]+");
			String firstWord = currentWords[1];
			StringBuilder secondWord = new StringBuilder(currentWords[2]).reverse();
			if (secondWord.toString().equals(firstWord)) {
				mirrorWords.add(firstWord + " <=> " + secondWord.reverse().toString());
			}
		}
		if (matchedWords.isEmpty()) {
			System.out.println("No word pairs found!");
		} else {
			System.out.println(matchedWords.size() + " word pairs found!");

		}
		if (mirrorWords.isEmpty()) {
			System.out.println("No mirror words!");
		} else {
			System.out.println("The mirror words are:");
			System.out.println(String.join(", ", mirrorWords));
		}

	}
}
