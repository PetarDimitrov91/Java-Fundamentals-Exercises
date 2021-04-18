package StreamTutorials;

import java.util.HashMap;
import java.util.Map;

public class MapSorting {
	public static void main(String[] args) {
		Map<String, Integer> persons = new HashMap<>();
		persons.put("Petar",29);
		persons.put("Sandra",30);
		persons.put("Alexander",29);
		persons.put("Blaga",30);

		persons.entrySet()
				.stream()
				.sorted((e1,e2) -> {
					int result = e1.getValue().compareTo(e2.getValue());
					if(result == 0){
						result = e1.getKey().compareTo(e2.getKey());
					return result;
					}
					return result;
				})
				.forEach(System.out::println);
	}
}
