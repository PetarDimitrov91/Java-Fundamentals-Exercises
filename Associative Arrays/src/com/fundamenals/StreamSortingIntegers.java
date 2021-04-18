package StreamTutorials;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamSortingIntegers {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		List<Integer> numbers = Arrays.stream(console.nextLine().split("\\s+"))
				.map(Integer::parseInt)
				.filter(n -> n > 0)
				.collect(Collectors.toList());

		// sorting in ascending order:
		numbers = numbers.stream()
				.sorted(Integer::compareTo)
				.collect(Collectors.toList());

		// sorting in descending order;
		numbers = numbers.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());

		for (Integer number : numbers) {
			System.out.print(number +", ");
		}
	}
}
