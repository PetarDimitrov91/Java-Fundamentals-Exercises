package Exam2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String regex = "@[#]+[A-Z]([A-Za-z0-9]){4,}[A-Z]@[#]+";
		Pattern pattern = Pattern.compile(regex);
		int countOfProducts = Integer.parseInt(console.nextLine());

		for (int i = 1; i <= countOfProducts; i++) {
			String product = console.nextLine();
			Matcher matcher = pattern.matcher(product);
			if (matcher.find()) {
				StringBuilder productCode = new StringBuilder();
				for (int j = 0; j < product.length(); j++) {
					char currentChar = product.charAt(j);
					if (Character.isDigit(currentChar)) {
						productCode.append(currentChar);
					}
				}
				if (productCode.length() == 0) {
					System.out.println("Product group: 00");
				} else {
					System.out.println("Product group: " + productCode);
				}
			} else {
				System.out.println("Invalid barcode");
			}
		}
	}
}
