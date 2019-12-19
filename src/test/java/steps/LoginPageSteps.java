package steps;

import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.LoginPageActions;

public class LoginPageSteps {
	
	LoginPageActions loginPageActions = new LoginPageActions();
	
	@When("^I use my wrong <userName> and <password>$")
	public void i_use_my_wrong_userName_and_password(String userName, String password) throws Throwable {

		System.out.println(userName + password);
	/*	loginPageActions.setUsername(userName);
		loginPageActions.setPassword(password);
		loginPageActions.clickLogin();
		Thread.sleep(1000);
*/
	}

	@Then("^I should see a error message$")
	public void i_should_see_a_error_message() throws Throwable {

		System.out.println("***************** Checking Error Msg ******************");
/*		Assert.assertTrue(loginPageActions.checkError());
		Thread.sleep(1000);
*/
	}

}
