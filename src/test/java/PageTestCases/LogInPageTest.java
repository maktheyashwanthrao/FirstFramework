package PageTestCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Config.properties;
import PageObject.LogInPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class LogInPageTest {
	
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.hmtl");

	private static final Logger logger = LogManager.getLogger(LogInPageTest.class);

	public WebDriver driver;

	@BeforeTest
	public void reportsetup() {
		
		extent.attachReporter(spark);
	}

	@Test
	public void VerifyLoginPageTitle1() throws IOException {
		ExtentTest test = extent.createTest("VerifyLoginPagae Title").assignAuthor("Yashwanth").assignCategory("Regression").assignDevice("Chrome");
	
		test.pass("This is test cases is passed");
		
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "GTPL Bank Home Page";
		
		

	}

	@Test
	public void VerifyLoginPageTitle2() throws IOException {
		ExtentTest test = extent.createTest("Login test").assignAuthor("Rao").assignCategory("regression")
				.assignDevice("Android");
		test.info("title verified");
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "GTPL Bank Home Page";
		Assert.assertEquals(actualPageTitle, expectedPageTitle);

	}

	@Test
	public void VerifyLoginPageTitle3() throws IOException {
		ExtentTest test = extent.createTest("Login test").assignAuthor("Rao").assignCategory("smoke")
				.assignDevice("Chrome");
		test.warning("title verified");
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "GTPL Bank Home Page1";
		Assert.assertEquals(actualPageTitle, expectedPageTitle);

	}

	@Test
	public void VerifyLoginPageTitle4() throws IOException {
		ExtentTest test = extent.createTest("Login test").assignAuthor("Rao").assignCategory("smoke")
				.assignDevice("Chrome");
		test.fail("title verified");
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "GTPL Bank Home Page1";
		Assert.assertEquals(actualPageTitle, expectedPageTitle);

	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\OnlineClasses\\AutomationmorningBatch\\SeleniumFramework\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(properties.readAppURL());
		Thread.sleep(5000);
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();

	}

	@AfterTest
	public void flushreport() {
		extent.flush();
	}

}
