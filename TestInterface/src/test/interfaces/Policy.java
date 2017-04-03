package test.interfaces;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * 
 * This class Policy with DateOfBeginning and DateOfEnd as Attributes
 * 
 * 
 * 
 * @author 227320
 *
 */
public class Policy implements AssuranceComponent {
	
	//private static final id = 1;

	private String name;
	private Calendar dateOfBeginning;
	private Calendar dateOfEnd;

	private List<Coverage> coverageList = new ArrayList<Coverage>();

	public Policy(String id, Calendar dateOfBeginning, Calendar dateOfEnd, List<Coverage> coverageList) {
		super();
		this.name = id;
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

	@Override
	public String getName() {
		return name;
	}

		
}