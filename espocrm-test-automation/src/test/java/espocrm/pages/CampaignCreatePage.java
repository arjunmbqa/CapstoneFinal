package espocrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class CampaignCreatePage {
	
private WebDriver driver;
	
	By nameTextbox = By.name("name");
	By typeDropdown = By.name("type");
	By descriptionTextarea = By.xpath("//textarea[@name='description']");
	By saveButton = By.xpath("//button[@data-action='save']");
	
	public CampaignCreatePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void fillName(String name) {
		driver.findElement(nameTextbox).sendKeys(name);
		Reporter.log("Value filled in name textbox");
	}
	
	public void selectType(String type) {
		Select select = new Select(driver.findElement(typeDropdown));
		select.selectByVisibleText(type);
		Reporter.log("Option selected in type dropdown");
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
