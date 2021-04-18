package com.fundamenals;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		String number1 = console.nextLine();
		String number2 = console.nextLine();

		BigInteger firstNumber = new BigInteger(number1);
		BigInteger secondNumber = new BigInteger(number2);

		System.out.println(firstNumber.multiply(secondNumber));
	}
}
