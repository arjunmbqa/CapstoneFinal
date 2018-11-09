package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	WebDriver driver;
	public static void login(WebDriver driver)
	{
		WebElement username;
		WebElement password;
		WebElement login;
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
        username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        
        username.sendKeys("admin");
        
        password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        		
        password.sendKeys("Admin");
        
        login = driver.findElement(By.xpath("//*[@id=\"loginFormDiv\"]/form/div[3]/button"));
        
        login.submit();
	}
	
}
