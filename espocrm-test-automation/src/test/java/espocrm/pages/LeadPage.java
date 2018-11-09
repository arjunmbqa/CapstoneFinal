package espocrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class LeadPage {
	
    private WebDriver driver;
	
	private By createLeadButton = By.xpath("//a[@data-name='create']");
	
	public LeadPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickCreateLead() {
		driver.findElement(createLeadButton).click();
		Reporter.log("Create Lead button clicked");
	}

}
