package Exam5;

import java.util.Scanner;

public class TheImitationGame {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		StringBuilder message = new StringBuilder(console.nextLine());
		String input = console.nextLine();
		while (!input.equals("Decode")) {
			String[] inputData = input.split("\\|");
			String command = inputData[0];
			switch (command) {
				case "Move":
					int numberOfLetters = Integer.parseInt(inputData[1]);
					String substring = message.substring(0, numberOfLetters);
					message.delete(0, numberOfLetters);
					message.append(substring);
					break;
				case "Insert":
					String value = inputData[2];
					int index = Integer.parseInt(inputData[1]);
					message.insert(index, value);
					break;
				case "ChangeAll":
					String target = inputData[1];
					String replacement = inputData[2];
					String newMessage = message.toString().replace(target,replacement);
					message.setLength(0);
					message.append(newMessage);
					break;
			}
			input = console.nextLine();
		}
		System.out.println("The decrypted message is: " + message);
	}
}
