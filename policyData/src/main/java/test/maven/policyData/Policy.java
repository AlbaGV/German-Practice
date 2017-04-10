package test.maven.policyData;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;

/**
 * 
 * This class Policy with DateOfBeginning and DateOfEnd as Attributes
 * 
 * 
 * 
 * @author 227320
 *
 */
@IdAnnotation(
		id = 1
		)
public class Policy implements AssuranceComponent {
	

	private LocalDate dateOfBeginning;
	private LocalDate dateOfEnd;

	private List<Coverage> coverageList = new ArrayList<Coverage>();

	public Policy(LocalDate dateOfBeginning, LocalDate dateOfEnd, List<Coverage> coverageList) {
		super();
		
		this.dateOfBeginning = dateOfBeginning;
		this.dateOfEnd = dateOfEnd;
		this.coverageList = coverageList;
	}

	public List<Coverage> getCoverageList() {
		return coverageList;
	}

	public void setCoverageList(List<Coverage> coverageList) {
		this.coverageList = coverageList;
	}

	public LocalDate getDateOfBeginning() {
		return dateOfBeginning;
	}

	public void setDateOfBeginning(LocalDate dateOfBeginning) {
		this.dateOfBeginning = dateOfBeginning;
	}

	public LocalDate getDateOfEnd() {
		return dateOfEnd;
	}

	public void setDateOfEnd(LocalDate dateOfEnd) {
		this.dateOfEnd = dateOfEnd;
	}

	public String getId() {

		return null;
	}


		
}