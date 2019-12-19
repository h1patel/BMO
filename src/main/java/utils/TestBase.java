package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	
	private static TestBase testBase;
	
	//init WebDriver
	private static WebDriver driver;
	
	private TestBase(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		}
	
	public static void openPage(String url){
		driver.get(url);
	}
	
	public static WebDriver getDriver(){
		return driver;
	}
	
	public static void setUpDriver(){
		if(testBase==null){
			testBase = new TestBase();
		}
	}
	
	public static void tearDown(){
		if(driver !=null){
			driver.close();
			driver.quit();
		}
		testBase = null;
	}

}
