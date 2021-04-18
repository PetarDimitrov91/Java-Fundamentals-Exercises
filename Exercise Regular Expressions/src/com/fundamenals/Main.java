package com.fundamenals;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		// Demons name
		String regex = "(?<name>[A-Za-z]*)";
		String name = "M3ph-0.5s-0.5t0.0**";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(name);
		StringBuilder newName = new StringBuilder();
		while (matcher.find()){
			newName.append(matcher.group("name"));
		}
		System.out.println(newName);

	}
}
