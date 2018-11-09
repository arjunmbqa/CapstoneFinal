package espocrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class MeetingPage {
	
    private WebDriver driver;
	
	private By createMeetingButton = By.xpath("//a[@data-name='create']");
	
	public MeetingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickCreateMeeting() {
		driver.findElement(createMeetingButton).click();
		Reporter.log("Create Meeting button clicked");
	}

}
