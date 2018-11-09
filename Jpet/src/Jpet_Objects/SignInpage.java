package Jpet_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInpage {

private static WebElement element = null;

//declaring public elements
public static WebElement Sign_In(WebDriver driver) {
	element = driver.findElement(By.id("stripes--338438625"));
	return element;
}
public static WebElement pswd(WebDriver driver) {
	element = driver.findElement(By.name("password"));
	return element;
}
public static WebElement login(WebDriver driver) {
	element = driver.findElement(By.name("signon"));
	return element;
}

}
