package test.interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Arrays;
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
		List<AssuranceComponent> assuranceComponentList = creator.getAllAssuranceComponents();

		System.out.println("PolicyConsolePrinter running!");

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
				Integer idList[] = { allIdAnnotation.id() };

				for (int z = 0; z < idList.length; z++) {

					for (int j = 0; j < idList.length - 1; j++) {

						if (z != j) {

							if (idList[z] == idList[j]) {

								idList[z] = 0;

							}
							
							int n = idList.length;

							for (int k = 0; k <= n - 1; k++) {

								if (idList[k] != 0) {

									System.out.println(idList[k]);

								}

							}


						}
						
						

					}
					

				}

				
			}
		}

	}

}