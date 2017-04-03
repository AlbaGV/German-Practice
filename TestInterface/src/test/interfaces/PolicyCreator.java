package test.interfaces;

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

	public List<AssuranceComponent> getAllAssuranceComponents() {
		List<AssuranceComponent> assList = new ArrayList<AssuranceComponent>();
		for (Policy policy : policyList) {
			assList.add(policy);
			List<Coverage> coverageList = policy.getCoverageList();
			for (Coverage coverage : coverageList) {
				assList.add(coverage);
				List<Risk> riskList = coverage.getRiskList();
				for (Risk risk : riskList) {
					assList.add(risk);
				}
			}
		}
		return assList;
	}

	private void createList() {
		policyList.add(createPolicy1());
		policyList.add(createPolicy2());
	}

	private Policy createPolicy1() {

		List<Coverage> coverages = new ArrayList<Coverage>();

		Coverage coverage1 = createThirdParty(createRisk("3"), 50, 1500, "Third-Party", 200);
		coverages.add(coverage1);

		Calendar dateOfBeginning = new GregorianCalendar(2005, 03, 30);
		Calendar dateOfEnd = new GregorianCalendar(2015, 03, 30);
		Policy policy1 = new Policy("1", dateOfBeginning, dateOfEnd, coverages);
		return policy1;

	}

	private Policy createPolicy2() {

		List<Coverage> coverages = new ArrayList<Coverage>();

		Coverage coverage1 = createAllRisk(createRisk("1"), 20, 2000, "All-Risk", 500);
		Coverage coverage2 = createThirdParty(createRisk("2"), 10, 1500, "Third-Party", 500);
		coverages.add(coverage1);
		coverages.add(coverage2);

		Calendar dateOfBeginning = new GregorianCalendar(2007, 03, 30);
		Calendar dateOfEnd = new GregorianCalendar(2017, 03, 29);

		Policy policy2 = new Policy("2", dateOfBeginning, dateOfEnd, coverages);
		return policy2;

	}

	private Risk createRisk(String name) {
		Risk risk1 = new Car(name);
		return risk1;

	}

	private Coverage createAllRisk(Risk risk1, int id, double price, String name, double excess) {
		List<Risk> riskList = new ArrayList<Risk>();

		riskList.add(risk1);

		Coverage coverage1 = new AllRisks(riskList, id, price, name, excess);

		return coverage1;

	}

	private Coverage createThirdParty(Risk risk1, int id, double price, String name, double maximumCoverage) {
		List<Risk> riskList = new ArrayList<Risk>();

		riskList.add(risk1);

		Coverage coverage1 = new ThirdParty(riskList, id, price, name, maximumCoverage);

		return coverage1;

	}

}