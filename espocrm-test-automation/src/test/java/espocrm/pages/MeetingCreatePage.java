package espocrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class MeetingCreatePage {
	
    private WebDriver driver;
	
	By nameTextbox = By.name("name");
	By dateStartTextbox = By.name("dateStart");
	By dateEndTextbox = By.name("dateEnd");
	By saveButton = By.xpath("//button[@data-action='save']");
	
	public MeetingCreatePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void fillName(String name) {
		driver.findElement(nameTextbox).sendKeys(name);
		Reporter.log("Value filled in name textbox");
	}
	
	public void fillDateStart(String dateStart) {
		driver.findElement(dateStartTextbox).sendKeys(dateStart);
		Reporter.log("Value filled in date start textbox");
	}
	
	public void fillDateEnd(String dateEnd) {
		driver.findElement(dateEndTextbox).sendKeys(dateEnd);
		Reporter.log("Value filled in date end textbox");
	}
	
	public void clickSave() {
		driver.findElement(saveButton).click();
		Reporter.log("Save button clicked");
	}

}
