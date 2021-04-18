package com.fundamenals;

import java.util.*;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

public class Pirates {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Map<String, Integer> destinationsPopulation = new LinkedHashMap<>();
		Map<String, Integer> destinationsGold = new LinkedHashMap<>();
		String destinations = console.nextLine();
		while (!destinations.equals("Sail")) {
			String[] destinationsData = destinations.split("\\|\\|");
			String destination = destinationsData[0];
			int population = Integer.parseInt(destinationsData[1]);
			int gold = Integer.parseInt(destinationsData[2]);
			if (!destinationsPopulation.containsKey(destination)) {
				destinationsPopulation.put(destination, population);
				destinationsGold.put(destination, gold);
			} else {
				destinationsPopulation.put(destination, destinationsPopulation.get(destination) + population);
				destinationsGold.put(destination, destinationsGold.get(destination) + gold);
			}
			destinations = console.nextLine();
		}

		String command = console.nextLine();
		while (!command.equals("End")) {
			String[] commandData = command.split("=>");
			String event = commandData[0];
			String destination = commandData[1];
			switch (event) {
				case "Plunder":
					int populationKilled = Integer.parseInt(commandData[2]);
					int stolenGold = Integer.parseInt(commandData[3]);
					destinationsPopulation.put(destination, destinationsPopulation.get(destination) - populationKilled);
					destinationsGold.put(destination, destinationsGold.get(destination) - stolenGold);
					System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", destination, stolenGold, populationKilled);
					if (destinationsPopulation.get(destination) <= 0 || destinationsGold.get(destination) <= 0) {
						System.out.println(destination + " has been wiped off the map!");
						destinationsPopulation.remove(destination);
						destinationsGold.remove(destination);
					}
					break;
				case "Prosper":
					int goldToAdd = Integer.parseInt(commandData[2]);
					if (goldToAdd >= 0) {
						destinationsGold.put(destination, destinationsGold.get(destination) + goldToAdd);
						System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", goldToAdd, destination, destinationsGold.get(destination));
					} else {
						System.out.println("Gold added cannot be a negative number!");
					}
					break;
			}
			command = console.nextLine();
		}
		if (destinationsPopulation.isEmpty() && destinationsGold.isEmpty()) {
			System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
		} else {
			int destinationsCount = 0;

			for (Map.Entry<String, Integer> stringIntegerEntry : destinationsPopulation.entrySet()) {
				destinationsCount++;
			}
			System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", destinationsCount);

			destinationsGold.entrySet()
					.stream()
					.sorted((e1, e2) -> {
						int res = e2.getValue().compareTo(e1.getValue());
						if (res == 0) {
							res = e1.getKey().compareTo(e2.getKey());
						}
						return res;
					})
					.forEach(e -> System.out.println(e.getKey() + " -> Population: " + destinationsPopulation.get(e.getKey()) + " citizens, Gold: " + e.getValue() + " kg"));


		}


	}
}
