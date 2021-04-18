package com.fundamenals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		List<Integer> list = Arrays.stream(console.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
		int size = list.size();
		for (int i = 0; i < size / 2; i++) {
			int sum = list.get(i) + list.get(list.size() - 1);
			list.set(i, sum);
			list.remove(list.size() - 1);

		}
		System.out.println(list.toString().replaceAll("[\\[\\],]", ""));

	}
}
