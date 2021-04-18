package Exam4;

import java.util.*;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class PlantDiscovery {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int n = Integer.parseInt(console.nextLine());
		Map<String, Integer> plantsAndRarity = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String[] input = console.nextLine().split("<->");
			String plant = input[0];
			int rarity = Integer.parseInt(input[1]);
			plantsAndRarity.put(plant, rarity);
		}
		Map<String, List<Integer>> ratings = new HashMap<>();
		String input = console.nextLine();
		while (!input.equals("Exhibition")) {
			String[] inputData = input.split("[:\\-]");
			List<String> newData = new ArrayList<>();
			for (String inputDatum : inputData) {
				String newString = inputDatum.trim();
				newData.add(newString);
			}
			String command = newData.get(0);

			switch (command) {
				case "Rate":
					String plant = newData.get(1);
					int rating = Integer.parseInt(newData.get(2));
					if (!ratings.containsKey(plant)) {
						ratings.put(plant, new ArrayList<>());
					}
					ratings.get(plant).add(rating);
					break;
				case "Update":
					plant = newData.get(1);
					int newRarity = Integer.parseInt(newData.get(2));
					plantsAndRarity.put(plant, newRarity);
					break;
				case "Reset":
					plant = newData.get(1);
					ratings.get(plant).clear();
					break;
				default:
					System.out.println("error");
			}

			input = console.nextLine();
		}
		Map<String, Double> plantsAndAverageRating = new HashMap<>();
		for (Map.Entry<String, List<Integer>> stringListEntry : ratings.entrySet()) {
			double average = stringListEntry.getValue().stream().mapToDouble(Integer::doubleValue).average().orElse(0);
			plantsAndAverageRating.put(stringListEntry.getKey(), average);
		}
		System.out.println("Plants for the exhibition:");

		LinkedHashMap<String, Integer> collectRarity = plantsAndRarity.entrySet()
				.stream()
				.sorted(Collections.reverseOrder(comparingByValue()))
				.collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
						LinkedHashMap::new));

		LinkedHashMap<String, Double> collectAverage = plantsAndAverageRating.entrySet()
				.stream()
				.sorted(Collections.reverseOrder(comparingByValue()))
				.collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
						LinkedHashMap::new));

		collectRarity.forEach((key, value) -> System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", key, value, collectAverage.get(key)));

	}
}
