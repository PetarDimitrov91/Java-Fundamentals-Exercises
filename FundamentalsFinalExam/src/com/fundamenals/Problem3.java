package com.fundamenals;

import java.util.*;

import static java.util.Comparator.comparingInt;
import static java.util.Map.Entry.comparingByValue;

public class Problem3 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		Map<String, List<String>> likedMeals = new TreeMap<>();
		int unlikedMeals = 0;
		String input = console.nextLine();

		while (!input.equals("Stop")) {
			String[] inputData = input.split("-");
			String command = inputData[0];
			String guest = inputData[1];
			String meal = inputData[2];
			switch (command) {
				case "Like":
					if (!likedMeals.containsKey(guest)) {
						likedMeals.put(guest, new ArrayList<>());
						likedMeals.get(guest).add(meal);
					} else {
						if (!likedMeals.get(guest).contains(meal)) {
							likedMeals.get(guest).add(meal);
						}
					}
					break;
				case "Unlike":
					if (likedMeals.containsKey(guest)) {
						if (likedMeals.get(guest).contains(meal)) {
							likedMeals.get(guest).remove(meal);
							unlikedMeals++;
							System.out.printf("%s doesn't like the %s.%n", guest, meal);
						} else {
							System.out.printf("%s doesn't have the %s in his/her collection.%n", guest, meal);
						}
					} else {
						System.out.printf("%s is not at the party.%n", guest);
					}
					break;
			}
			input = console.nextLine();
		}

		likedMeals
				.entrySet()
				.stream()
				.sorted(Collections.reverseOrder(comparingInt(e -> e.getValue().size())))
				.forEach(e -> System.out.printf("%s: %s%n", e.getKey(), String.join(", ", e.getValue())));

		System.out.println("Unliked meals: " + unlikedMeals);
	}

	public void freadName(){

	}
	public static String sreadName(){
		return null;
	}

	public String read(){
		return null;
	}
	public void sds (){

	}
}
