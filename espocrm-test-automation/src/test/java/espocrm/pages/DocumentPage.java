package espocrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class DocumentPage {
	
    private WebDriver driver;
	
	private By createDocumentButton = By.xpath("//a[@data-name='quickCreate']");
	private By fileInput = By.xpath("//input[@type='file']");
	private By nameTextbox = By.name("name");
	private By descriptionTextarea = By.xpath("//textarea[@name='description']");
	private By saveButton = By.xpath("//button[@data-name='save']");
	private By createdNotification = By.xpath("//div[@id='nofitication'][text()='Created']");
	
	public DocumentPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickCreateDocument() {
		driver.findElement(createDocumentButton).click();
		Reporter.log("Create document clicked");
	}
	
	public void uploadFile(String filePath) {
		driver.findElement(fileInput).sendKeys(filePath);
		Reporter.log("File uploaded");
	}
	
	public void fillName(String name) {
		driver.findElement(nameTextbox).clear();
		driver.findElement(nameTextbox).sendKeys(name);
		Reporter.log("Value filled in name textbox");
	}
	
	public void fillDescription(String description) {
		driver.findElement(descriptionTextarea).sendKeys(description);
		Reporter.log("Value filled in description textbox");
	}
	
	public void clickSave() {
		driver.findElement(saveButton).click();
		Reporter.log("Save button clicked");
	}
	
	public void isCreatedNotificationDisplayed() {
		driver.findElement(createdNotification).isDisplayed();
		Reporter.log("Created notification displayed successfully");
	}

}
