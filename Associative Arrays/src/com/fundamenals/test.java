package com.fundamenals;

import java.util.*;

public class test {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		Map<String, List<String>> map = new LinkedHashMap<>();
		map.put("cute", new ArrayList<>());
		map.put("ugly", new ArrayList<>());
		map.get("cute").add("charming");
		map.get("cute").add("sexy");
		map.get("ugly").add("disgusting");

		System.out.println(map);







	}

}
