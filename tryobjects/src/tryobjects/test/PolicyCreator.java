package tryobjects.test;

/**
 * 
 * @author 033992
 *
 */
// TODO Separate concerns!
public class PolicyCreator {

	public static void main(String[] Args) {
		
		Coverage coverage1 = new Coverage(1.567, "Obligatory");


		Coverage coverage2 = new Coverage(1.0009, "Third-party");


		Policy policy1 = new Policy("03/03/2005",coverage1, "01/07/2015");

		

	}

}