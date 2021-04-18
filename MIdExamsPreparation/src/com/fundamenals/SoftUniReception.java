package com.fundamenals;

import java.util.Scanner;

public class SoftUniReception {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int firstEmployeeEfficiency = Integer.parseInt(console.nextLine());
		int secondEmployeeEfficiency = Integer.parseInt(console.nextLine());
		int thirdEmployeeEfficiency = Integer.parseInt(console.nextLine());

		int people = Integer.parseInt(console.nextLine());
		int hours = 0;
		while (people > 0) {

			if (hours % 4 == 0 && hours != 0) {
				hours++;
			} else {
				hours++;
				people = people - firstEmployeeEfficiency - secondEmployeeEfficiency - thirdEmployeeEfficiency;
			}
		}
		if (hours % 4 == 0 && hours != 0) {
			hours++;
		}
		System.out.printf("Time needed: %dh.", hours);
	}
}


