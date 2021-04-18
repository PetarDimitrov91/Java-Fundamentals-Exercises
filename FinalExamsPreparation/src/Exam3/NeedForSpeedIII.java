package Exam3;

import java.util.*;

public class NeedForSpeedIII {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int n = Integer.parseInt(console.nextLine());

		Map<String, Integer> carsAndKm = new HashMap<>();
		Map<String, Integer> carsAndFuel = new HashMap<>();

		for (int i = 0; i < n; i++) {
			String[] input = console.nextLine().split("\\|");
			String car = input[0];
			int kilometers = Integer.parseInt(input[1]);
			int fuel = Integer.parseInt(input[2]);
			carsAndKm.put(car, kilometers);
			carsAndFuel.put(car, fuel);
		}
		String command = console.nextLine();
		while (!command.equals("Stop")) {
			String[] commandData = command.split(" : ");
			String action = commandData[0];
			String car = commandData[1];
			switch (action) {
				case "Drive":
					int drivenDistance = Integer.parseInt(commandData[2]);
					int neededFuel = Integer.parseInt(commandData[3]);
					if (neededFuel > carsAndFuel.get(car)) {
						System.out.println("Not enough fuel to make that ride");
					} else {
						carsAndKm.put(car, carsAndKm.get(car) + drivenDistance);
						carsAndFuel.put(car, carsAndFuel.get(car) - neededFuel);
						System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, drivenDistance, neededFuel);
						if (carsAndKm.get(car) >= 100000) {
							System.out.printf("Time to sell the %s!%n", car);
							carsAndKm.remove(car);
							carsAndFuel.remove(car);
						}
					}
					break;
				case "Refuel":
					int currentFuel = carsAndFuel.get(car);
					int forPrinting = currentFuel;
					int fuelToRefuel = Integer.parseInt(commandData[2]);
					currentFuel += fuelToRefuel;
					if (currentFuel > 75) {
						currentFuel = 75;
						System.out.printf("%s refueled with %d liters%n", car, 75 - forPrinting);
					} else {
						System.out.printf("%s refueled with %d liters%n", car, fuelToRefuel);
					}
					carsAndFuel.put(car, currentFuel);
					break;
				case "Revert":
					int kmToDecrease = Integer.parseInt(commandData[2]);
					int currentKm = carsAndKm.get(car);
					currentKm -= kmToDecrease;

					if (currentKm < 10000) {
						currentKm = 10000;
					} else {
						System.out.printf("%s mileage decreased by %d kilometers%n", car, kmToDecrease);
					}
					carsAndKm.put(car, currentKm);
					break;
			}
			command = console.nextLine();
		}
		carsAndKm
				.entrySet()
				.stream()
				.sorted((e1, e2) -> {
					int res = e2.getValue().compareTo(e1.getValue());
					if (res == 0) {
						res = e1.getKey().compareTo(e2.getKey());
					}
					return res;
				})
				.forEach(e -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", e.getKey(), e.getValue(), carsAndFuel.get(e.getKey())));


	}
}


