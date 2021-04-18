package Exam3;

import java.util.Scanner;

public class SecretChat {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		StringBuilder message = new StringBuilder(console.nextLine());
		String command = console.nextLine();

		while (!command.equals("Reveal")) {
			String[] commandsArray = command.split(":\\|:");
			String action = commandsArray[0];
			switch (action) {
				case "InsertSpace":
					int index = Integer.parseInt(commandsArray[1]);
					message.insert(index, " ");
					print(message);
					break;
				case "Reverse":
					StringBuilder substring = new StringBuilder(commandsArray[1]);
					int start = message.indexOf(substring.toString());
					if (message.toString().contains(substring)) {
						message.replace(start, start + substring.length(), "");
						substring.reverse();
						message.append(substring);
						print(message);
					} else {
						System.out.println("error");
					}
					break;
				case "ChangeAll":
					String substr = commandsArray[1];
					String toReplace = commandsArray[2];
					String newMessage = message.toString().replace(substr, toReplace);
					message.setLength(0);
					message.append(newMessage);
					print(message);
					break;
			}
			command = console.nextLine();
		}
		System.out.printf("You have a new text message: %s", message.toString());
	}

	static void print(StringBuilder message) {
		System.out.println(message);
	}
}
