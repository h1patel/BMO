package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.LoginPageLocators;
import utils.TestBase;

public class LoginPageActions {

	LoginPageLocators loginPageLocators = null;

	public LoginPageActions() {
		this.loginPageLocators = new LoginPageLocators();
		PageFactory.initElements(TestBase.getDriver(), loginPageLocators);
	}

	public void setUsername(String userName) {
		loginPageLocators.emailInput.sendKeys(userName);
	}

	public void setPassword(String passWord) {
		loginPageLocators.passwordInput.sendKeys(passWord);
	}

	public void clickLogin() {
		loginPageLocators.loginButton.click();
	}

	public boolean checkError() {
		return loginPageLocators.errorMessage.isDisplayed();
	}

}
