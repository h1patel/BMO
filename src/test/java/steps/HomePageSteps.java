package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.actions.HomePageActions;

public class HomePageSteps {

	HomePageActions homePageActions = new HomePageActions();

	@Given("^I want to login to my user account$")
	public void i_want_to_login_to_my_user_account() throws Throwable {
		homePageActions.clickOnLogin();
	}

	@Given("^I want food in \"([^\"]*)\"$")
	public void i_want_food_in(String postCode) throws InterruptedException {
		homePageActions.enterPostCode(postCode);
	}

	@When("^I search for restaurants$")
	public void i_search_for_restaurants() throws Throwable {
		homePageActions.clickOnSearch();
	}

}
