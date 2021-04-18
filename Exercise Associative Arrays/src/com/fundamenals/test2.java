package com.fundamenals;

import java.util.*;

public class test2 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);


		Map<String, List<String>> users = new HashMap<>();
		users.put("SoftUni", new ArrayList<>());
		users.put("Microsoft", new ArrayList<>());
		users.put("Apple", new ArrayList<>());
		users.get("SoftUni").add("Petar");
		users.get("SoftUni").add("Ivan");
		users.get("SoftUni").add("Georgi");
		users.get("Microsoft").add("Maria");
		users.get("Microsoft").add("Ani");
		users.get("Microsoft").add("Sandra");
		users.get("Apple").add("Ivanka");
		users.get("Apple").add("Dimitar");
		users.get("Apple").add("Borislav");

		String name = "Petar";

		users.forEach((firma,userss) -> userss.remove(name));

		users.forEach((firma,userss) -> {
			System.out.println(firma);
			userss.forEach(System.out::println);
			System.out.println();
		});

	}
}
