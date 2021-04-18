package com.fundamenals;

import java.util.*;

public class OddOccurrences {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		String[] wordSequence = console.nextLine().toLowerCase().split("\\s+");
		Map<String, Integer> words = new LinkedHashMap<>();
		for (String word : wordSequence) {
			if (!words.containsKey(word)) {
				words.put(word, 1);
			} else {
				int currentOccurrences = words.get(word) + 1;
				words.put(word, currentOccurrences);
			}
		}
		List<String> finalStrings = new ArrayList<>();
		for (Map.Entry<String, Integer> stringIntegerEntry : words.entrySet()) {
			if (stringIntegerEntry.getValue() % 2 == 1) {
				finalStrings.add(stringIntegerEntry.getKey());
			}
		}
		System.out.println(String.join(", ", finalStrings));


	}
}
