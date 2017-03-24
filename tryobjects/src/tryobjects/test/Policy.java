package tryobjects.test;

/**
 * 
 * This class Policy with DateOfBeginning and DateOfEnd as Attributes
 * 
 * 
 * 
 * @author 033992
 *
 */
public class Policy {

	private String dateOfBeginning; // TODO Why ist a date not a date? Choose the right type like Date.
	private String dateOfEnd;
	private Coverage coverage1;
	private Coverage coverage2;
	
	public Policy(Coverage a){
		coverage1 = a;
		
	}
	public Policy(Coverage b){
		coverage2 = b;
		
	}

	public Policy(String dateBeg,Coverage coverage1, String dateEnd) {
		this.dateOfBeginning = dateBeg;
		this.dateOfEnd = dateEnd;
		this.coverage1= coverage1;
		this.coverage1= coverage2;

	}

	
	
	public String getDateOfBeginning() {
		return dateOfBeginning;
	}

	public void setDateOfBeginning(String dateOfBeginning) {
		this.dateOfBeginning = dateOfBeginning;
	}

	public String getDateOfEnd() {
		return dateOfEnd;
	}

	public void setDateOfEnd(String dateOfEnd) {
		this.dateOfEnd = dateOfEnd;
	}

	public Coverage getCoverage() {
		return coverage1;
	}

	public void setCoverage(Coverage coverage1) {
		this.coverage1 = coverage1;
	}

	@Override 
	public String toString() {
		return "Date of the beginning: " + getDateOfBeginning() + " Expiration date: "	+ getDateOfEnd();
	}

}
