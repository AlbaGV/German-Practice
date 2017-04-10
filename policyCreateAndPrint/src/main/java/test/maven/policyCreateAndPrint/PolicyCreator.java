package test.maven.policyCreateAndPrint;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;

import test.maven.policyData.AllRisks;
import test.maven.policyData.AssuranceComponent;
import test.maven.policyData.Car;
import test.maven.policyData.Coverage;
import test.maven.policyData.Policy;
import test.maven.policyData.Risk;
import test.maven.policyData.ThirdParty;

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
			for (Coverage coverage : policy.getCoverageList()) {
				assList.add(coverage);
				for (Risk risk : coverage.getRiskList()) {
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

		Coverage coverage1 = createThirdParty(createRisk("3"), 1500, "Third-Party", 200);
		coverages.add(coverage1);

		LocalDate dateOfBeginning = new LocalDate(2005, 03, 30);
		LocalDate dateOfEnd = new LocalDate(2015, 03, 30);
		Policy policy1 = new Policy(dateOfBeginning, dateOfEnd, coverages);
		return policy1;

	}

	private Policy createPolicy2() {

		List<Coverage> coverages = new ArrayList<Coverage>();

		Coverage coverage1 = createAllRisk(createRisk("1"), 2000, "All-Risk", 500);
		Coverage coverage2 = createThirdParty(createRisk("2"), 1500, "Third-Party", 500);
		coverages.add(coverage1);
		coverages.add(coverage2);


		LocalDate dateOfBeginning = new LocalDate(2007, 03, 30);
		LocalDate dateOfEnd = new LocalDate(2017, 03, 29);

		Policy policy2 = new Policy(dateOfBeginning, dateOfEnd, coverages);
		return policy2;

	}

	private Risk createRisk(String name) {
		Risk risk1 = new Car(name);
		return risk1;

	}

	private Coverage createAllRisk(Risk risk1, double price, String name, double excess) {
		List<Risk> riskList = new ArrayList<Risk>();

		riskList.add(risk1);

		Coverage coverage1 = new AllRisks(riskList, price, name, excess);

		return coverage1;

	}

	private Coverage createThirdParty(Risk risk1, double price, String name, double maximumCoverage) {
		List<Risk> riskList = new ArrayList<Risk>();

		riskList.add(risk1);

		Coverage coverage1 = new ThirdParty(riskList, price, name, maximumCoverage);

		return coverage1;

	}

}