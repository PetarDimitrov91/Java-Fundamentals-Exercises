package com.fundamenals;
import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		List<String> list = Arrays.stream(console.nextLine().split("\\s+|")).collect(Collectors.toList());
		List<String> correctList = new ArrayList<>();
		List<String> array = new ArrayList<>();
		for (String currentSymbol : list) {
			if (!currentSymbol.equals("")) {
				correctList.add(currentSymbol);
			}
		}
		boolean isFound = false;
		StringBuilder arrayOfElements = new StringBuilder();
		for (String element : correctList) {
			if (!element.equals("|")) {
				arrayOfElements.append(element);
			} else {
				isFound = true;
			}
			if (isFound) {
				array.add(arrayOfElements.toString());
				arrayOfElements = new StringBuilder();
			}
			isFound = false;
		}
		array.add(arrayOfElements.toString());
		Collections.reverse(array);
		for (String currentElement : array) {
			for (int j = 0; j < currentElement.length(); j++) {
				char currentSymbol = currentElement.charAt(j);
				System.out.print(currentSymbol + " ");
			}
		}
	}
}

