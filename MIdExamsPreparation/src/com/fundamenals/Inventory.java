package com.fundamenals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		List<String> items = Arrays.stream(console.nextLine().split("\\s*,\\s+")).collect(Collectors.toList());
		String command = console.nextLine();
		while (!command.equals("Craft!")) {
			String[] arrayOfCommands = command.split("\\s-\\s*");

			switch (arrayOfCommands[0]) {
				case "Collect":
					String item = arrayOfCommands[1];
					if (itemExist(item, items)) {
						break;
					} else {
						items.add(item);
					}
					break;
				case "Drop":
					item = arrayOfCommands[1];
					if (itemExist(item, items)) {
						items.remove(item);
					} else {
						break;
					}
					break;
				case "Combine Items":
					String secondCommand = arrayOfCommands[1];
					StringBuilder old = new StringBuilder();
					for (int i = 0; i < secondCommand.length(); i++) {
						char currentSymbol = secondCommand.charAt(i);
						if (currentSymbol == ':') {
							break;
						} else {
							old.append(currentSymbol);
						}
					}
					String oldItem = old.toString();

					StringBuilder newI = new StringBuilder();
					for (int i = secondCommand.length() - 1; i >= 0; i--) {
						char currentSymbol = secondCommand.charAt(i);
						if (currentSymbol == ':') {
							break;
						}
						newI.append(currentSymbol);
					}
					newI.reverse();
					String newItem = newI.toString();


					if (itemExist(oldItem, items)) {
						int index = 0;
						for (int i = 0; i < items.size(); i++) {
							if (items.get(i).equals(oldItem)) {
								index = i;
							}
						}
						items.add(index + 1, newItem);
					} else {
						break;
					}
					break;
				case "Renew":
					item = arrayOfCommands[1];
					if (itemExist(item, items)) {
						items.remove(item);
						items.add(item);
					} else {
						break;
					}
					break;
			}
			command = console.nextLine();
		}
		System.out.println(items.toString().replaceAll("[\\[\\]]", ""));
	}

	private static boolean itemExist(String item, List<String> items) {
		for (String s : items) {
			if (s.equals(item)) {
				return true;
			}
		}
		return false;
	}

	private static int index(String item, List<String> items) {
		int index = 0;
		boolean exist = false;
		for (int i = 0; i < items.size(); i++) {
			if (itemExist(item, items)) {
				index = i;
			}
		}
		return index;
	}
}
