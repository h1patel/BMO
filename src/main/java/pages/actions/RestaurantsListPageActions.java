package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.locators.RestaurantsListPageLocators;
import utils.TestBase;

public class RestaurantsListPageActions {

	 RestaurantsListPageLocators restaurantsListPageLocators=null;

	public RestaurantsListPageActions(){
		this.restaurantsListPageLocators = new RestaurantsListPageLocators();
		PageFactory.initElements(TestBase.getDriver(), restaurantsListPageLocators);
	}

	public boolean seeSomeRestaurants(String postcode) throws Throwable {
		String address = restaurantsListPageLocators.areaPostCode.getText();
		if(address.toUpperCase().contains(postcode)) {
			if(restaurantsListPageLocators.someRestaurantsVisible.isDisplayed())
				return true;
		}
		return false;
	}

	public void searchRestaurants(String restaurantName) throws Throwable {
		restaurantsListPageLocators.dishSearch.sendKeys(restaurantName);
		restaurantsListPageLocators.searchButton.click();
	}

	public void sortByRating() throws Throwable {
		Actions action = new Actions(TestBase.getDriver()); 
		action.moveToElement(restaurantsListPageLocators.sortByIcon).perform();
		action.moveToElement(restaurantsListPageLocators.sortByRating).click().perform();
		action.build();
	}

	public void checkMenu() throws Throwable {
		restaurantsListPageLocators.topRatedRestaurant.click();
		TestBase.getDriver().wait(500);
	}

}
