package tryobjects.test;

/**
 * 
 * This class Coverage with Premium and Name as Attributes
 * 
 * @author 033992
 *
 */
// TODO Coverage doesn't inherite from Policy! You must do agregation of objects
public class Coverage{

	private double premium;
	private String name;

	// TODO Tidy up!

	public Coverage(double premium, String name) {
		super();
		this.premium = premium;
		this.name = name;
	}

	public double getPremium() {
		return premium;
	}

	public void setPremium(double premium) {
		this.premium = premium;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	@Override
	public String toString() {
		System.out.println(" Premium: " + getPremium() + " Coverage name: "
				+ getName());
	}
	
	

}
