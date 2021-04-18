package com.fundamenals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Test3 {

	public static void main(String[] args) {
		//List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 10));
		//List<Integer> collect = nums.stream().map(e -> e * 2).collect(Collectors.toList());
		//collect.forEach(System.out::println);


		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 10, 15, 15));
		List<Integer> threeNumbers = new ArrayList<>();
		for (int i = 1; i <= 3; i++) {
			int maxNumber = numbers.stream().max(Integer::compareTo).orElse(0);
			threeNumbers.add(maxNumber);
			numbers.indexOf(maxNumber);
			numbers.remove((Integer) maxNumber);
		}
		System.out.println(threeNumbers.toString());


	}
}
