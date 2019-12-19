package steps;

import cucumber.api.java.After;
import utils.TestBase;

public class AfterActions {
	
	@After
	public static void tearDown(){
         
		TestBase.tearDown();
	}

}
