package com.fundamenals;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		String resource = console.nextLine();
		Map<String, Integer> resourcesQuantity = new LinkedHashMap<>();
		while (!resource.equals("stop")) {
			int quantity = Integer.parseInt(console.nextLine());
			if (!resourcesQuantity.containsKey(resource)) {
				resourcesQuantity.put(resource, quantity);
			} else {
				resourcesQuantity.put(resource, resourcesQuantity.get(resource) + quantity);
			}
			resource = console.nextLine();
		}
		resourcesQuantity.forEach((k,v) -> System.out.println(k + " -> " +v));
	}
}
