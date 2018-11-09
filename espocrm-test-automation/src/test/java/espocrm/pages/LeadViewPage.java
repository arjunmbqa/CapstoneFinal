package espocrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class LeadViewPage {
	
    private WebDriver driver;
	
	private By leadsNavigateLink = By.xpath("//a[text()='Leads'][@data-action='navigateToRoot']");
	private By abhaySharmaNavigteText = By.xpath("//div[text()='Abhay Sharma'][@class='pull-left']");
	
	public LeadViewPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void isLeadsAbhaySharmaDisplayed() {
		driver.findElement(leadsNavigateLink).isDisplayed();
		driver.findElement(abhaySharmaNavigteText).isDisplayed();
		Reporter.log("Leads >> Abhay Sharma displayed successfully");
	}

}
