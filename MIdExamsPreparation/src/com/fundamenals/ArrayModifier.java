package com.fundamenals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		List<Integer> listOfNumbers = Arrays.stream(console.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
		String command = console.nextLine();
		while (!command.equals("end")) {
			String[] arrayOfCommands = command.split("\\s+");

			switch (arrayOfCommands[0]) {
				case "swap":
					int firstElementIndex = Integer.parseInt(arrayOfCommands[1]);
					int secondElementIndex = Integer.parseInt(arrayOfCommands[2]);
					int firstElement = listOfNumbers.get(firstElementIndex);
					int secondElement = listOfNumbers.get(secondElementIndex);
					listOfNumbers.set(firstElementIndex, secondElement);
					listOfNumbers.set(secondElementIndex, firstElement);
					break;
				case "multiply":
					firstElementIndex = Integer.parseInt(arrayOfCommands[1]);
					secondElementIndex = Integer.parseInt(arrayOfCommands[2]);
					firstElement = listOfNumbers.get(firstElementIndex);
					secondElement = listOfNumbers.get(secondElementIndex);
					int result = firstElement * secondElement;
					listOfNumbers.set(firstElementIndex, result);
					break;
				case "decrease":
					for (int i = 0; i < listOfNumbers.size(); i++) {
						int number = listOfNumbers.get(i);
						number = number - 1;
						listOfNumbers.set(i, number);

					}
					break;
			}
			command = console.nextLine();
		}
		System.out.println(listOfNumbers.toString().replaceAll("[\\[\\]]", ""));
	}


}
