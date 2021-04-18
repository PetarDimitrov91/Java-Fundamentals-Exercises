package Exam4;

import java.util.*;

public class test {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);


		Map<String, List<Integer>> map = new HashMap<>();
		map.put("Petar", new ArrayList<>());
		map.get("Petar").add(1);
		map.get("Petar").add(2);
		map.get("Petar").add(3);
		map.get("Petar").add(4);
		map.get("Petar").add(5);

		map.get("Petar").clear();


	}


}
