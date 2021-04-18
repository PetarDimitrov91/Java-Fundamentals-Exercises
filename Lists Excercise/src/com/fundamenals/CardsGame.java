package com.fundamenals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		List<Integer> firstPlayerCards = Arrays.stream(console.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
		List<Integer> secondPlayerCards = Arrays.stream(console.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

		while (firstPlayerCards.size() >= 1 && secondPlayerCards.size() >= 1) {
			int index = 0;
			int cardPlayerOne = firstPlayerCards.get(index);
			int cardPlayerTwo = secondPlayerCards.get(index);
			if (cardPlayerOne > cardPlayerTwo) {
				firstPlayerCards.add(cardPlayerOne);
				firstPlayerCards.add(cardPlayerTwo);
				secondPlayerCards.remove(index);
				firstPlayerCards.remove(index);
			} else if (cardPlayerOne < cardPlayerTwo) {
				secondPlayerCards.add(cardPlayerTwo);
				secondPlayerCards.add(cardPlayerOne);
				firstPlayerCards.remove(index);
				secondPlayerCards.remove(index);
			}
			if (cardPlayerOne == cardPlayerTwo) {
				firstPlayerCards.remove(index);
				secondPlayerCards.remove(index);
			}
		}
		int sumFirstPlayer = 0;
		int sumSecondPlayer = 0;
		for (Integer firstPlayerCard : firstPlayerCards) {
			sumFirstPlayer += firstPlayerCard;
		}
		for (Integer secondPlayerCard : secondPlayerCards) {
			sumSecondPlayer += secondPlayerCard;
		}
		if (sumFirstPlayer > sumSecondPlayer){
			System.out.printf("First player wins! Sum: %d",sumFirstPlayer);
		}else{
			System.out.printf("Second player wins! Sum: %d",sumSecondPlayer);
		}
	}
}
