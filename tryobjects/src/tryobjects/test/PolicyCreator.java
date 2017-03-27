package tryobjects.test;


/**
 * 
 * @author 033992
 *
 */
// TODO Separate concerns!
public class PolicyCreator {

	

	public static void createPolicy (){
		
		AllRisks coverage1 = new AllRisks(1000.5);



		ThirdParty coverage2 = new ThirdParty(10010.09);

		
		Policy policy1 = new Policy("10-10-2010","10-10-2010",coverage1,coverage2);
		


	}
}