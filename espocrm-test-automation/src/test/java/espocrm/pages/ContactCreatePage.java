package espocrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class ContactCreatePage {
	
private WebDriver driver;
	
	By titleNameDropdown = By.name("salutationName");
	By firstNameTextbox = By.name("firstName");
	By lastNameTextbox = By.name("lastName");
	By emailTextbox = By.xpath("//input[@type='email']");
	By phoneTypeDropdown = By.xpath("//select[@data-property-type='type']");
	By phoneTextbox = By.xpath("//input[@type='input']");
	By descriptionTextarea = By.xpath("//textarea[@name='description']");
	By saveButton = By.xpath("//button[text()='Save']");
	
	public ContactCreatePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selectTitleName(String titleName) {
		Select select = new Select(driver.findElement(titleNameDropdown));
		select.selectByVisibleText(titleName);
		Reporter.log("Option selected in title name dropdown");
	}
	
	public void fillFistName(String firstName) {
		driver.findElement(firstNameTextbox).sendKeys(firstName);
		Reporter.log("Value filled in first name textbox");
	}
	
	public void fillLastName(String lastName) {
		driver.findElement(lastNameTextbox).sendKeys(lastName);
		Reporter.log("Value filled in last name textbox");
	}
	
	public void fillEmail(String email) {
		driver.findElement(phoneTextbox).sendKeys(email);
		Reporter.log("Value filled in email textbox");
	}
	
	public void fillWebsite(String website) {
		driver.findElement(emailTextbox).sendKeys(website);
		Reporter.log("Value filled in website textbox");
	}
	
	public void selectPhoneType(String phoneType) {
		Select select = new Select(driver.findElement(phoneTypeDropdown));
		select.selectByVisibleText(phoneType);
		Reporter.log("Option selected in phone type dropdown");
	}
	
	public void fillPhone(String phone) {
		driver.findElement(phoneTextbox).sendKeys(phone);
		Reporter.log("Value filled in phone textbox");
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
