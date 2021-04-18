package com.fundamenals;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, Map<String, Integer>> map = new LinkedHashMap<>();
		map.put("Fundamentals", new LinkedHashMap<>());
		map.get("Fundamentals").put("Petar", 100);
		map.get("Fundamentals").put("Ivan", 300);
		map.get("Fundamentals").put("Asen", 400);
		map.put("Advanced", new LinkedHashMap<>());
		map.get("Advanced").put("Alexander", 200);
		map.get("Advanced").put("Simona", 200);
		map.get("Advanced").put("Sandra", 200);
		map.get("Advanced").put("George", 200);

		int count = 0;
		for (Map<String, Integer> value : map.values()) {
			value.forEach((e1,e2)-> {
				System.out.println(e1 + e2);
			});
		}

		System.out.println(count);
	}
}
