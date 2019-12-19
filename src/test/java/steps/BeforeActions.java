package steps;

import cucumber.api.java.Before;
import utils.TestBase;

public class BeforeActions {
	
	@Before
	public static void setUp(){
		
		TestBase.setUpDriver();
		
	}

}
