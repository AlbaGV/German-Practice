package test.arraylist;

public class AllRisks extends Coverage {

	private double excess;

	public AllRisks(double price, String name, double excess) {
		super(price, name);
		this.excess = excess;
	}

	public double getExcess() {
		return excess;
	}

	public void setExcess(double excess) {
		this.excess = excess;
	}

	@Override
	public String toString() {
		return "AllRisks [excess=" + excess + ", Price=" + getPrice()
				+ ", Name=" + getName() + "]";
	}

}
