package com.fundamenals;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int numberOfRegistrations = Integer.parseInt(console.nextLine());
		Map<String, String> registrations = new LinkedHashMap<>();
		for (int i = 1; i <= numberOfRegistrations; i++) {
			String[] command = console.nextLine().split("\\s+");
			switch (command[0]) {
				case "register":
					String registrationsName = command[1];
					String registrationsNumber = command[2];
					if (!chekRegistrationsName(registrationsName, registrations)) {
						registrations.put(registrationsName, registrationsNumber);
						System.out.printf("%s registered %s successfully%n", registrationsName, registrationsNumber);
					} else {
						String actualRegisterPlate = registrations.get(registrationsName);
						System.out.printf("ERROR: already registered with plate number %s%n", actualRegisterPlate);
					}
					break;
				case "unregister":
					registrationsName = command[1];
					if (chekRegistrationsName(registrationsName, registrations)) {
						registrations.remove(registrationsName);
						System.out.printf("%s unregistered successfully%n", registrationsName);
					} else {
						System.out.printf("ERROR: user %s not found%n", registrationsName);
					}
			}
		}
		registrations.forEach((key, value) -> System.out.println(key + " => " + value));
	}

	private static boolean chekRegistrationsName(String registrationsName, Map<String, String> registrations) {
		return registrations.containsKey(registrationsName);
	}
}
