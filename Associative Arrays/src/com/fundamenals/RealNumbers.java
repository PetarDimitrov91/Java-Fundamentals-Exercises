package com.fundamenals;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class RealNumbers {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		double[] nums = Arrays.stream(console.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

		TreeMap<Double, Integer> counts = new TreeMap<>();

		for (double num : nums) {
			if (!counts.containsKey(num)) {
				counts.put(num, 0);
			}
			counts.put(num, counts.get(num) + 1);
		}

		for (Map.Entry<Double, Integer> entry : counts.entrySet()){
			DecimalFormat df = new DecimalFormat("#.#######");
			System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
		}
	}
}
