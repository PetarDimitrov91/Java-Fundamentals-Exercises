package com.fundamenals;

import java.util.*;

public class ListOfProducts {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int n = Integer.parseInt(console.nextLine());
		List<String> products = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			products.add(console.nextLine());
		}

		Collections.sort(products);

		for (int i = 0; i < products.size(); i++) {
			System.out.printf("%d.%s%n", i+1, products.get(i));
		}
	}
}
