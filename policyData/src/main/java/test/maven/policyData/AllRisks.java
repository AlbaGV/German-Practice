package test.maven.policyData;

import java.util.List;


@IdAnnotation(
		id = 3
		)


public class AllRisks extends Coverage {

	private double excess;

	public AllRisks(List<Risk> riskList, double price, String name,
			double excess) {
		super(riskList, price, name);
		this.excess = excess;
	}

	public double getExcess() {
		return excess;
	}

	public void setExcess(double excess) {
		this.excess = excess;
	}

}
