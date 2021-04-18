package com.fundamenals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		List<Integer> numbers = Arrays.stream(console.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
		int[] bombNumberWithPower = Arrays.stream(console.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		int bombNumber = bombNumberWithPower[0];
		int powerNumber = bombNumberWithPower[1];
		int bombNumbersCount = 0;

		for (Integer integer : numbers) {
			if (integer == bombNumber) {
				bombNumbersCount++;
			}
		}
		for (int i = 0; i <bombNumbersCount ; i++) {
			if (numbers.contains(bombNumber)) {
				int indexOfBombedNumber = numbers.indexOf(bombNumber);
				int count = 0;
				while (true) {
					if (indexOfBombedNumber - 1 <= numbers.size() - 1){
						numbers.remove(indexOfBombedNumber - 1);
						indexOfBombedNumber--;
						count++;
					}
					if (count == powerNumber) {
						break;
					}
				}
				count = 0;
				while (true) {
					if(indexOfBombedNumber + 1 <= numbers.size()-1) {
						numbers.remove(indexOfBombedNumber + 1);
						count++;
					}else {
						break;
					}
					if (count == powerNumber) {
						break;
					}
				}
				numbers.remove((Integer) bombNumber);
			}
		}

		int sum = 0;
		for (
				int number : numbers) {
			sum += number;
		}
		System.out.println(sum);
	}
}
