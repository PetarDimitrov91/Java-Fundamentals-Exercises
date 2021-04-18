package com.fundamenals;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String text = console.nextLine();
		Map<Character, Integer> lettersCount = new LinkedHashMap<>();
		for (int i = 0; i < text.length(); i++) {
			char currentSymbol = text.charAt(i);
			if (currentSymbol == ' ') {
				continue;
			}
			if (!lettersCount.containsKey(currentSymbol)) {
				lettersCount.put(currentSymbol, 1);
			} else {
				lettersCount.put(currentSymbol, lettersCount.get(currentSymbol) + 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : lettersCount.entrySet()) {
			System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
		}
	}
}
