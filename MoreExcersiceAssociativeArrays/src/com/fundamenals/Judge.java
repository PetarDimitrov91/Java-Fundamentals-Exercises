package com.fundamenals;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Judge {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Map<String, LinkedHashMap<String, Integer>> contestsData = new LinkedHashMap<>();
		Map<String, Integer> usersRankingData = new LinkedHashMap<>();
		String input = console.nextLine();
		while (!input.equals("no more time")) {
			String[] inputData = input.split(" -> ");
			String contest = inputData[1];
			String participantName = inputData[0];
			int points = Integer.parseInt(inputData[2]);
			storeData(contest, participantName, points, contestsData, usersRankingData);
			input = console.nextLine();
		}
		AtomicInteger num = new AtomicInteger();
		contestsData.forEach((key, value) -> {
			System.out.printf("%s: %d participants%n", key, value.size());
			num.set(1);
			Map<String, Integer> students = new HashMap<>();
			students = value;
			students.entrySet().stream()
					.sorted((e1, e2) -> {
						if (e2.getKey().equals(e1.getKey())) {
							return e1.getKey().compareTo(e2.getKey());
						} else {
							return e2.getValue() - e1.getValue();
						}
					})
					.forEach((s) -> {
						System.out.printf("%d. %s <::> %d%n", num.getAndIncrement(), s.getKey(), s.getValue());
					});
		});
		num.set(1);
		System.out.println("Individual standings:");
		usersRankingData.entrySet()
				.stream()
				.sorted((e1, e2) -> {
					int res = e2.getValue().compareTo(e1.getValue());
					if(res == 0){
						res = e1.getKey().compareTo(e2.getKey());
					}
					return res;
				})
				.forEach(f -> System.out.printf("%d. %s -> %d%n",num.getAndIncrement(),f.getKey(),f.getValue()));
	}

	private static void storeData(String contest, String participantName, int points, Map<String, LinkedHashMap<String, Integer>> contestsData, Map<String, Integer> usersRankingData) {
		if (!contestsData.containsKey(contest)) {
			contestsData.put(contest, new LinkedHashMap<>());
			contestsData.get(contest).put(participantName, 0);
			int currentPoints = contestsData.get(contest).get(participantName);
			if (currentPoints < points) {
				contestsData.get(contest).put(participantName, points);
				if (!usersRankingData.containsKey(participantName)) {
					usersRankingData.put(participantName, points);
				} else {
					int currentTotalPoints = usersRankingData.get(participantName);
					usersRankingData.put(participantName, currentTotalPoints + points);
				}
			}
		} else {
			if (contestsData.get(contest).containsKey(participantName)) {
				int currentPoints = contestsData.get(contest).get(participantName);
				if (currentPoints < points) {
					contestsData.get(contest).put(participantName, points);
					usersRankingData.put(participantName, points);
				}
			} else {
				contestsData.get(contest).put(participantName, points);
				if (!usersRankingData.containsKey(participantName)) {
					usersRankingData.put(participantName, points);
				} else {
					int currentTotalPoints = usersRankingData.get(participantName);
					usersRankingData.put(participantName, points + currentTotalPoints);
				}
			}
		}
	}
}
