package espocrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class CampaignPage {
	
    private WebDriver driver;
	
	private By createCampaignButton = By.xpath("//a[@data-name='create']");
	
	public CampaignPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickCreateCampaign() {
		driver.findElement(createCampaignButton).click();
		Reporter.log("Create Campaign button clicked");
	}

}
