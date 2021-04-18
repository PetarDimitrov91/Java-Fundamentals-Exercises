package com.fundamenals;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		String regexName = "[A-Za-z]+";
		String regexDistance = "[0-9]";
		Pattern patternName = Pattern.compile(regexName);
		Pattern patternDistance = Pattern.compile(regexDistance);

		List<String> racers = Arrays.stream(console.nextLine().split(", ")).collect(Collectors.toList());

		Map<String, Integer> racersDistances = new LinkedHashMap<>();
		racers.forEach(racer -> racersDistances.put(racer, 0));

		String input = console.nextLine();

		while (!input.equals("end of race")) {
			//G4e@55or%6g6!68e!!@
			Matcher matcherName = patternName.matcher(input);
			StringBuilder name = new StringBuilder();
			while (matcherName.find()) {
				name.append(matcherName.group());
			}
			int distance = 0;
			Matcher matcherDistance = patternDistance.matcher(input);
			while (matcherDistance.find()) {
				distance += Integer.parseInt(matcherDistance.group());
			}

			if (racersDistances.containsKey(name.toString())) {
				racersDistances.put(name.toString(), racersDistances.get(name.toString()) + distance);
			}
			input = console.nextLine();
		}
		List<String> firstThree = racersDistances.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.limit(3)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());

		System.out.println("1st place: " + firstThree.get(0));
		System.out.println("2nd place: " + firstThree.get(1));
		System.out.println("3rd place: " + firstThree.get(2));
	}
}
