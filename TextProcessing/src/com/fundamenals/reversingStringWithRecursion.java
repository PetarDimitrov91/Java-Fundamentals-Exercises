package com.fundamenals;

import java.util.Scanner;

//ReverseString with Recursion
public class reversingStringWithRecursion {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String str = console.nextLine();
		while (!str.equals("end")) {
			String reversed = reverseString(str);
			System.out.println(str + " = " + reversed);
			str = console.nextLine();
		}
	}
	private static String reverseString(String str) {
		if(str.isEmpty()){
			return str;
		}
		return reverseString(str.substring(1)) + str.charAt(0);
	}
}
