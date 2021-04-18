package com.fundamenals;
import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<String> arrays = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
		Collections.reverse(arrays);
		String toPrint = arrays.toString().replaceAll("[\\]\\[,]", "").trim();
		toPrint = toPrint.replaceAll("\\s+", " ");

		System.out.println(toPrint);
	}
}

