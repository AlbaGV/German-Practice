package tryobjects.test;



/**
 * 
 * @author 033992
 *
 */

public class PolicyConsolePrinter {

	public static void main(String[] args) {
		


		System.out.println("PolicyConsolePrinter running!");

		Policy policy1 = PolicyCreator.createPolicy();

		AllRisks coverage1 = PolicyCreator.createAllRisks();

		ThirdParty coverage2 = PolicyCreator.createThirdParty();

		System.out.println(policy1);

		System.out.println(coverage1);

		System.out.println(coverage2);

	}

}