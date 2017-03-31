package test.arraylist;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

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

	private final int policyId;
	private Calendar dateOfBeginning;
	private Calendar dateOfEnd;

	private List<Coverage> coverages = new ArrayList<Coverage>();

	public Policy(int policyId, Calendar dateOfBeginning, Calendar dateOfEnd,
			List<Coverage> coverages) {
		this(policyId);
		this.dateOfBeginning = dateOfBeginning;
		this.dateOfEnd = dateOfEnd;
		this.coverages = coverages;
	}

	public Policy(int policyId) {
		super();
		this.policyId = policyId;
	}

	public Calendar getDateOfBeginning() {
		return dateOfBeginning;
	}

	public void setDateOfBeginning(Calendar dateOfBeginning) {
		this.dateOfBeginning = dateOfBeginning;
	}

	public Calendar getDateOfEnd() {
		return dateOfEnd;
	}

	public void setDateOfEnd(Calendar dateOfEnd) {
		this.dateOfEnd = dateOfEnd;
	}

	public List<Coverage> getCoverages() {
		return coverages;
	}

	public void setCoverages(List<Coverage> coverages) {
		this.coverages = coverages;
	}

	public int getPolicyId() {
		return policyId;
	}

	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", dateOfBeginning= "
				+ dateOfBeginning.get(Calendar.YEAR) + " / "
				+ dateOfBeginning.get(Calendar.MONTH) + " / "
				+ dateOfBeginning.get(Calendar.DATE) + ", dateOfEnd= "
				+ dateOfEnd.get(Calendar.YEAR) + " / "
				+ dateOfEnd.get(Calendar.MONTH) + " / "
				+ dateOfEnd.get(Calendar.DATE) + ", coverages=" + coverages
				+ "]";
	}

}