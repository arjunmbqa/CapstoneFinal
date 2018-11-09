package espocrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class TaskCreatePage {
	
    private WebDriver driver;
	
	By nameTextbox = By.name("name");
	By statusDropdown = By.name("status");
	By descriptionTextarea = By.xpath("//textarea[@name='description']");
	By saveButton = By.xpath("//button[@data-action='save']");
	
	public TaskCreatePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void fillName(String name) {
		driver.findElement(nameTextbox).sendKeys(name);
		Reporter.log("Value filled in name textbox");
	}
	
	public void selectStatus(String status) {
		Select select = new Select(driver.findElement(statusDropdown));
		select.selectByVisibleText(status);
		Reporter.log("Option selected in status dropdown");
	}
	
	public void fillDescription(String description) {
		driver.findElement(descriptionTextarea).sendKeys(description);
		Reporter.log("Value filled in username textbox");
	}
	
	public void clickSave() {
		driver.findElement(saveButton).click();
		Reporter.log("Save button clicked");
	}

}
