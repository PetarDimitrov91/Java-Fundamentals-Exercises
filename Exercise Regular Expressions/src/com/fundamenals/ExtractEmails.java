package com.fundamenals;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		String regexEmail = "(([a-zA-Z0-9]+)([.\\-_]?)([a-zA-Z0-9]+))(@)(([a-zA-Z]+).([a-zA-Z]+)[.a-zA-Z]*\\b)";
		String input = console.nextLine();
		Pattern pattern = Pattern.compile(regexEmail);
		Matcher matcher = pattern.matcher(input);
		while (matcher.find()){
			System.out.println(matcher.group());
		}
	}
}
