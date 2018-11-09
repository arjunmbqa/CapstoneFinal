package espocrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class CaseCreatePage {
	
	private WebDriver driver;
	
	By nameTextbox = By.name("name");
	By statusDropdown = By.name("status");
	By accountTextbox = By.name("accountName");
	By priorityDropdown = By.name("priority");
	By typeDropdown = By.name("type");
	By descriptionArea = By.xpath("//textarea[@name='description']");
	By saveButton = By.xpath("//button[@data-action='save']");
	
	public CaseCreatePage(WebDriver driver) {
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
	
	public void fillAccount(String account) {
		driver.findElement(accountTextbox).sendKeys(account);
		Reporter.log("Value filled in account textbox");
	}
	
	public void selectPriority(String priority) {
		Select select = new Select(driver.findElement(priorityDropdown));
		select.selectByVisibleText(priority);
		Reporter.log("Option selected in priority dropdown");
	}
	
	public void selectType(String type) {
		Select select = new Select(driver.findElement(typeDropdown));
		select.selectByVisibleText(type);
		Reporter.log("Option selected in type dropdown");
	}
	
	public void fillDescription(String description) {
		driver.findElement(descriptionArea).sendKeys(description);
		Reporter.log("Value filled in description textbox");
	}
	
	public void clickSave() {
		driver.findElement(saveButton).click();
		Reporter.log("Save button clicked");
	}

}

