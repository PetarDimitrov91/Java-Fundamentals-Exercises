
package com.fundamenals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		List<String> numberSequence = Arrays.stream(console.nextLine().split("\\s+"))
				.collect(Collectors.toList());
		int movesCount = 0;
		String command = console.nextLine();
		while (!command.equals("end")) {
			movesCount++;
			int firstIndex = Integer.parseInt(command.split("\\s+")[0]);
			int secondIndex = Integer.parseInt(command.split("\\s+")[1]);
			if (firstIndex == secondIndex || firstIndex < 0 || firstIndex >= numberSequence.size() ||
					secondIndex < 0 || secondIndex >= numberSequence.size()) {
				String elementToAdd = "-" + movesCount + "a";
				numberSequence.add(numberSequence.size() / 2, elementToAdd);
				numberSequence.add(numberSequence.size() / 2, elementToAdd);
				System.out.println("Invalid input! Adding additional elements to the board");
				command = console.nextLine();
				continue;
			}

			if (numberSequence.get(firstIndex).equals(numberSequence.get(secondIndex)) || numberSequence.get(secondIndex)
					.equals(numberSequence.get(firstIndex))) {
				String matchingElement = numberSequence.get(firstIndex);
				if (firstIndex > secondIndex) {
					numberSequence.remove(firstIndex);
					numberSequence.remove(secondIndex);
				} else {
					numberSequence.remove(secondIndex);
					numberSequence.remove(firstIndex);
				}
				System.out.printf("Congrats! You have found matching elements - %s!%n", matchingElement);
			} else {
				System.out.println("Try again!");
			}
			if (numberSequence.size() == 0) {
				System.out.printf("You have won in %d turns!", movesCount);
				return;
			}
			command = console.nextLine();
		}
		if (numberSequence.size() > 0) {
			System.out.printf("Sorry you lose :(%n");
			for (String s : numberSequence) {
				System.out.print(s + " ");
			}

		}
	}
}
