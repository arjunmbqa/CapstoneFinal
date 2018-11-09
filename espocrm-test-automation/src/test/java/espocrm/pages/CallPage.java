package espocrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class CallPage {
	
    private WebDriver driver;
	
	private By createCallButton = By.xpath("//a[@data-name='create']");
	
	public CallPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickCreateCall() {
		driver.findElement(createCallButton).click();
		Reporter.log("Create Call button clicked");
	}
	
}
