package tryobjects.test;

public class AllRisks extends Coverage {

	public AllRisks(double premium) {
		super(premium);
	}
	
	public String name = "All-Risks";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "AllRisks [name=" + name + ", getPremium()=" + getPremium()
				+ "]";
	}
	
	

}
