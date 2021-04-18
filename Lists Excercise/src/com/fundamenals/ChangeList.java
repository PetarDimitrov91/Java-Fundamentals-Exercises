package com.fundamenals;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		List<Integer> listOfNumbers = Arrays.stream(console.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
		String command = console.nextLine();

		while (!command.equals("end")) {
			String[] arrayOfCommands = command.split("\\s+");
			switch (arrayOfCommands[0]) {
				case "Delete":
					listOfNumbers.removeAll(Collections.singleton(getElement(arrayOfCommands)));
					break;
				case "Insert":
					listOfNumbers.add(getPosition(arrayOfCommands), getElement(arrayOfCommands));
					break;
			}
			command = console.nextLine();
		}
		System.out.println(listOfNumbers.toString().replaceAll("[\\[\\],]",""));
	}

	private static int getElement(String[] arrayOfCommands) {
		return Integer.parseInt(arrayOfCommands[1]);
	}

	private static int getPosition(String[] arrayOfCommands) {
		return Integer.parseInt(arrayOfCommands[2]);
	}
}
