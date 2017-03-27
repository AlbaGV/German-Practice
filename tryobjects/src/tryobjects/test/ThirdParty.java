package tryobjects.test;

public class ThirdParty extends Coverage {

	public ThirdParty(double premium) {
		super(premium);
	}
	public String name = "Third-Party";
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "ThirdParty [name=" + name + ", getPremium()=" + getPremium()
				+ "]";
	}
	
	

}
