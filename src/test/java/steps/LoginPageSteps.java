package steps;

import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.LoginPageActions;

public class LoginPageSteps {
	
	LoginPageActions loginPageActions = new LoginPageActions();
	
	@When("^I use my \"([^\"]*)\" and \"([^\"]*)\" to login$")
	public void i_use_my_and_to_login(String userName, String password) throws Throwable {

		try {
			loginPageActions.setUsername(userName);
			loginPageActions.setPassword(password);
			loginPageActions.clickLogin();
		} catch (Exception e) {
			System.out.println("------------------------------------------------------------");
			System.out.println("----------------------CAPTCHA MSG---------------------------");
			System.out.println("UserName is - " + userName + " and Password is - " + password);
		}

	}

	@Then("^I should see a error message$")
	public void i_should_see_a_error_message() throws Throwable {

		try {
			Assert.assertTrue(loginPageActions.checkError());
		} catch (Exception e) {
			System.out.println("********************* ErrorChecked Msg *********************");
			System.out.println("------------------------------------------------------------");
			
		}

	}

}
