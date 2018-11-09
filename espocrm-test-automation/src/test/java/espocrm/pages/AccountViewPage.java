package espocrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class AccountViewPage {
	
	private WebDriver driver;
	
	private By accountsNavigateLink = By.xpath("//a[text()='Accounts'][@data-action='navigateToRoot']");
	private By preetyNavigteText = By.xpath("//div[text()='Preety'][@class='pull-left']");
	
	public AccountViewPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void isAccountsPreetyDaisplayed() {
		driver.findElement(accountsNavigateLink).isDisplayed();
		driver.findElement(preetyNavigteText).isDisplayed();
		Reporter.log("Accounts >> Preety displayed successfully");
	}

}
