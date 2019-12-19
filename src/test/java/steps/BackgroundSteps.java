package steps;

import cucumber.api.java.en.Given;
import utils.TestBase;

public class BackgroundSteps {

	@Given("^I am on the \"([^\"]*)\" Just-Eat homepage$")
	public void i_am_on_the_Just_Eat_homepage(String URL) throws Throwable {
		TestBase.openPage(URL);
	}
	
}
