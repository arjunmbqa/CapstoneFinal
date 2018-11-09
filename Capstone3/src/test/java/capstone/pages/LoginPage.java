package capstone.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class LoginPage {
	
	private WebDriver driver;
	
	private By usernameTextbox = By.name("loginfmt");
	private By passwordTextbox = By.name("passwd");
	private By Button = By.id("idSIButton9");
	private By NoSave = By.id("idBtn_Back");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void login(String username, String password) {
		driver.findElement(usernameTextbox).sendKeys(username);
		Reporter.log("Value filled in username textbox");
		
		driver.findElement(Button).click();
		Reporter.log("next button clicked");
		
		driver.findElement(passwordTextbox).sendKeys(password);
		Reporter.log("Value filled in password textbox");
		
		driver.findElement(Button).click();
		Reporter.log("submit button clicked");
		
		driver.findElement(NoSave).click();
		Reporter.log("password not saved");
	}
	
	

}
