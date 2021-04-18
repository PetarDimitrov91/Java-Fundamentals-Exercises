package VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String command = console.nextLine();
		List<Vehicle> listOfVehicles = new ArrayList<>();
		int totalHorsepowerCar = 0;
		int countOfCars = 0;
		int totalHorsepowerTruck = 0;
		int countOfTrucks = 0;

		while (!command.equals("End")) {
			String[] vehicleData = command.split("\\s+");
			String type = vehicleData[0].substring(0, 1).toUpperCase() + vehicleData[0].substring(1);
			String model = vehicleData[1];
			String color = vehicleData[2];
			int horsePower = Integer.parseInt(vehicleData[3]);
			Vehicle vehicle = new Vehicle(type, model, color, horsePower);
			listOfVehicles.add(vehicle);
			switch (type) {
				case "Car":
					totalHorsepowerCar += horsePower;
					countOfCars++;
					break;
				case "Truck":
					totalHorsepowerTruck += horsePower;
					countOfTrucks++;
					break;
			}
			command = console.nextLine();
		}
		String secondCommand = console.nextLine();
		while (!secondCommand.equals("Close the Catalogue")) {
			for (Vehicle vehicleData : listOfVehicles) {
				if (vehicleData.getModel().equals(secondCommand)) {
					System.out.println(vehicleData);
				}
			}
			secondCommand = console.nextLine();
		}
		printAverageCarsHorsepower(totalHorsepowerCar, countOfCars);
		printAverageTrucksHorsepower(totalHorsepowerTruck, countOfTrucks);
	}

	private static void printAverageCarsHorsepower(int totalHorsepowerCar, int countOfCars) {
		if (countOfCars > 0) {
			double averageHorsepower = (double) totalHorsepowerCar / countOfCars;
			System.out.printf("Cars have average horsepower of: %.2f.%n", averageHorsepower);
		} else {
			System.out.printf("Cars have average horsepower of: 0.00.%n");
		}
	}

	private static void printAverageTrucksHorsepower(int totalHorsepowerTruck, int countOfTrucks) {
		if (countOfTrucks > 0) {
			double averageHorsepower = (double) totalHorsepowerTruck / countOfTrucks;
			System.out.printf("Trucks have average horsepower of: %.2f.", averageHorsepower);
		} else {
			System.out.print("Trucks have average horsepower of: 0.00.");
		}
	}
}
