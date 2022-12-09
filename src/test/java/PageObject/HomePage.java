package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;

	By link_NewCustomer = By.linkText("New Customer");
	By textbx_customerName = By.xpath("//input[@name='name']");
	By radio_Gender = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]");


	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickNewCutomer() {
		driver.findElement(link_NewCustomer).click();
	}
	
	public void setCustomerName(String customerName) {
		driver.findElement(textbx_customerName).sendKeys(customerName);
	}
	
	public void clickGender() {
		driver.findElement(radio_Gender).click();

	}

}
