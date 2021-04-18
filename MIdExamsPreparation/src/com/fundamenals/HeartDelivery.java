package com.fundamenals;

import java.util.*;

public class HeartDelivery {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int[] input = Arrays.stream(console.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();

		String command = console.nextLine();
		int index = 0;

		while (!command.equals("Love!")) {
			String[] arrayOfCommands = command.split("\\s+");
			int jumpLength = Integer.parseInt(arrayOfCommands[1]);
			if (jumpLength + index >= input.length) {
				index = 0;
				jumpLength = 0;
			}
			if (input[index + jumpLength] == 0) {
				System.out.printf("Place %d already had Valentine's day.%n", index + jumpLength);
			} else {

				input[jumpLength + index] -= 2;
				if (input[jumpLength + index] == 0) {
					System.out.printf("Place %d has Valentine's day.%n", index + jumpLength);
				}
			}

			index += jumpLength;

			for (int i : input) {
				if(i < 0){
					i = 0;
				}
			}
			command = console.nextLine();
		}

		System.out.printf("Cupid's last position was %d.%n", index);

		if (allHeartsAreGiven(input)) {
			System.out.println("Mission was successful.");
		} else {
			int places = findPlaces(input);
			System.out.printf("Cupid has failed %d places.", places);
		}
	}

	private static boolean allHeartsAreGiven(int[] input) {
		int sum = 0;
		for (int i : input) {
			sum = sum + i;
		}
		return sum == 0;
	}

	private static int findPlaces(int[] input) {
		int places = 0;
		for (int i : input) {
			if (i > 0) {
				places++;
			}
		}
		return places;
	}

}
