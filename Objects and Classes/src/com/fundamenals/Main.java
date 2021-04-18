package com.fundamenals;

public class Main {

	public static void main(String[] args) {
		Dice myDice = new Dice(6,"Blue");
		myDice.setSides(10);
		System.out.println(myDice.roll());


		Dice mySecondDice = new Dice();
		mySecondDice.setSides(6);
		System.out.println(mySecondDice.roll());

	}
}
