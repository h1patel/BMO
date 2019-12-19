package steps;

import org.testng.Assert;
import cucumber.api.java.en.Then;
import pages.actions.RestaurantsListPageActions;

public class RestaurantsListPageSteps {
	
	RestaurantsListPageActions restaurantsListPageActions = new RestaurantsListPageActions();

	@Then("^I should see some restaurants in \"([^\"]*)\"$")
	public void i_should_see_some_restaurants_in(String postcode) throws Throwable {
		
		Assert.assertTrue(restaurantsListPageActions.seeSomeRestaurants(postcode));
	
	}

	@Then("^I should be able to search for my favourite \"([^\"]*)\" restaurants from the list$")
	public void i_should_be_able_to_search_for_my_favourite_restaurants_from_the_list(String restaurantName) throws Throwable {

		restaurantsListPageActions.searchRestaurants(restaurantName);

	}

	@Then("^I want to be able to sort the restaurants as per Customer rating$")
	public void i_want_to_be_able_to_sort_the_restaurants_as_per() throws Throwable {

		restaurantsListPageActions.sortByRating();
	
	}

	@Then("^I want to view menu of the restaurant with highest rating$")
	public void i_want_to_order_from_the_restaurant_with_highest_ratings_and_delivery(String arg1) throws Throwable {
	   
		restaurantsListPageActions.checkMenu();
	}
	
}
