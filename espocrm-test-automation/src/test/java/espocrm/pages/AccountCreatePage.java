package espocrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class AccountCreatePage {
	
	private WebDriver driver;
	
	By nameTextbox = By.name("name");
	By emailTextbox = By.xpath("//input[@type='email']");
	By phoneTypeDropdown = By.xpath("//select[@class='form-control']");
	By phoneTextbox = By.xpath("//input[@class='form-control phone-number no-margin-shifting']");
	By websiteTextbox = By.name("website");
	By saveButton = By.xpath("//button[@data-action='save']");
	
	public AccountCreatePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void fillName(String name) {
		driver.findElement(nameTextbox).sendKeys(name);
		Reporter.log("Value filled in name textbox");
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
	
	public void fillWebsite(String website) {
		driver.findElement(websiteTextbox).sendKeys(website);
		Reporter.log("Value filled in website textbox");
	}
	
	public void clickSave() {
		driver.findElement(saveButton).click();
		Reporter.log("Save button clicked");
	}
	
}
