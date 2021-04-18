package com.fundamenals;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String regex = "%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>\\d+([.][0-9]+)?)\\$";
		String command = console.nextLine();
		Pattern pattern = Pattern.compile(regex);
		double totalPrice = 0;

		while (!command.equals("end of shift")) {
		Matcher matcher = pattern.matcher(command);
			if (matcher.find()) {
				double price = Double.parseDouble(matcher.group("price"));
				int count = Integer.parseInt(matcher.group("count"));
				double finalPrice = price * count;
				System.out.printf("%s: %s - %.2f%n", matcher.group("name"), matcher.group("product"), finalPrice);
				totalPrice += finalPrice;
			}
			command = console.nextLine();
		}
		System.out.printf("Total income: %.2f", totalPrice);
	}
}
