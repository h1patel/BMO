package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.HomePageLocators;
import utils.TestBase;

public class HomePageActions {

	HomePageLocators homePageLocators = null;

	public HomePageActions() {
		this.homePageLocators = new HomePageLocators();
		PageFactory.initElements(TestBase.getDriver(), homePageLocators);	// Initiate PageFactory
	}

// HomePage Actions
	
	public void enterPostCode(String postcode) {			//	Enter PostCode in textBox @ Home Page
		homePageLocators.postcodeInput.sendKeys(postcode);
	}

	public void clickOnSearch() {			// Click on Search Button @ Home Page
		homePageLocators.searchButton.click();
	}
	
	public void clickOnLogin() throws InterruptedException {			// Click on Login Link @ Home Page
		homePageLocators.loginButton.click();
	/*	Thread.sleep(500);
		if(homePageLocators.captchaMsg.isDisplayed()) {
			homePageLocators.captchaBox.click(); }
		Thread.sleep(100);
	*/	
	}

}
