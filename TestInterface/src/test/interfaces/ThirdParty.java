package test.interfaces;

import java.util.List;

public class ThirdParty extends Coverage {

	private double maximumCoverage;

	public ThirdParty(List<Risk> riskList, int id, double price, String name,
			double maximumCoverage) {
		super(riskList, id, price, name);
		this.maximumCoverage = maximumCoverage;
	}

	public double getMaximumCoverage() {
		return maximumCoverage;
	}

	public void setMaximumCoverage(double maximumCoverage) {
		this.maximumCoverage = maximumCoverage;
	}

}
