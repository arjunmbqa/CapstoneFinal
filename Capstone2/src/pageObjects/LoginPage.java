package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class LoginPage {
	WebDriver driver;
	
	//****************LOGIN PAGE OBJECTS******************
	
	
	By username = By.name("loginfmt");

    By password = By.name("passwd");

    By button =By.id("idSIButton9");
    
    
    
    By StaySignIn = By.id("idBtn_Back");
    
  //****************LOGIN PAGE METHODS******************
    
    public LoginPage(WebDriver driver) {
	this.driver = driver;
	
	}
    
    public void Username(String UserName){
    	driver.findElement(username).sendKeys(UserName);
    	Reporter.log("Value filled in username textbox");
    }
    public void Next() {
		driver.findElement(button).click();
		Reporter.log("Next button clicked");
	}
      
    public void password(String Pass){
    	driver.findElement(password).sendKeys(Pass);
    	Reporter.log("Value filled in password textbox");
    	WebDriverWait wait = new WebDriverWait(driver,20);
   	 	wait.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
    	
        
    }
    public void Submit() {
		driver.findElement(button).click();
		Reporter.log("Submit button clicked");
	}
      
    public void clickNo() {
		driver.findElement(StaySignIn).click();
		Reporter.log("No Save button clicked");
	}
    
    public void waitforelement(String Element,long Time) {
    	
    WebDriverWait wait = new WebDriverWait(driver,Time);
    wait.until(ExpectedConditions.elementToBeClickable(By.id(Element)));
    
 }
}
    
