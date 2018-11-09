package espocrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class CallViewPage {
	
    private WebDriver driver;
	
	private By callsNavigateLink = By.xpath("//a[text()='Calls'][@data-action='navigateToRoot']");
	private By clientNavigteText = By.xpath("//div[text()='Client'][@class='pull-left']");
	
	public CallViewPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void isCallsClientDisplayed() {
		driver.findElement(callsNavigateLink).isDisplayed();
		driver.findElement(clientNavigteText).isDisplayed();
		Reporter.log("Calls >> Client displayed successfully");
	}
	
}
