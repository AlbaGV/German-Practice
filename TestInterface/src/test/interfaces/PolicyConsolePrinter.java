package test.interfaces;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * 
 * @author 227320
 *
 */

public class PolicyConsolePrinter {

	// TODO Methods should not have more than 15 Lines of code!! Split them in some methods!
	public static void main(String[] args) {

		int i = 0;
		int x = 0;

		PolicyCreator creator = new PolicyCreator();

		List<Policy> policyList = creator.getPolicyList();
		List<AssuranceComponent> assuranceComponentList = creator.getAllAssuranceComponents();
		List<Integer> idList = new ArrayList<Integer>();

		System.out.println("Number of Policies: " + policyList.size());

		for (Policy policy : policyList) {
			i++;
			System.out.println("Policy n° " + i + " Date of beginning: " + policy.getDateOfBeginning().get(Calendar.DATE) + "/"
					+ policy.getDateOfBeginning().get(Calendar.MONTH) + "/" + policy.getDateOfBeginning().get(Calendar.YEAR) + ", Date of end: "
					+ policy.getDateOfEnd().get(Calendar.DATE) + "/" + policy.getDateOfEnd().get(Calendar.MONTH) + "/"
					+ policy.getDateOfEnd().get(Calendar.YEAR));

			for (Coverage coverage : policy.getCoverageList()) {
				x++;
				System.out.println("	Coverage n°: " + x + " , Prize: " + coverage.getPrice() + " , Name: " + coverage.getId());
			}
			x = 0;
		}

		System.out.println("List of IDs : ");
		for (AssuranceComponent assCom : assuranceComponentList) {
			Class<?> idClass = assCom.getClass();
			if (idClass.isAnnotationPresent(IdAnnotation.class)) {
				IdAnnotation allIdAnnotation = idClass.getAnnotation(IdAnnotation.class);
				// System.out.println(allIdAnnotation.id());
				// int idList[] = { allIdAnnotation.id() };

				idList.add(allIdAnnotation.id());

				for (int z = 0; z < idList.size(); z++) {

					for (int j = 0; j < idList.size() - 1; j++) {

						if (z != j) {

							if (idList.get(z) == idList.get(j)) {

								idList.remove(z);

							}

						}

					}

				}

			}

		}
		for (Integer show : idList) {

			System.out.println(show);

		}

	}

}