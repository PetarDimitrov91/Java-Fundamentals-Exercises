package com.fundamenals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		List<String> shoppingList = Arrays.stream(console.nextLine().split("!")).collect(Collectors.toList());
		String input = console.nextLine();
		while (!input.equals("Go Shopping!")) {
			String[] command = input.split("\\s+");
			switch (command[0]) {
				case "Urgent":
					String item = command[1];
					if (isExist(shoppingList, item)) {
						break;
					}
					shoppingList.add(0, item);
					break;
				case "Unnecessary":
					item = command[1];
					if (!isExist(shoppingList, item)) {
						break;
					}
					shoppingList.remove(item);
					break;
				case "Correct":
					String oldItem = command[1];
					String newItem = command[2];
					if (isExist(shoppingList, oldItem)) {
						shoppingList.set((Integer) index(shoppingList, oldItem), newItem);
					}
					break;
				case "Rearrange":
					item = command[1];
					if (isExist(shoppingList, item)) {
						shoppingList.remove(item);
						shoppingList.add(item);
					}
					break;
			}
			input = console.nextLine();
		}
		System.out.println(shoppingList.toString().replaceAll("[\\[\\]]", ""));

	}

	private static Object index(List<String> shoppingList, String oldItem) {
		int index = 0;
		for (String s : shoppingList) {
			if (s.equals(oldItem)) {
				return index;
			}
			index++;
		}
		return false;
	}

	private static boolean isExist(List<String> shoppingList, String item) {
		for (String s : shoppingList) {
			if (s.equals(item)) {
				return true;
			}
		}
		return false;
	}

}
