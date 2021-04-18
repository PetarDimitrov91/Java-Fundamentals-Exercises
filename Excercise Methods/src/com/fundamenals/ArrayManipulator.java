package com.fundamenals;
import java.util.*;

public class ArrayManipulator {
	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		int[] array = Arrays.stream(console.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		String command = console.nextLine();

		while (!command.equals("end")) {
			String[] commandInArray;
			commandInArray = command.split(" ");
			switch (commandInArray[0]) {
				case "exchange":
					int splitIndex = Integer.parseInt(commandInArray[1]);
					if (splitIndex > array.length - 1 || splitIndex < 0) {
						System.out.println("Invalid index");
						break;
					}
					exchange(array, splitIndex);
					break;
				case "max":
					switch (commandInArray[1]) {
						case "even":
							printIndexMaxEven(array);
							break;
						case "odd":
							printIndexMaxOdd(array);
							break;
					}
					break;
				case "min":
					switch (commandInArray[1]) {
						case "even":
							printIndexMinEven(array);
							break;
						case "odd":
							printIndexMinOdd(array);
					}
					break;
				case "first":
					int count = Integer.parseInt(commandInArray[1]);
					if (count > array.length) {
						System.out.println("Invalid count");
						break;
					}
					switch (commandInArray[2]) {
						case "even":
							printFirstCountEven(array, count);
							break;
						case "odd":
							printFirstCountOdd(array, count);
							break;
					}
					break;
				case "last":
					count = Integer.parseInt(commandInArray[1]);
					if (count > array.length) {
						System.out.println("Invalid count");
						break;
					}
					switch (commandInArray[2]) {
						case "even":
							printLastCountEven(array, count);
							break;
						case "odd":
							printLastCountOdd(array, count);
							break;
					}
					break;
			}
			command = console.nextLine();
		}
		System.out.println(Arrays.toString(array));
	}

	private static void exchange(int[] array, int splitIndex) {
		List<Integer> arrayList = new ArrayList<>();
		for (int number : array) {
			arrayList.add(number);
		}
		for (int i = 0; i <= splitIndex; i++) {
			int number = arrayList.get(0);
			arrayList.add(arrayList.size(), number);
			arrayList.remove(0);
		}
		for (int i = 0; i < arrayList.size(); i++) {
			array[i] = arrayList.get(i);
		}
	}

	private static void printIndexMaxEven(int[] array) {
		int maxEven = Integer.MIN_VALUE;
		int index = 0;
		boolean isFound = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				if (array[i] >= maxEven) {
					maxEven = array[i];
					index = i;
					isFound = true;
				}
			}
		}
		if (!isFound) {
			System.out.println("No matches");
		} else {
			System.out.println(index);
		}
	}

	private static void printIndexMaxOdd(int[] array) {
		int maxOdd = Integer.MIN_VALUE;
		int index = 0;
		boolean isFound = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				if (array[i] >= maxOdd) {
					maxOdd = array[i];
					index = i;
					isFound = true;
				}
			}
		}
		if (!isFound) {
			System.out.println("No matches");
		} else {
			System.out.println(index);
		}
	}

	private static void printIndexMinEven(int[] array) {
		int minEven = Integer.MAX_VALUE;
		int index = 0;
		boolean isFound = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				if (array[i] <= minEven) {
					minEven = array[i];
					index = i;
					isFound = true;
				}
			}
		}
		if (!isFound) {
			System.out.println("No matches");
		} else {
			System.out.println(index);
		}
	}

	private static void printIndexMinOdd(int[] array) {
		int minOdd = Integer.MAX_VALUE;
		int index = 0;
		boolean isFound = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				if (array[i] <= minOdd) {
					minOdd = array[i];
					index = i;
					isFound = true;
				}
			}
		}
		if (!isFound) {
			System.out.println("No matches");
		} else {
			System.out.println(index);
		}
	}

	private static void printFirstCountEven(int[] array, int count) {
		int counter = 0;
		List<Integer> listOfTheFirstEvenNumbers = new ArrayList<>();
		for (int number : array) {
			if (number % 2 == 0) {
				listOfTheFirstEvenNumbers.add(number);
				counter++;
				if (counter == count) {
					break;
				}
			}
		}
		System.out.println(listOfTheFirstEvenNumbers.toString());
	}

	private static void printFirstCountOdd(int[] array, int count) {
		int counter = 0;
		List<Integer> listOfTheFirstOddNumbers = new ArrayList<>();
		for (int number : array) {
			if (number % 2 == 1) {
				listOfTheFirstOddNumbers.add(number);
				counter++;
				if (counter == count) {
					break;
				}
			}
		}
		System.out.println(listOfTheFirstOddNumbers.toString());
	}

	private static void printLastCountEven(int[] array, int count) {
		int counter = 0;
		List<Integer> listOfTheLastEvenNumbers = new ArrayList<>();
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] % 2 == 0) {
				listOfTheLastEvenNumbers.add(array[i]);
				counter++;
				if (counter == count) {
					break;
				}
			}
		}
		Collections.reverse(listOfTheLastEvenNumbers);
		System.out.println(listOfTheLastEvenNumbers.toString());
	}

	private static void printLastCountOdd(int[] array, int count) {
		int counter = 0;
		List<Integer> listOfTheLastOddNumbers = new ArrayList<>();
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] % 2 == 1) {
				listOfTheLastOddNumbers.add(array[i]);
				counter++;
				if (counter == count) {
					break;
				}
			}
		}
		Collections.reverse(listOfTheLastOddNumbers);
		System.out.println(listOfTheLastOddNumbers.toString());
	}


}
