package test.arraylist;

import java.util.List;

/**
 * 
 * @author 033992
 *
 */

public class PolicyConsolePrinter {

	public static void main(String[] args) {

		// TODO Create to policys. The first one with only thirty party and the
		// second one with both coverages.
		// Then print them.
		PolicyCreator creator = new PolicyCreator();

		List<Policy> policyList = creator.getPolicyList();

		System.out.println("PolicyConsolePrinter running!");

		for (Policy policy : policyList) {
			System.out.println(policy);
		}

		int retval = policyList.size();

		System.out.println("Size of list = " + retval);

		// System.out.println(policyList);

	}

}