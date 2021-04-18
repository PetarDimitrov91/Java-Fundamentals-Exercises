package com.fundamenals;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String[] sentence = console.nextLine().split(" ");

		Random random = new Random();
		for (int i = 0; i < sentence.length ; i++) {

			int randomIndex = random.nextInt(sentence.length);
			String temp = sentence[i];
			sentence[i] = sentence[randomIndex];
			sentence[randomIndex] = temp;
		}
		for (String s : sentence) {
			System.out.println(s);
		}
	}
}
