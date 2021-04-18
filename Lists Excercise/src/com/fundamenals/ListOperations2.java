package com.fundamenals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations2 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		List<Integer> numbers = Arrays.stream(console.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
		String input = console.nextLine();
		while (!input.equals("End")) {
			String[] tokens = input.split("\\s+");
			String command = tokens[0];
			switch (command){
				case "Add":
					int numberToAdd = Integer.parseInt(tokens[1]);
					numbers.add(numberToAdd);
					break;
				case "Insert":
					int addNumber = Integer.parseInt(tokens[1]);
					int index = Integer.parseInt(tokens[2]);
					if(isValidIndex(index,numbers.size())) {
						numbers.add(index, addNumber);
					}else{
						System.out.println("Invalid index");
					}
					break;
				case "Remove":
					int indexRemove = Integer.parseInt(tokens[1]);
					if(isValidIndex(indexRemove,numbers.size())){
						numbers.remove(indexRemove);
					}else{
						System.out.println("Invalid index");
					}
					break;
				case "Shift":
					String direction = tokens[1];
					int count = Integer.parseInt(tokens[2]);
					if (direction.equals("right")){
						for (int i = 1; i <= count ; i++) {
							int lastNumber = numbers.get(numbers.size()-1);
							numbers.remove(numbers.size()-1);
							numbers.add(0,lastNumber);
						}
					}else if (direction.equals("left")){
						for (int i = 1; i <= count ; i++) {
							int firstNumber = numbers.get(0);
							numbers.remove(0);
							numbers.add(firstNumber);
						}
					}
					break;
			}

			input = console.nextLine();
		}
		printList(numbers);
	}


	private static boolean isValidIndex(int index,int length) {
		return index >= 0 && index <= length - 1;
	}

	private static void printList(List<Integer> numbers) {
		for (Integer number : numbers) {
			System.out.print(number + " ");
		}
	}
}
