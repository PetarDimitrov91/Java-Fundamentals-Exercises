package StreamTutorials;

import java.util.Arrays;
import java.util.Scanner;

public class StreamFiltering {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int[] numbers = Arrays.stream(console.nextLine().split("\\s+"))
				.mapToInt(Integer::parseInt)
				.filter(n -> n > 0)
				.toArray();


		for (int number : numbers) {
			System.out.print(number + " ");
		}
	}
}

