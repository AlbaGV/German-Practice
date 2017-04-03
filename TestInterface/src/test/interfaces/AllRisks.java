package test.interfaces;

import java.util.List;

public class AllRisks extends Coverage {

	private double excess;

	public AllRisks(List<Risk> riskList, int id, double price, String name,
			double excess) {
		super(riskList, id, price, name);
		this.excess = excess;
	}

	public double getExcess() {
		return excess;
	}

	public void setExcess(double excess) {
		this.excess = excess;
	}

}
