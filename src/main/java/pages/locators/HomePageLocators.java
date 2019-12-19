package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
		
	@FindBy(xpath = "//input[@name = 'postcode']")
	public WebElement postcodeInput;
	
	@FindBy(xpath = "//button[@type = 'submit']")
	public WebElement searchButton;
	
	@FindBy(xpath = "//div[@class = 'c-nav-container']/ul/li[2]/a")
	public WebElement loginButton;
	
	@FindBy(css = "#rc-anchor-container")
	public WebElement captchaMsg;
	
	@FindBy(css = "#recaptcha-anchor")
	public WebElement captchaBox;
	
}
