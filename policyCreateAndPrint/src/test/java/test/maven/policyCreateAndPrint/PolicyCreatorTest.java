package test.maven.policyCreateAndPrint;


import test.maven.policyCreateAndPrint.PolicyCreator;
import junit.framework.TestCase;
/**
 * Class for testing PolicyCreator
 * @author 227320
 *
 */
public class PolicyCreatorTest  extends TestCase{


	public void testGetPolicyCreator() {
		PolicyCreator creator = new PolicyCreator();
		assertFalse(creator.getPolicyList().isEmpty());
	}

}
