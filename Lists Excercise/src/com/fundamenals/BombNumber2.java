package com.fundamenals;
import java.util.*;
import java.util.stream.Collectors;

public class BombNumber2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt)
				.collect(Collectors.toList());

		String[] input = sc.nextLine().split("\\s+");
		int bombNumber = Integer.parseInt(input[0]);
		int bombPower = Integer.parseInt(input[1]);

		int sum = 0;

		while (numbers.contains(bombNumber)) {
			int indexBomb = numbers.indexOf(bombNumber);

			int left = Math.max(0, indexBomb - bombPower);
			int right = Math.min(numbers.size() - 1, indexBomb + bombPower);

			for (int i = right; i >= left; i--) {
				numbers.remove(i);
			}
		}

		for (int i = 0; i < numbers.size(); i++) {
			sum += numbers.get(i);
		}
		System.out.println(sum);

	}
}

