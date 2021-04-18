package Exam5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String regex = "([|#])(?<productName>[A-Za-z ]+)\\1(?<expirationDate>\\d{2}/\\d{2}/\\d{2})\\1(?<calories>\\d+)\\1";
		Pattern pattern = Pattern.compile(regex);
		String input = console.nextLine();
		Matcher matcher = pattern.matcher(input);
		int totalCalories = 0;
		while (matcher.find()) {
			totalCalories += Integer.parseInt(matcher.group("calories"));
		}
		System.out.printf("You have food to last you for: %d days!%n", totalCalories / 2000);
		Matcher match = pattern.matcher(input);
		while (match.find()) {
			String product = match.group("productName");
			String expirationDate = match.group("expirationDate");
			int calories = Integer.parseInt(match.group("calories"));
			System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n",product,expirationDate,calories);
		}
	}
}

