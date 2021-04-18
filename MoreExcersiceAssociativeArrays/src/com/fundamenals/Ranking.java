package com.fundamenals;

import java.util.*;
import java.util.stream.Collectors;

public class Ranking {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		Map<String, String> contestAndPassword = new LinkedHashMap<>();
		Map<String, Map<String, Integer>> personNameAndContestResults = new LinkedHashMap<>();
		Map<String, Integer> candidateAndTotalPoints = new HashMap<>();

		String input = console.nextLine();
		while (!input.equals("end of contests")) {
			String contest = input.split(":")[0];
			String contestPassword = input.split(":")[1];
			contestAndPassword.put(contest, contestPassword);
			input = console.nextLine();
		}
		input = console.nextLine();
		while (!input.equals("end of submissions")) {
			String contestName = input.split("=>")[0];
			String password = input.split("=>")[1];
			String personName = input.split("=>")[2];
			int points = Integer.parseInt(input.split("=>")[3]);
			takeAndProcessTheData(candidateAndTotalPoints, contestAndPassword, personNameAndContestResults, contestName, password, personName, points);
			input = console.nextLine();
		}
		findTheBestCandidateAndPrintIt(candidateAndTotalPoints);
		System.out.println("Ranking:");
		printRanking(personNameAndContestResults);
	}

	private static void takeAndProcessTheData(Map<String, Integer> candidateAndTotalPoints, Map<String, String> contestAndPassword, Map<String, Map<String, Integer>> personNameAndContestResults, String contestName, String password, String personName, int points) {
		if (contestAndPassword.containsKey(contestName) && contestAndPassword.get(contestName).equals(password)) {
			if (!personNameAndContestResults.containsKey(personName)) {
				personNameAndContestResults.put(personName, new LinkedHashMap<>());
				personNameAndContestResults.get(personName).put(contestName, 0);
				candidateAndTotalPoints.put(personName, 0);
				if (personNameAndContestResults.get(personName).get(contestName) < points) {
					personNameAndContestResults.get(personName).put(contestName, points);
					int currentTotalPoints = candidateAndTotalPoints.get(personName);
					candidateAndTotalPoints.put(personName, currentTotalPoints + points);
				}
			} else {
				if (personNameAndContestResults.get(personName).containsKey(contestName)) {
					if (personNameAndContestResults.get(personName).get(contestName) < points) {
						personNameAndContestResults.get(personName).put(contestName, points);
						int currentTotalPoints = candidateAndTotalPoints.get(personName);
						candidateAndTotalPoints.put(personName, currentTotalPoints + points);
					}
				} else {
					personNameAndContestResults.get(personName).put(contestName, points);
					int currentTotalPoints = candidateAndTotalPoints.get(personName);
					candidateAndTotalPoints.put(personName, currentTotalPoints + points);
				}
			}
		}
	}

	private static void findTheBestCandidateAndPrintIt(Map<String, Integer> candidateAndTotalPoints) {
		String bestCandidate = "";
		int bestCandidatePoints = 0;
		for (Map.Entry<String, Integer> stringIntegerEntry : candidateAndTotalPoints.entrySet()) {
			if (stringIntegerEntry.getValue() > bestCandidatePoints) {
				bestCandidate = stringIntegerEntry.getKey();
				bestCandidatePoints = stringIntegerEntry.getValue();
			}
		}
		System.out.printf("Best candidate is %s with total %d points.%n", bestCandidate, bestCandidatePoints);
	}

	private static void printRanking(Map<String, Map<String, Integer>> personNameAndContestResults) {
		personNameAndContestResults
				.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(
						Map.Entry::getKey,
						e -> e.getValue()
								.entrySet()
								.stream()
								.sorted(Map.Entry.comparingByKey())
								.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new)), (a, b) -> a, LinkedHashMap::new
				))
				.forEach((key, value) -> {
					System.out.println(key);
					value
							.entrySet()
							.stream()
							.sorted((e1, e2) -> {
								int res = e2.getValue().compareTo(e1.getValue());
								if (res == 0) {
									res = e1.getKey().compareTo(e2.getKey());
								}
								return res;
							})
							.forEach(f -> System.out.printf("#  %s -> %d%n", f.getKey(), f.getValue()));

				});
		// or use this sorting:
		//personNameAndContestResults.entrySet()
		//				.stream()
		//				.sorted(Map.Entry.comparingByKey())
		//				.forEach(s -> {
		//					System.out.println(s.getKey());
		//					s.getValue()
		//							.entrySet()
		//							.stream()
		//							.sorted((e1, e2) -> {
		//								int res = e2.getValue().compareTo(e1.getValue());
		//								if (res == 0) {
		//									res = e1.getKey().compareTo(e2.getKey());
		//								}
		//								return res;
		//							})
		//							.forEach(f -> System.out.printf("#  %s -> %d%n", f.getKey(), f.getValue()));
		//				});

	}
}
