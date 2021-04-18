package com.fundamenals;

import java.util.Scanner;

public class CounterStrike {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int energy = Integer.parseInt(console.nextLine());
		String command = console.nextLine();
		int battlesCount = 0;
		boolean hasFail = false;

		while (!command.equals("End of battle")) {
			int distance = Integer.parseInt(command);

			if (energy < distance) {
				hasFail = true;
				break;

			} else {
				energy -= distance;
				battlesCount++;

				if (battlesCount % 3 == 0 && battlesCount != 0) {
					energy += battlesCount;
				}
			}
			command = console.nextLine();
		}
		if (!hasFail) {
			System.out.printf("Won battles: %d. Energy left: %d", battlesCount, energy);
		} else {
			System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", battlesCount, energy);
		}
	}
}
