package test.maven.policyData;

import java.util.List;


@IdAnnotation(
		id = 2
		)

public class ThirdParty extends Coverage {


	private double maximumCoverage;

	public ThirdParty(List<Risk> riskList, double price, String name,
			double maximumCoverage) {
		super(riskList, price, name);
		this.maximumCoverage = maximumCoverage;
	}

	public double getMaximumCoverage() {
		return maximumCoverage;
	}

	public void setMaximumCoverage(double maximumCoverage) {
		this.maximumCoverage = maximumCoverage;
	}
	
}
