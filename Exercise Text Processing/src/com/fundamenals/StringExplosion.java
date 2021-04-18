package com.fundamenals;

import java.util.Scanner;

public class StringExplosion {
	//abv>1>1>2>2asdasd

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		StringBuilder input = new StringBuilder(console.nextLine());
		int bomb = 0;

		for (int i = 0; i < input.length(); i++) {
			if (bomb > 0 && input.charAt(i) != '>') {
				input.replace(i, i + 1,"");
				bomb--;
				i--;
			} else if (input.charAt(i) == '>') {
				bomb += Integer.parseInt(String.valueOf(input.charAt(i + 1)));
			}
		}
		System.out.println(input);
	}


}
