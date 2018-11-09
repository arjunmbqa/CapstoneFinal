package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	static WebElement element;
	
	public static WebElement username (WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		return element;
	}


}
