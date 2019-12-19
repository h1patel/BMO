package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	
	@FindBy(css = "#Email")
	public WebElement emailInput;
	
	@FindBy(css = "#Password")
	public WebElement passwordInput;
	
	@FindBy(xpath = "//input[@type = 'submit']")
	public WebElement loginButton;
	
	@FindBy(xpath = "//*[@id='login']/div[1]/ul/li")
	public WebElement errorMessage;
	
}
