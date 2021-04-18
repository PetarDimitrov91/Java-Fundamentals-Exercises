package StreamTutorials;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class test {
	public static void main(String[] args) {
		List<String> str = new ArrayList<>(Arrays.asList("Petarx", "Sandrax"));

		List<String> collect = str.stream().map(w -> w.replaceAll("x", "")).collect(Collectors.toList());
		collect.forEach(System.out::println);


		List<Integer> nums = new ArrayList<>(Arrays.asList(12, 13, 19, 20));


		List<Integer> subList = nums.subList(0, 2);
		subList.forEach(System.out::println);


		String[] arr = {"a", "b", "c", "d"};
		String[] subArr = Arrays.copyOfRange(arr, 1, 3);

		Arrays.stream(subArr).forEach(System.out::println);

	}
}
