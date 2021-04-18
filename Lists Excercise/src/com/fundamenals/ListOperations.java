package com.fundamenals;

import java.util.*;
import java.util.stream.Collectors;

public class ListOperations {

	// see method Collections.rotate in the Web

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		List<Integer> numbers = Arrays.stream(console.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
		String command = console.nextLine();
		while (!command.equals("End")) {
			String[] arrayOfCommands = command.split("\\s+");
			switch (arrayOfCommands[0]) {
				case "Add":
					int numberToAdd = Integer.parseInt(arrayOfCommands[1]);
					numbers.add(numberToAdd);
					break;
				case "Insert":
					int index = Integer.parseInt(arrayOfCommands[2]);
					if (index >= numbers.size()) {
						System.out.println("Invalid index");
					} else {
						int number = Integer.parseInt(arrayOfCommands[1]);
						numbers.add(index, number);
					}
					break;
				case "Remove":
					int indexTorRemove = Integer.parseInt(arrayOfCommands[1]);
					if (indexTorRemove >= numbers.size()) {
						System.out.println("Invalid index");
					} else {
						numbers.remove(indexTorRemove);
					}
					break;
				case "Shift":
					switch (arrayOfCommands[1]) {
						case "left":
							int count = Integer.parseInt(arrayOfCommands[2]);
							for (int i = 0; i < count; i++) {
								Collections.rotate(numbers, numbers.size() - 1);
							}
							break;
						case "right":
							count = Integer.parseInt(arrayOfCommands[2]);
							for (int i = 0; i < count; i++) {
								Collections.rotate(numbers, 1);
							}
							break;
					}
			}
			command = console.nextLine();
		}
		System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
	}

}
