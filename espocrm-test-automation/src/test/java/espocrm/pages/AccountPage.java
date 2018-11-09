package espocrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class AccountPage {
	
	private WebDriver driver;
	
	private By createAccountButton = By.xpath("//a[@data-name='create']");
	
	public AccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickCreateAccount() {
		driver.findElement(createAccountButton).click();
		Reporter.log("Create Account button clicked");
	}
	
}
