package test.arraylist;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * 
 * @author 227320
 *
 */
public class PolicyCreator {

	private List<Policy> policyList = new ArrayList<Policy>();

	public PolicyCreator() {
		super();
		createList();
	}

	public List<Policy> getPolicyList() {
		return policyList;
	}

	private void createList() {
		Policy policy1 = createPolicy1();
		Policy policy2 = createPolicy2();
		policyList.add(policy1);
		policyList.add(policy2);
	}

	private Policy createPolicy1() {

		List<Coverage> coverages = new ArrayList<Coverage>();

		ThirdParty coverage1 = new ThirdParty(1000, "Third Party", 200);

		coverages.add(coverage1);

		Calendar dateOfBeginning = new GregorianCalendar(2005, 03, 30);
		Calendar dateOfEnd = new GregorianCalendar(2015, 03, 30);
		Policy policy1 = new Policy(1, dateOfBeginning, dateOfEnd, coverages);
		return policy1;

	}

	private Policy createPolicy2() {

		List<Coverage> coverages = new ArrayList<Coverage>();

		Coverage coverage1 = new AllRisks(2000, "All Risk", 500);
		Coverage coverage2 = new ThirdParty(1500, "Third party", 100);
		coverages.add(coverage1);
		coverages.add(coverage2);

		Calendar dateOfBeginning = new GregorianCalendar(2007, 03, 30);
		Calendar dateOfEnd = new GregorianCalendar(2017, 03, 29);

		Policy policy2 = new Policy(2, dateOfBeginning, dateOfEnd, coverages);
		return policy2;

	}

}