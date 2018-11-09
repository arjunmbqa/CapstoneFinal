package espocrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class OpportunitiesPage {
	
    private WebDriver driver;
	
	private By createOpportunityButton = By.xpath("//a[@data-name='create']");
	
	public OpportunitiesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickCreateOpportunity() {
		driver.findElement(createOpportunityButton).click();
		Reporter.log("Create Opportunity button clicked");
	}

}
