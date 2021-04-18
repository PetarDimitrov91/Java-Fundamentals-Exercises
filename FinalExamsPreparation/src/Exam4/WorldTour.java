package Exam4;

import java.util.Scanner;

public class WorldTour {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		StringBuilder stops = new StringBuilder(console.nextLine());

		String input = console.nextLine();
		while (!input.equals("Travel")) {
			String[] inputData = input.split(":");
			String command = inputData[0];
			switch (command) {
				case "Add Stop":
					int index = Integer.parseInt(inputData[1]);
					if (isValidIndex(index, stops)) {
						String newStop = inputData[2];
						stops.insert(index, newStop);
					}
					print(stops);
					break;
				case "Remove Stop":
					int startIndex = Integer.parseInt(inputData[1]);
					int endIndex = Integer.parseInt(inputData[2]);
					if (isValidIndex(startIndex, stops) && isValidIndex(endIndex, stops)) {
						stops.delete(startIndex, endIndex + 1);
					}
					print(stops);
					break;
				case "Switch":
					String oldString = inputData[1];
					String newString = inputData[2];
					if (stops.toString().contains(oldString)) {
						String newStops = stops.toString().replace(oldString, newString);
						stops.setLength(0);
						stops.append(newStops);
					}
					print(stops);
					break;
			}
			input = console.nextLine();
		}
		System.out.printf("Ready for world tour! Planned stops: %s", stops);
	}

	static void print(StringBuilder stops) {
		System.out.println(stops);
	}

	static boolean isValidIndex(int index, StringBuilder stops) {
		return index >= 0 && index < stops.length();
	}
}
