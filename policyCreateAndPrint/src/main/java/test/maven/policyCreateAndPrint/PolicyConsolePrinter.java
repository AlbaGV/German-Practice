package test.maven.policyCreateAndPrint;

import java.util.ArrayList;
import java.util.List;

import test.maven.policyData.AssuranceComponent;
import test.maven.policyData.Coverage;
import test.maven.policyData.IdAnnotation;
import test.maven.policyData.Policy;

/**
 * 
 * @author 227320
 *
 */

public class PolicyConsolePrinter {

	public static void main(String[] args) {

		PolicyCreator creator = new PolicyCreator();
		List<AssuranceComponent> assuranceComponentList = creator.getAllAssuranceComponents();

		List<Policy> policyList = creator.getPolicyList();

		List<Integer> idList = new ArrayList<Integer>();

		System.out.println("Number of Policies: " + policyList.size());

		System.out.println(printAll(policyList));

		System.out.println("List of IDs : ");

		for (Integer id : createIdList(idList, assuranceComponentList)) {

			System.out.println(id);

		}

	}

	private static String policyInformation(Policy policy) {

		String policyInformation = "Policy/////Date of beginning: " + policy.getDateOfBeginning().getDayOfMonth() + "/"
				+ policy.getDateOfBeginning().getMonthOfYear() + "/" + policy.getDateOfBeginning().getYear() + ", Date of end: "
				+ policy.getDateOfEnd().getDayOfMonth() + "/" + policy.getDateOfEnd().getMonthOfYear() + "/" + policy.getDateOfEnd().getYear() + "\n";
		return policyInformation;
	}

	private static String coverageInformation(Coverage coverage) {

		String coverageInformation = "     Coverage//////Prize: " + coverage.getPrice() + " , Name: " + coverage.getId() + "\n";

		return coverageInformation;
	}

	private static List<String> printAll(List<Policy> policyList) {
		List<String> allInformation = new ArrayList<String>();
		for (Policy policy : policyList) {
			allInformation.add(policyInformation(policy));

			for (Coverage coverage : policy.getCoverageList()) {
				allInformation.add(coverageInformation(coverage));
			}

		}
		return allInformation;
	}

	private static List<Integer> filter(List<Integer> idList, int id) {
		idList.add(id);

		for (int z = 0; z < idList.size(); z++) {

			for (int j = 0; j < idList.size() - 1; j++) {

				if (z != j) {

					if (idList.get(z) == idList.get(j)) {

						idList.remove(z);

					}

				}

			}

		}
		return idList;
	}

	private static List<Integer> createIdList(List<Integer> idList, List<AssuranceComponent> assuranceComponentList) {
		for (AssuranceComponent assCom : assuranceComponentList) {
			Class<?> idClass = assCom.getClass();
			if (idClass.isAnnotationPresent(IdAnnotation.class)) {
				IdAnnotation allIdAnnotation = idClass.getAnnotation(IdAnnotation.class);
				int id = allIdAnnotation.id();
				filter(idList, id);

			}
		}
		return idList;
	}

}