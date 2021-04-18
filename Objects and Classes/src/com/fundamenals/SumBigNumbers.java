package com.fundamenals;

import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		BigInteger a = new BigInteger(console.nextLine());
		BigInteger b = new BigInteger(console.nextLine());
		BigInteger sum = a.add(b);
		System.out.println(sum);
	}
}
