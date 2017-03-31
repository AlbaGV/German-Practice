package test.arraylist;

public class ThirdParty extends Coverage {

	private double maximumCoverage;

	public ThirdParty(double price, String name, double maximumCoverage) {
		super(price, name);
		this.maximumCoverage = maximumCoverage;
	}

	public double getMaximumCoverage() {
		return maximumCoverage;
	}

	public void setMaximumCoverage(double maximumCoverage) {
		this.maximumCoverage = maximumCoverage;
	}

	@Override
	public String toString() {
		return "ThirdParty [maximumCoverage=" + maximumCoverage + " €, Price"
				+ getPrice() + ", Name=" + getName() + "]";
	}

}
