package test.interfaces;

public class Car implements Risk {
	private int licensePlate;
	private String name;

	public Car(String name) {
		this.name = name;
	}

	public int getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(int licensePlate) {
		this.licensePlate = licensePlate;
	}

	@Override
	public String getId() {
		return name;
	}

	public void setId(String name) {
		this.name = name;
	}

}
