package com.fundamenals;

import java.util.*;
import java.util.stream.Collectors;

public class MovingTarget {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		List<Integer> targets = Arrays.stream(console.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
		String command = console.nextLine();
		while (!command.equals("End")) {
			String[] arrayOfCommands = command.split("\\s+");
			int index = Integer.parseInt(arrayOfCommands[1]);
			switch (arrayOfCommands[0]) {
				case "Shoot":
					if (indexExist(index, targets)) {
						int power = Integer.parseInt(arrayOfCommands[2]);
						int targetAfterShooting = targets.get(index) - power;
						if (targetAfterShooting > 0) {
							targets.set(index, targetAfterShooting);
						} else {
							targets.remove(index);
						}
					}
					break;
				case "Add":
					if (indexExist(index, targets)) {
						int value = Integer.parseInt(arrayOfCommands[2]);
						targets.add(index, value);
					} else {
						System.out.println("Invalid placement!");
					}
					break;
				case "Strike":
					int radius = Integer.parseInt(arrayOfCommands[2]);
					if (radiusExist(index, radius, targets)) {
						removeRadius(index, radius, targets);
					} else {
						System.out.println("Strike missed!");
					}
					break;
			}
			command = console.nextLine();
		}
		List<String> stringList = new ArrayList<>();
		for (Integer target : targets) {
			stringList.add(String.valueOf(target));
		}

		String output = String.join("|",  stringList);
		System.out.println(output);
	}


	private static boolean indexExist(int index, List<Integer> targets) {
		return index >= 0 && index < targets.size();
	}

	private static boolean radiusExist(int index, int radius, List<Integer> targets) {
		return index + radius < targets.size() && index - radius >= 0;
	}

	private static void removeRadius(int index, int radius, List<Integer> targets) {
		for (int i = index - radius; i <= index + radius; i++) {
			targets.set(i, -1);
		}
			targets.removeAll(Collections.singleton(-1));
	}

}
