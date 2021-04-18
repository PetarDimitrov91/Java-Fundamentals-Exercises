package AdvertisementMessage;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int n = Integer.parseInt(console.nextLine());

		String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
		String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
		String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
		String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

		String[] randomMessage = new String[3];

		for (int i = 1; i <= n; i++) {
			randomMessage[0] = phrases[getRandom(phrases.length - 1)];
			randomMessage[1] = events[getRandom(events.length - 1)];
			randomMessage[2] = authors[getRandom(authors.length - 1)] + " - " + cities[getRandom(cities.length - 1)];
			for (String s : randomMessage) {
				System.out.print(s + " ");
			}
			System.out.println();
		}
	}

	private static int getRandom(int length) {
		Random random = new Random();
		return random.nextInt(length);

	}
}
