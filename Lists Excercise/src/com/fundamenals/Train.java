package com.fundamenals;

import java.util.*;
import java.util.stream.Collectors;

public class Train {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		List<Integer> trainWagons = Arrays.stream(console.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
		int wagonCapacity = Integer.parseInt(console.nextLine());
		String command = console.nextLine();

		while (!command.equals("end")) {
			String[] arrayOfCommands = command.split("\\s+");
			if ("Add".equals(arrayOfCommands[0])) {
				int passengersToAdd = Integer.parseInt(arrayOfCommands[1]);
				trainWagons.add(passengersToAdd);
			} else {
				int newPassengers = Integer.parseInt(arrayOfCommands[0]);
				for (int i = 0; i < trainWagons.size(); i++) {
					int currentWagonPassengers = trainWagons.get(i);
					if (currentWagonPassengers + newPassengers <= wagonCapacity ) {
						trainWagons.set(i, currentWagonPassengers + newPassengers);
						break;
					}
				}
			}
		command = console.nextLine();
		}
		for (Integer trainWagon : trainWagons) {
			System.out.print(trainWagon + " ");
		}

	}
}

