package main;
import pageobjects.*;
import org.openqa.selenium.WebDriver;

public class Login {
	
	public static void validloginclass(WebDriver driver){
		LoginPageObjects.username(driver).sendKeys("");
	}

	public static void invalidloginclass(WebDriver driver){
		LoginPageObjects.username(driver).sendKeys("");
	}
}
