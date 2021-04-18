package com.fundamenals;

import java.util.Scanner;

public class ComputerStore {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String command = console.nextLine();
		double totalPrice = 0;
		while (!command.equals("special") && !command.equals("regular")) {
			double partPrice = Double.parseDouble(command);
			if (partPrice < 0) {
				System.out.println("Invalid price!");
				command = console.nextLine();
				continue;
			}
			totalPrice += partPrice;

			command = console.nextLine();
		}
		if (totalPrice == 0) {
			System.out.println("Invalid order!");
			return;
		}
		double priceWhitTaxes = totalPrice * 1.2;
		double totalTaxes = priceWhitTaxes - totalPrice;
		switch (command) {
			case "special":
				priceWhitTaxes *= 0.9;
				break;
		}
		System.out.printf("Congratulations you've just bought a new computer!%nPrice without taxes: %.2f$%nTaxes: %.2f$%n-----------%nTotal price: %.2f$",totalPrice,totalTaxes,priceWhitTaxes);
	}
}
