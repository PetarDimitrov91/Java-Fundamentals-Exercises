package com.fundamenals;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int n = Integer.parseInt(console.nextLine());
		BigInteger factorial = new BigInteger("1");

		for (int i = 1; i <= n ; i++) {
			factorial= factorial.multiply(BigInteger.valueOf(i));
		}
		System.out.println(factorial);
	}
}
