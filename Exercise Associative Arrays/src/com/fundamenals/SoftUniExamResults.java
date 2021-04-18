package com.fundamenals;

import java.util.*;

public class SoftUniExamResults {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//username -> points
		Map<String, Integer> userPoints = new HashMap<>();
		// language -> count
		Map<String, Integer> languageCount = new HashMap<>();
		String input = scanner.nextLine();

		while (!input.equals("exam finished")) {
			String[] splitArray = input.split("-");
			//1. "{username}-{language}-{points}" -> ["{username}", "{language}", "{points}"]
			//2. "{username}-banned" -> ["{username}", "banned"]
			String username = splitArray[0];
			if (splitArray.length == 3) {
				String language = splitArray[1];
				int points = Integer.parseInt(splitArray[2]);
				//добавяме username и точки
				if (!userPoints.containsKey(username)) {
					userPoints.put(username, points);
				} else {
					int currentPoints = userPoints.get(username);
					if (points > currentPoints) {
						userPoints.put(username, points);
					}
				}

				//добавяме брой срещания на езика
				if (!languageCount.containsKey(language)) {
					languageCount.put(language, 1);
				} else {
					languageCount.put(language, languageCount.get(language) + 1);
				}

			} else {
				userPoints.remove(username);
			}
			input = scanner.nextLine();
		}

		System.out.println("Results:");
		userPoints.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
						.thenComparing(Map.Entry.comparingByKey()))
				.forEach(e -> System.out.println(e.getKey() + " | " + e.getValue()));

		System.out.println("Submissions:");
		languageCount.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
						.thenComparing(Map.Entry.comparingByKey()))
				.forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));


	}
}