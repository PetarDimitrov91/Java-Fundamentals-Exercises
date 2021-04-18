package com.fundamenals;

import java.util.Scanner;

public class test {

		public static void main(String[] args) {
			Scanner console = new Scanner(System.in);
			String[] tickets = console.nextLine().split("[\\s,]+");
			for (String ticket : tickets) {
				if (ticketIsValid(ticket)) {
					int atSymbolLeft = 0;
					int hashSymbolLeft = 0;
					int dollarSymbolLeft = 0;
					int caretSymbolLeft = 0;

					int atSymbolRight = 0;
					int hashSymbolRight = 0;
					int dollarSymbolRight = 0;
					int caretSymbolRight = 0;

					for (int i = (ticket.length() / 2)-1 ; i >= 0; i--) {
						//chek left side
						char currentSymbol = ticket.charAt(i);
						switch (currentSymbol) {
							case '@':
								atSymbolLeft++;
								break;
							case '#':
								hashSymbolLeft++;
								break;
							case '$':
								dollarSymbolLeft++;
								break;
							case '^':
								caretSymbolLeft++;
								break;
						}
					}
					for (int i = (ticket.length() / 2) -1 ; i < ticket.length(); i++) {
						// chek right side
						char currentSymbol = ticket.charAt(i);
						switch (currentSymbol) {
							case '@':
								atSymbolRight++;
								break;
							case '#':
								hashSymbolRight++;
								break;
							case '$':
								dollarSymbolRight++;
								break;
							case '^':
								caretSymbolRight++;
								break;
						}
					}
					boolean hasWon = false;
					if (atSymbolLeft >= 6 && atSymbolLeft <= 9 && atSymbolRight >= 6 && atSymbolRight <= 9) {
						//if (atSymbolLeft == atSymbolRight) {
							System.out.println("ticket" + " " + '"' + ticket + '"' + " - " + atSymbolLeft + '@');
							hasWon = true;
						//}
					}
					if (atSymbolLeft == 10 && atSymbolRight == 10) {
						System.out.println("ticket" + " " + '"' + ticket + '"' + " - " + atSymbolLeft + '@' + " Jackpot!");
						hasWon = true;
					}

					if (hashSymbolLeft >= 6 && hashSymbolLeft <= 9 && hashSymbolRight >= 6 && hashSymbolRight <= 9) {
						if (hashSymbolLeft == hashSymbolRight) {
							System.out.println("ticket" + " " + '"' + ticket + '"' + " - " + hashSymbolLeft + '#');
							hasWon = true;
						}
					}
					if (hashSymbolLeft == 10 && hashSymbolRight == 10) {
						System.out.println("ticket" + " " + '"' + ticket + '"' + " - " + hashSymbolLeft + '#' + " Jackpot!");
						hasWon = true;
					}

					if (dollarSymbolLeft >= 6 && dollarSymbolLeft <= 9 && dollarSymbolRight >= 6 && dollarSymbolRight <= 9) {
						if (dollarSymbolLeft == dollarSymbolRight) {
							System.out.println("ticket" + " " + '"' + ticket + '"' + " - " + dollarSymbolLeft + '$');
							hasWon = true;
						}
					}
					if (dollarSymbolLeft == 10 && dollarSymbolRight == 10) {
						System.out.println("ticket" + " " + '"' + ticket + '"' + " - " + dollarSymbolLeft + '$' + " Jackpot!");
						hasWon = true;
					}

					if (caretSymbolLeft >= 6 && caretSymbolLeft <= 9 && caretSymbolRight >= 6 && caretSymbolRight <= 9) {
						if (caretSymbolLeft == caretSymbolRight) {
							System.out.println("ticket" + " " + '"' + ticket + '"' + " - " + caretSymbolLeft + '^');
							hasWon = true;
						}
					}
					if (caretSymbolLeft == 10 && caretSymbolRight == 10) {
						System.out.println("ticket" + " " + '"' + ticket + '"' + " - " + caretSymbolLeft + '^' + " Jackpot!");
						hasWon = true;
					}
					if (!hasWon) {
						System.out.println("ticket" + " " + '"' + ticket + '"' + " - " +  "no match");
					}

				} else {
					System.out.println("invalid ticket");
				}
			}
		}
		private static boolean ticketIsValid(String ticket) {
			return ticket.length() == 20;
		}
	}

