package VehicleCatalogue;

public class Vehicle {
	private String type;
	private String model;
	private String color;
	private int horsepower;

	public Vehicle(String type, String model, String color, int horsepower) {
		this.type = type;
		this.model = model;
		this.color = color;
		this.horsepower = horsepower;
	}

	public String getModel() {
		return model;
	}

	@Override

	public String toString() {
		return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d", type, model, color, horsepower);
	}

}
