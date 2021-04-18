package StreamTutorials;

import java.util.*;

public class StreamMultipleSorting {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		Map<String, Integer> products = new HashMap<>();
		products.put("Apple", 1);
		products.put("Tomato", 1);
		products.put("Lemon", 5);
		products.put("Strawberry", 2);
		products.put("Banana", 2);

		// first way sorting first by value then by key;

		//* products.entrySet().stream()
		//* .sorted((e1,e2) -> {
		//* int res = e2.getValue().compareTo(e1.getValue());
		//* if (res == 0){
		//* 	res = e1.getKey().compareTo(e2.getKey());
		//* }
		//* return res; })
		//* .forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));

		// second way sorting first by value then by key;

		products.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
				.forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));


	}
}
