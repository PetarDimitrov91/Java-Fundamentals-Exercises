package com.fundamenals;

import java.util.Scanner;

public class MuOnline {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int health = 100;
		int bitcoins = 0;
		int room = 0;

		String[] rooms = console.nextLine().split("\\|");

		for (int i = 0; i < rooms.length; i++) {
			room++;
			String[] roomDate = rooms[i].split("\\s+");
			String action = roomDate[0];
			int actionValue = Integer.parseInt(roomDate[1]);
			switch (action) {
				case "potion":
					int healedDiference = 100 - health;
					health += actionValue;
					if (health > 100) {
						health = 100;
						System.out.printf("You healed for %d hp.%n", healedDiference);
						System.out.printf("Current health: %d hp.%n", health);
					} else {
						System.out.printf("You healed for %d hp.%n", actionValue);
						System.out.printf("Current health: %d hp.%n", health);
					}
					break;
				case "chest":
					bitcoins += actionValue;
					System.out.printf("You found %d bitcoins.%n", actionValue);
					break;
				default:
					health -= actionValue;
					if (health <= 0) {
						System.out.printf("You died! Killed by %s.%n", action);
						System.out.printf("Best room: %d%n", room);
						return;
					} else {
						System.out.printf("You slayed %s.%n", action);
					}
					break;
			}
		}
		System.out.printf("You've made it!%nBitcoins: %d%nHealth: %d", bitcoins, health);
	}
}
