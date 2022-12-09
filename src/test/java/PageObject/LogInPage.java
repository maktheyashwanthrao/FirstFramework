package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {

	WebDriver driver;

	By textbox_userId = By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input");
	By textbox_password = By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input");
	By button_login = By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]");

	public LogInPage(WebDriver driver) {
		this.driver = driver;
	}

	public void setUserName(String username) {
		driver.findElement(textbox_userId).sendKeys(username);

	}

	public void setPassword(String password) {
		driver.findElement(textbox_password).sendKeys(password);

	}

	public void clickLogin() {
		driver.findElement(button_login).click();

	}

}
