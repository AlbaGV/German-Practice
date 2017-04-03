package test.interfaces;

import java.util.Calendar;
import java.util.List;

/**
 * 
 * @author 227320
 *
 */

public class PolicyConsolePrinter {

	public static void main(String[] args) {

		int i = 0;
		int x = 0;
		PolicyCreator creator = new PolicyCreator();

		List<Policy> policyList = creator.getPolicyList();
		List<AssuranceComponent> assList = creator.getAllAssuranceComponents();

		System.out.println("PolicyConsolePrinter running!");

		System.out.println("Number of Policies: " + policyList.size());

		for (Policy policy : policyList) {
			i++;
			System.out.println("Policy n° " + i + " Date of beginning: "
					+ policy.getDateOfBeginning().get(Calendar.DATE) + "/"
					+ policy.getDateOfBeginning().get(Calendar.MONTH) + "/"
					+ policy.getDateOfBeginning().get(Calendar.YEAR)
					+ ", Date of end: "
					+ policy.getDateOfEnd().get(Calendar.DATE) + "/"
					+ policy.getDateOfEnd().get(Calendar.MONTH) + "/"
					+ policy.getDateOfEnd().get(Calendar.YEAR));

			for (Coverage coverage : policy.getCoverageList()) {
				x++;
				System.out.println("	Coverage n°: " + x + " , Prize: "
						+ coverage.getPrice() + " , Name: "
						+ coverage.getName());
			}
			x = 0;
		}

		System.out.println("List of names : ");

		for (AssuranceComponent assCom : assList) {
			System.out.println("NAME : " + assCom.getName());
		}

		// System.out.println(policyList);

	}

}