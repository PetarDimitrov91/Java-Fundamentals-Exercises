package com.fundamenals;

import java.util.Scanner;

public class ActivationsKeys {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		StringBuilder activationKey = new StringBuilder(console.nextLine());
		String command = console.nextLine();
		while (!command.equals("Generate")) {
			String[] commandsArray = command.split(">>>");
			switch (commandsArray[0]) {
				case "Contains":
					String substring = commandsArray[1];
					if (activationKey.toString().contains(substring)) {
						System.out.println(activationKey + " " + "contains" + " " + substring);
					} else {
						System.out.println("Substring not found!");
					}
					break;
				case "Flip":
					int startIndex = Integer.parseInt(commandsArray[2]);
					int endIndex = Integer.parseInt(commandsArray[3]);
					switch (commandsArray[1]) {
						case "Upper":
							String substringToUpper = activationKey.substring(startIndex, endIndex).toUpperCase();
							activationKey.replace(startIndex, endIndex, substringToUpper);
							System.out.println(activationKey);
							break;
						case "Lower":
							String substringToLower = activationKey.substring(startIndex, endIndex).toLowerCase();
							activationKey.replace(startIndex, endIndex, substringToLower);
							System.out.println(activationKey);
							break;
					}
					break;
				case "Slice":
					startIndex = Integer.parseInt(commandsArray[1]);
					endIndex = Integer.parseInt(commandsArray[2]);
					activationKey.replace(startIndex,endIndex,"");
					System.out.println(activationKey);
					break;
			}
			command = console.nextLine();
		}
		System.out.println("Your activation key is: " + activationKey);
	}
}


