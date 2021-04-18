package com.fundamenals;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Judge2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		Map<String, LinkedHashMap<String, Integer>> contest = new LinkedHashMap<>();
		while (!input.equals("no more time")) {
			String[] lines = input.split(" -> ");
			String nameStudent = lines[0];
			String nameContest = lines[1];
			int points = Integer.parseInt(lines[2]);
			if (!contest.containsKey(nameContest)) {
				contest.put(nameContest, new LinkedHashMap<>());
				contest.get(nameContest).put(nameStudent, points);
			} else {
				if (contest.get(nameContest).containsKey(nameStudent)) {
					if (contest.get(nameContest).get(nameStudent) < points) {
						contest.get(nameContest).put(nameStudent, points);
					}
				} else {
					contest.get(nameContest).put(nameStudent, points);
				}
			}
			input = scanner.nextLine();
		}
		AtomicInteger num = new AtomicInteger();
		contest.forEach((key, value) -> {
			System.out.printf("%s: %d participants%n", key, value.size());
			num.set(1);
			Map<String, Integer> students = new HashMap<>();
			students = value;
			students.entrySet().stream()
					.sorted((e1, e2) -> {
						if (e2.getValue().equals(e1.getValue())) {
							return e1.getKey().compareTo(e2.getKey());
						} else {
							return e2.getValue() - e1.getValue();
						}
					})
					.forEach((s) -> {
						System.out.printf("%d. %s <::> %d%n", num.getAndIncrement(), s.getKey(), s.getValue());
					});
		});
		Map<String, Integer> standings = new LinkedHashMap<>();

		for(Map.Entry<String, LinkedHashMap<String, Integer>> entry : contest.entrySet()) {
			for (Map.Entry<String, Integer> qwer : entry.getValue().entrySet()) {
				standings.putIfAbsent(qwer.getKey(), 0);
				standings.put(qwer.getKey(), standings.get(qwer.getKey()) + qwer.getValue());
			}
		}
		System.out.println("Individual standings:");
		num.set(1);
		standings.entrySet().stream().sorted((e2, e1) -> {
			int sort = Integer.compare(e1.getValue(), e2.getValue());
			if (sort == 0) {
				sort = e2.getKey().compareTo(e1.getKey());
			}
			return sort;
		}).forEach(element -> {
			System.out.printf("%d. %s -> %d\n", num.getAndIncrement(), element.getKey(), element.getValue());
		});
	}
}
