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

	private String dateOfBeginning; // TODO Why ist a date not a date? Choose
									// the right type like Date.
	private String dateOfEnd;
	private Coverage coverage1;
	private Coverage coverage2;

	public Policy(String dateOfBeginning, String dateOfEnd, Coverage coverage1,
			Coverage coverage2) {
		super();
		this.dateOfBeginning = dateOfBeginning;
		this.dateOfEnd = dateOfEnd;
		this.coverage1 = coverage1;
		this.coverage2 = coverage2;
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

	public Coverage getCoverage1() {
		return coverage1;
	}

	public void setCoverage1(Coverage coverage1) {
		this.coverage1 = coverage1;
	}

	public Coverage getCoverage2() {
		return coverage2;
	}

	public void setCoverage2(Coverage coverage2) {
		this.coverage2 = coverage2;
	}

	@Override
	public String toString() {
		return "Date of the beginning: " + getDateOfBeginning()
				+ " Expiration date: " + getDateOfEnd();
	}

}
