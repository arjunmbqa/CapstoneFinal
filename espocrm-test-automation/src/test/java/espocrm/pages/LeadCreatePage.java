package espocrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class LeadCreatePage {
	
    private WebDriver driver;
	
    By titleNameDropdown = By.name("salutationName");
	By firstNameTextbox = By.name("firstName");
	By lastNameTextbox = By.name("lastName");
	By accountNameTextbox = By.name("accountName");
	By emailTextbox = By.xpath("//input[@type='email']");
	By phoneTypeDropdown = By.xpath("//select[@data-property-type='type']");
	By phoneTextbox = By.xpath("//input[@type='input']");
	By titleTextbox = By.name("title");
	By websiteTextbox = By.name("website");
	By saveButton = By.xpath("//button[text()='Save']");
	
	public LeadCreatePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selectTitleName(String titleName) {
		Select select = new Select(driver.findElement(titleNameDropdown));
		select.selectByVisibleText(titleName);
		Reporter.log("Option selected in title name dropdown");
	}
	
	public void fillFirstName(String firstName) {
		driver.findElement(firstNameTextbox).sendKeys(firstName);
		Reporter.log("Value filled in first name textbox");
	}
	
	public void fillLastName(String lastName) {
		driver.findElement(lastNameTextbox).sendKeys(lastName);
		Reporter.log("Value filled in last name textbox");
	}
	
	public void fillAccountName(String accountName) {
		driver.findElement(accountNameTextbox).sendKeys(accountName);
		Reporter.log("Value filled in account name textbox");
	}
	
	public void fillEmail(String email) {
		driver.findElement(emailTextbox).sendKeys(email);
		Reporter.log("Value filled in email textbox");
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
	
	public void fillTitle(String title) {
		driver.findElement(titleTextbox).sendKeys(title);
		Reporter.log("Value filled in title textbox");
	}
	
	public void fillWebsite(String website) {
		driver.findElement(websiteTextbox).sendKeys(website);
		Reporter.log("Value filled in website textbox");
	}
	
	public void clickSave() {
		driver.findElement(saveButton).click();
		Reporter.log("Save button clicked");
	}

}
