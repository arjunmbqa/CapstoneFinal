package espocrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class OpportunitiesViewPage {
	
    private WebDriver driver;
	
	private By opportunitiesNavigateLink = By.xpath("//a[text()='Opportunities'][@data-action='navigateToRoot']");
	private By riyaNavigteText = By.xpath("//div[text()='Riya'][@class='pull-left']");
	
	public OpportunitiesViewPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void isOpportunitiesRiyaDisplayed() {
		driver.findElement(opportunitiesNavigateLink).isDisplayed();
		driver.findElement(riyaNavigteText).isDisplayed();
		Reporter.log("Opportunities >> Riya displayed successfully");
	}

}
