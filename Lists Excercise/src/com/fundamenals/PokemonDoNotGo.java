package com.fundamenals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDoNotGo {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		List<Integer> listOfDistance = Arrays.stream(console.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
		int size = listOfDistance.size();
		int sumOfRemovedNumbers = 0;
		while (!(listOfDistance.size() == 0)) {
			int index = Integer.parseInt(console.nextLine());
			if (index < 0) {
				int lastNumber = listOfDistance.get(size - 1);
				int removedNumber = listOfDistance.get(0);
				listOfDistance.set(0, lastNumber);
				sumOfRemovedNumbers += removedNumber;
				int count = 0;
				for (Integer integer : listOfDistance) {
					boolean isIncreased = false;
					if (integer <= removedNumber) {
						listOfDistance.set(count, integer += removedNumber);
						isIncreased = true;
					}
					if (integer > removedNumber && !isIncreased) {
						listOfDistance.set(count, integer -= removedNumber);
					}
					count++;
				}
			} else if (index >= size  && size - 1 > 0) {
				int firstNumber = listOfDistance.get(0);
				int removedNumber = listOfDistance.get(size - 1);
				listOfDistance.set(size - 1, firstNumber);
				sumOfRemovedNumbers += removedNumber;
				int count = 0;
				for (Integer integer : listOfDistance) {
					boolean isIncreased = false;
					if (integer <= removedNumber) {
						listOfDistance.set(count, integer += removedNumber);
						isIncreased = true;
					}
					if (integer > removedNumber && !isIncreased) {
						listOfDistance.set(count, integer -= removedNumber);
					}
					count++;
				}
			} else {
				int numberToRemove = listOfDistance.get(index);
				listOfDistance.remove((Integer) numberToRemove);
				size--;
				sumOfRemovedNumbers += numberToRemove;
				int count = 0;
				for (Integer integer : listOfDistance) {
					boolean isIncreased = false;
					if (integer <= numberToRemove) {
						listOfDistance.set(count, integer += numberToRemove);
						isIncreased = true;
					}
					if (integer > numberToRemove && !isIncreased) {
						listOfDistance.set(count, integer -= numberToRemove);
					}
					count++;
				}
			}
		}
		System.out.println(sumOfRemovedNumbers);
	}
}