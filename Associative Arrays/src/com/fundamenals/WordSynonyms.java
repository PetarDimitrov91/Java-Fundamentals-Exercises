package com.fundamenals;

import java.util.*;

public class WordSynonyms {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int countsOfRead = Integer.parseInt(console.nextLine());
		Map<String, List<String>> mapOfSynonyms = new LinkedHashMap<>();

		for (int i = 1; i <= countsOfRead; i++) {
			String word = console.nextLine();
			String synonym = console.nextLine();
			mapOfSynonyms.putIfAbsent(word, new ArrayList<>());
			mapOfSynonyms.get(word).add(synonym);

		}
		for (Map.Entry<String, List<String>> currentElement : mapOfSynonyms.entrySet()) {

			System.out.printf("%s - ", currentElement.getKey());
			ArrayList<String> ss = (ArrayList<String>) currentElement.getValue();
			System.out.println(ss.toString().replace("[","").replace("]", ""));

		}
	}
}
