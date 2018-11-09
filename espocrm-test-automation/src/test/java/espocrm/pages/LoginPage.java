package espocrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class LoginPage {
	
	private WebDriver driver;
	
	private By usernameTextbox = By.id("field-userName");
	private By passwordTextbox = By.id("field-password");
	private By loginButton = By.id("btn-login");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void login(String username, String password) {
		driver.findElement(usernameTextbox).sendKeys(username);
		Reporter.log("Value filled in username textbox");
		
		driver.findElement(passwordTextbox).sendKeys(password);
		Reporter.log("Value filled in password textbox");
		
		driver.findElement(loginButton).click();
		Reporter.log("Login button clicked");
	}
	
	

}
