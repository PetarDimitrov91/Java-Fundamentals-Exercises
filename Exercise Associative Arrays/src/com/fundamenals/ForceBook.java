package com.fundamenals;

import java.util.*;

public class ForceBook {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		// first take the input
		// then chek what kind of input we have
		// then put the users to them side
		// then print the users

		Map<String, List<String>> sidesAndUsers = new HashMap<>();
		String command = console.nextLine();
		while (!command.equals("Lumpawaroo")) {
			String[] data = command.split("\\s+");
			String side = "";
			String name = "";
			if (sideFirst(data)) {
				side = returnSideFirst(data);
				name = returnNameFirst(data);
			} else {
				name = returnNameSecond(data);
				side = returnSideSecond(data);
			}

			if (nameIsRegistred(name, sidesAndUsers)) {
				removeUser(name, sidesAndUsers);
			} else {
				sidesAndUsers.put(side, new ArrayList<>());
				sidesAndUsers.get(side).add(name);
				command = console.nextLine();
			}
		}
		sidesAndUsers.forEach((side, users) -> {
			System.out.printf("Side: %s, Members: %d%n", side, users.size());
			users.forEach(s -> System.out.println("! " + s));
		});
	}

	private static boolean sideFirst(String[] data) {
		return Arrays.asList(data).contains("|");
	}

	private static String returnNameFirst(String[] data) {
		StringBuilder name = new StringBuilder();
		boolean fromHere = false;
		for (String element : data) {
			if (fromHere) {
				name.append(element);
				name.append(" ");
			}
			if (element.equals("|"))
				fromHere = true;
		}
		return name.toString();
	}

	private static String returnSideFirst(String[] data) {
		StringBuilder side = new StringBuilder();
		for (String element : data) {
			if (element.equals("|")) {
				break;
			}
			side.append(element);
		}
		return side.toString();
	}

	private static String returnSideSecond(String[] data) {
		StringBuilder side = new StringBuilder();
		boolean fromHere = false;
		for (String element : data) {
			if (fromHere) {
				side.append(element);
				side.append(" ");
			}
			if (element.equals("->")) {
				fromHere = true;
			}
		}
		return side.toString();
	}

	private static String returnNameSecond(String[] data) {
		StringBuilder name = new StringBuilder();
		for (String element : data) {
			if (element.equals("->")) {
				break;
			}
			name.append(element);
			name.append(" ");
		}
		return name.toString();
	}

	private static boolean nameIsRegistred(String name, Map<String, List<String>> sidesAndUsers) {
		return sidesAndUsers.values().stream().flatMap(Collection::stream).anyMatch(user -> user.equals(name));
	}

	private static void removeUser(String name, Map<String, List<String>> sidesAndUsers) {
		sidesAndUsers.forEach((side, users) -> users.remove(name));
	}
}
