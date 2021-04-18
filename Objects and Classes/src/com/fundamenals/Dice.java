package com.fundamenals;

import java.util.Random;

public class Dice {
	private int sides;
	private String color;

	public Dice(int sides, String color){
		this.sides = sides;
		this.color = color;
	}

	public Dice(){

	}
	public int getSides() {
		return sides;
	}

	public void setSides(int number) {
		this.sides = number;
		if (number < 0) {
			this.sides = 1;
		}
	}

	int roll() {
		Random random = new Random();
		return random.nextInt(sides) + 1;
	}


	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
}
