package com.fundamenals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int[] array = Arrays.stream(console.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int command = Integer.parseInt(console.nextLine());
		List<Integer> arrayList = new ArrayList<>();
		for (int number : array) {
			arrayList.add(number);
		}

		for (int i = 0; i <= command; i++) {
			int number = arrayList.get(0);
			arrayList.add(arrayList.size(), number);
			arrayList.remove(0);

		}




		System.out.println(arrayList.toString());

	}
}
