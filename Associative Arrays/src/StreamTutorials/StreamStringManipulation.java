package StreamTutorials;

import java.util.Arrays;

public class StreamStringManipulation {
	public static void main(String[] args) {
		String[] words = {"Petar", "Sandra", "Blaga"};
		words = Arrays.stream(words).map(w -> w + " Bulgaria").toArray(String[]::new);

		for (String word : words) {
			System.out.print(word + ", ");
		}
	}
}
