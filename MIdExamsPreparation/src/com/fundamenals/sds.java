package com.fundamenals;

import java.util.Scanner;

public class sds {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int energy = Integer.parseInt(scanner.nextLine());

		String input = scanner.nextLine();
		int battleWin = 0;
		boolean energyIsEnough = false;

		while (!input.equals("End of battle")) {
			int distance = Integer.parseInt(input);

			if (energy < distance) {
				energyIsEnough = true;
				break;

			} else {
				energy -= distance;
				battleWin++;

				if (battleWin % 3 == 0) {
					energy += battleWin;
				}
			}

			input = scanner.nextLine();
		}

		if (energyIsEnough) {
			System.out.println(String.format("Not enough energy! Game ends with %d won battles and %d energy",
					battleWin, energy));
		} else {
			System.out.println(String.format("Won battles: %d. Energy left: %d", battleWin, energy));
		}
	}
}