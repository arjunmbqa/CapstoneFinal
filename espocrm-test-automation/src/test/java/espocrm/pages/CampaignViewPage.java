package espocrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class CampaignViewPage {
	
    private WebDriver driver;
	
	private By campaignsNavigateLink = By.xpath("//a[text()='Campaigns'][@data-action='navigateToRoot']");
	private By secondNavigteText = By.xpath("//div[text()='Second'][@class='pull-left']");
	
	public CampaignViewPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void isCampaignsSecondDisplayed() {
		driver.findElement(campaignsNavigateLink).isDisplayed();
		driver.findElement(secondNavigteText).isDisplayed();
		Reporter.log("Campaigns >> Second displayed successfully");
	}

}
