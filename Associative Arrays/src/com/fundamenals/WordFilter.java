package com.fundamenals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordFilter {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		List<String> words = Arrays.stream(console.nextLine().split("\\s+"))
				.filter(e -> e.length() % 2 == 0)
				.collect(Collectors.toList());
		words.forEach(System.out::println);
	}
}
