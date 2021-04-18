package com.fundamenals;

import java.util.Scanner;

public class FirstProblem {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int orders = Integer.parseInt(console.nextLine());
		double totalPrice = 0;

		for (int i = 1; i <= orders; i++) {
			double pricePerCapsule = Double.parseDouble(console.nextLine());
			int days = Integer.parseInt(console.nextLine());
			int capsulesCount = Integer.parseInt(console.nextLine());
			double orderPrice = (days * capsulesCount) * pricePerCapsule;
			System.out.printf("The price for the coffee is: $%.2f%n",orderPrice);
			totalPrice += orderPrice;
		}
		System.out.printf("Total: $%.2f",totalPrice);
	}
}
