package tryobjects.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author 033992
 *
 */
public class PolicyCreator {

	public static Policy createPolicy() {

		AllRisks coverage1 = PolicyCreator.createAllRisks();

		ThirdParty coverage2 = PolicyCreator.createThirdParty();
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String preDateOfBeginning = "07/06/2013";
        String preDateOfEnd = "07/06/2017";


		
        try {

            Date dateOfBeginning = formatter.parse(preDateOfBeginning);
            Date dateOfEnd = formatter.parse(preDateOfEnd);
    		Policy policy1 = new Policy(dateOfBeginning, dateOfEnd, coverage1,
    				coverage2);

    		return policy1;

        } catch (ParseException e) {
            e.printStackTrace();
        	return null;
        }

	}

	public static AllRisks createAllRisks() {

		AllRisks coverage1 = new AllRisks(1000.5);

		return coverage1;

	}

	public static ThirdParty createThirdParty() {

		ThirdParty coverage2 = new ThirdParty(10010.09);

		return coverage2;

	}
}