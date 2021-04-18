package com.fundamenals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int[] array = Arrays.stream(console.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int command = Integer.parseInt(console.nextLine());


		for (int i = 0; i < array.length; i++) {
			int number = array[0];
			array[0]= array[1];
			array[array.length -1] = number;

		}
		System.out.println(Arrays.toString(array));

	}
}