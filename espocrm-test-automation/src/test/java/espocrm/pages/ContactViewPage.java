package espocrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class ContactViewPage {
	
    private WebDriver driver;
	
	private By contactsNavigateLink = By.xpath("//a[text()='Contacts'][@data-action='navigateToRoot']");
	private By priyaAeronNavigteText = By.xpath("//div[text()='Priya Aeron'][@class='pull-left']");
	
	public ContactViewPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void isContactsPriyaDisplayed() {
		driver.findElement(contactsNavigateLink).isDisplayed();
		driver.findElement(priyaAeronNavigteText).isDisplayed();
		Reporter.log("Contacts >> Priya Aeron displayed successfully");
	}

}
