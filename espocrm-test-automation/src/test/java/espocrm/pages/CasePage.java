package espocrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class CasePage {

	private WebDriver driver;
	
	private By createCaseButton = By.xpath("//a[@data-name='create']");
	
	public CasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickCreateCase() {
		driver.findElement(createCaseButton).click();
		Reporter.log("Create Case button clicked");
		
	}	
}
