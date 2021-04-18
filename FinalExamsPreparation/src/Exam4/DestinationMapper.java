package Exam4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String regex = "([=/])[A-Z][a-zA-Z]{2,}\\1";
		String locations = console.nextLine();
		List<String> destinations = new ArrayList<>();

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(locations);

		while (matcher.find()) {
			String destination = matcher.group();
			String removedSymbolsFromDestination = destination.replace("=", "").replace("/", "");
			destinations.add(removedSymbolsFromDestination);
		}

		int travelPoints = 0;
		for (String destination : destinations) {
			travelPoints += destination.length();
		}
		System.out.println("Destinations: "+String.join(", ",destinations));
		System.out.println("Travel Points: "  + travelPoints);

	}
}
