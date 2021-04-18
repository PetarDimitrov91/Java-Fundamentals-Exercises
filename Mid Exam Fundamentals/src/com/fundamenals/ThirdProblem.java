package com.fundamenals;

import java.util.*;
import java.util.stream.Collectors;

public class ThirdProblem {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		List<String> cards = Arrays.stream( console.nextLine().split(":")).collect(Collectors.toList());
		List<String> newDeck = new ArrayList<>();
		String command = console.nextLine();
		while (!command.equals("Ready")) {
			String[] arrayOfCommands = command.split("\\s+");
			switch (arrayOfCommands[0]) {
				case "Add":
					String cardName = arrayOfCommands[1];
					if(cardExist(cardName,cards)){
						newDeck.add(cardName);
					}else{
						System.out.println("Card not found.");
					}
					break;
				case "Insert":
					cardName = arrayOfCommands[1];
					int index = Integer.parseInt(arrayOfCommands[2]);
					if(cardExist(cardName,cards) && isValidIndex(index,newDeck)){
						newDeck.add(index,cardName);
					}else {
						System.out.println("Error!");
					}
					break;
				case "Remove":
					cardName = arrayOfCommands[1];
					if (cardExist(cardName,newDeck)){
						newDeck.remove(cardName);
					}else {
						System.out.println("Card not found.");
					}
					break;
				case "Swap":
					String firstCard = arrayOfCommands[1];
					int firstCardIndex = getIndex(firstCard,newDeck);
					String secondCard = arrayOfCommands[2];
					int secondCardIndex = getIndex(secondCard,newDeck);
					newDeck.set(firstCardIndex,secondCard);
					newDeck.set(secondCardIndex,firstCard);
					break;
				case "Shuffle":
					Collections.reverse(newDeck);
					break;
			}

			command = console.nextLine();
		}

		printCards(newDeck);

	}

	private static boolean cardExist(String cardName, List<String> cards) {
		for (String card : cards) {
			if(card.equals(cardName)){
				return true;
			}
		}
		return false;
	}

	private static boolean isValidIndex(int index, List<String> newDeck) {
		return index >= 0 && index <= newDeck.size();
	}

	private static int getIndex(String card, List<String> newDeck) {
		int index = 0;
		for (int i = 0; i <newDeck.size() ; i++) {
			if(newDeck.get(i).equals(card)){
				index = i;
			}
		}
		return index;
	}

	private static void printCards(List<String> newDeck) {
		for (String card : newDeck) {
			System.out.print(card + " ");
		}
	}

}
