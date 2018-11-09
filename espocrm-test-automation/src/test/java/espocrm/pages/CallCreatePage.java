package espocrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class CallCreatePage {
	
    private WebDriver driver;
	
	By nameTextbox = By.name("name");
	By dateStartTextbox = By.name("dateStart");
	By descriptionTextarea = By.xpath("//textarea[@name='description']");
	By saveButton = By.xpath("//button[@data-action='save']");
	
	public CallCreatePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void fillName(String name) {
		driver.findElement(nameTextbox).sendKeys(name);
		Reporter.log("Value filled in name textbox");
	}
	
	public void fillDateStart(String dateStart) {
		driver.findElement(dateStartTextbox).sendKeys(dateStart);
		Reporter.log("Value filled in dateStart textbox");
	}
	
	public void fillDescription(String description) {
		driver.findElement(descriptionTextarea).sendKeys(description);
		Reporter.log("Value filled in description textbox");
	}
	
	public void clickSave() {
		driver.findElement(saveButton).click();
		Reporter.log("Save button clicked");
	}

}
