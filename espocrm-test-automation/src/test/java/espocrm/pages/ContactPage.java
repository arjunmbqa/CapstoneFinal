package espocrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class ContactPage {
	
    private WebDriver driver;
	
	private By createContactButton = By.xpath("//a[@data-name='create']");
	
	public ContactPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickCreateContact() {
		driver.findElement(createContactButton).click();
		Reporter.log("Create Contact button clicked");
	}

}
