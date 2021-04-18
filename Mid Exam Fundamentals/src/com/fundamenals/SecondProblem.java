package com.fundamenals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SecondProblem {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		List<Integer> listOfNumbers = Arrays.stream(console.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
		String command = console.nextLine();
		while (!command.equals("Mort")) {
			String[] arrayOfCommands = command.split("\\s+");
			switch (arrayOfCommands[0]) {
				case "Add":
					int value = Integer.parseInt(arrayOfCommands[1]);
					listOfNumbers.add(value);
					break;
				case "Remove":
					int element = Integer.parseInt(arrayOfCommands[1]);
					if (elementExist(element, listOfNumbers)) {
						int indexToRemove = getIndex(element, listOfNumbers);
						listOfNumbers.remove(indexToRemove);
					}
					break;
				case "Replace":
					value = Integer.parseInt(arrayOfCommands[1]);
					int replacement = Integer.parseInt(arrayOfCommands[2]);
					if (elementExist(value, listOfNumbers)) {
						int indexToReplace = getIndex(value, listOfNumbers);
						listOfNumbers.set(indexToReplace, replacement);
					}
					break;
				case "Collapse":
					value = Integer.parseInt(arrayOfCommands[1]);
					removeAllLessElements(value, listOfNumbers);
					break;
			}
			command = console.nextLine();
		}
		printNumbers(listOfNumbers);
	}

	private static boolean elementExist(int element, List<Integer> listOfNumbers) {
		for (Integer number : listOfNumbers) {
			if (element == number) {
				return true;
			}
		}
		return false;
	}

	private static int getIndex(int element, List<Integer> listOfNumbers) {
		int index = 0;
		for (int i = 0; i < listOfNumbers.size(); i++) {
			if (listOfNumbers.get(i) == element) {
				index = i;
				break;
			}
		}
		return index;
	}

	private static void removeAllLessElements(int value, List<Integer> listOfNumbers) {
		for (int i = 0; i < listOfNumbers.size(); i++) {
			if (listOfNumbers.get(i) < value) {
				listOfNumbers.remove(i);
				i--;
			}
		}
	}

	private static void printNumbers(List<Integer> listOfNumbers) {
		for (Integer number : listOfNumbers) {
			System.out.print(number + " ");
		}
	}
}
