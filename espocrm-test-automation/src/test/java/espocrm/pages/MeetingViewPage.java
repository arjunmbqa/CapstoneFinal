package espocrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class MeetingViewPage {
	
    private WebDriver driver;
	
	private By meetingsNavigateLink = By.xpath("//a[text()='Meetings'][@data-action='navigateToRoot']");
	private By planningNavigteText = By.xpath("//div[text()='Planning'][@class='pull-left']");
	
	public MeetingViewPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void isMeetingsPlanningDisplayed() {
		driver.findElement(meetingsNavigateLink).isDisplayed();
		driver.findElement(planningNavigteText).isDisplayed();
		Reporter.log("Meetings >> Planning displayed successfully");
	}

}
