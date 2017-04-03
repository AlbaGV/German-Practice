package test.interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * This class Coverage with Premium and Name as Attributes
 * 
 * @author 227320
 *
 */
public abstract class Coverage implements AssuranceComponent {
	private List<Risk> riskList = new ArrayList<Risk>();
	private double price;
	private String name;

	public Coverage(List<Risk> riskList, int id, double price, String name) {
		super();
		this.riskList = riskList;
		this.price = price;
		this.name = name;
	}

	public List<Risk> getRiskList() {
		return riskList;
	}

	public void setRiskList(List<Risk> riskList) {
		this.riskList = riskList;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}