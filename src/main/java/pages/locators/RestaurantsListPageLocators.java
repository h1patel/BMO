package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RestaurantsListPageLocators {

	@FindBy(xpath = "//*[@id='skipToMain']/main/div/div[1]/div/div[1]/div[2]/h1")
	public WebElement areaPostCode;
	
	@FindBy(xpath = "//div[@class='c-listing-loader']")
	public WebElement someRestaurantsVisible;
	
	@FindBy(css = "#dish-search")
	public WebElement dishSearch;
	
	@FindBy(xpath = "//button[@type = 'submit']")
	public WebElement searchButton;
	
	@FindBy(xpath = "//span[@class = 'u-showAboveMid']")
	public WebElement sortByIcon;
	
	@FindBy(css = "#Avg_Rating")
	public WebElement sortByRating;
			
	@FindBy(xpath = "//div[@class = 'c-listing c-listing--subsequent ']/div/section[1]/a")
	public WebElement topRatedRestaurantwithCommercial;
	
	@FindBy(xpath = "//div[@class = 'g-col g-span8--mid g-span9--wide c-sortBy']/div[4]/div/div/section[1]")
	public WebElement topRatedRestaurant;
}
