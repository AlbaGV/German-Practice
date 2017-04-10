package test.interfaces;


import static org.junit.Assert.*;


import org.junit.Test;
/**
 * Class for testing PolicyCreator
 * @author 227320
 *
 */
public class PolicyCreatorTest {

	@Test
	public void testGetPolicyCreator() {
		PolicyCreator creator = new PolicyCreator();
		assertFalse(creator.getPolicyList().isEmpty());
	}

}
