package com.fundamenals;

import java.util.*;

public class Numbers {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int[] numbersSequence = Arrays.stream(console.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		List<Integer> topNumbers = new ArrayList<>();
		if (numbersSequence.length == 1) {
			System.out.println("No");
			return;
		}
		int sumAllNumbers = 0;
		for (int number : numbersSequence) {
			sumAllNumbers += number;
		}
		if (sumAllNumbers == 0) {
			System.out.println("No");
			return;
		}
		int counter = 1;
		for (int i = 0; i < numbersSequence.length-1; i++) {

			if (numbersSequence[i ] == numbersSequence[i + 1]) {
				counter++;
			}
		}
		if (counter == numbersSequence.length) {
			System.out.println("No");
			return;
		}

		double averageValueOfTheNumbers = (double) sumAllNumbers / numbersSequence.length;
		for (int j : numbersSequence) {
			if (j > averageValueOfTheNumbers) {
				topNumbers.add(j);
			}
		}
		topNumbers.sort(Collections.reverseOrder());
		if (topNumbers.size() >= 5) {
			for (int i = 0; i < 5; i++) {
				System.out.print(topNumbers.get(i) + " ");
			}
		} else {
			for (Integer topNumber : topNumbers) {
				System.out.print(topNumber + " ");
			}
		}
	}
}
