package com.fundamenals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LargestThreeNumbers {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		List<Integer> numbers = Arrays.stream(console.nextLine().split("\\s+"))
				.map(Integer::parseInt)
				.sorted(Comparator.reverseOrder())  //-> Print the Largest 3 Numbers
				//.sorted(Integer::compareTo)     //-> Print the Smallest 3 Numbers
				.limit(3)
				.collect(Collectors.toList());
		numbers.forEach(e -> System.out.print(e + " "));

	}
}
