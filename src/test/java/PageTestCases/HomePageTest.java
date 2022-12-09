package PageTestCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Config.properties;
import PageObject.HomePage;
import PageObject.LogInPage;

public class HomePageTest {
	
	WebDriver driver;
	
	private static final Logger logger = LogManager.getLogger(LogInPageTest.class);
	
	@BeforeTest
	public void setup() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\OnlineClasses\\AutomationmorningBatch\\SeleniumFramework\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.get(properties.readAppURL());
		Thread.sleep(5000);
	}
	
	
	@Test
	public void verifyHomePageTitle() throws IOException {		
		LogInPage lp = new LogInPage(driver);		
		lp.setUserName(properties.readUserName());	
		logger.info("this is info");
		logger.error("this is error");
		logger.fatal("this is fatal");
		logger.warn("this is warn");
		logger.debug("this is debug");
		lp.setPassword(properties.readPassword());
		lp.clickLogin();
		
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "Gtpl Bank New Customer Entry Page";
		Assert.assertEquals(actualPageTitle, expectedPageTitle);	
	}
	
	@Test
	public void enterNewCustomerInfo() throws IOException {
		LogInPage lp = new LogInPage(driver);		
		lp.setUserName(properties.readUserName());		
		lp.setPassword(properties.readPassword());
		lp.clickLogin();
		
		HomePage hp = new HomePage(driver);
		hp.clickNewCutomer();
		hp.setCustomerName("java");
		hp.clickGender();
		
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
	

}
