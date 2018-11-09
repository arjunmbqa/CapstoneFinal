package espocrm1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NewTest extends common{
	
	
	@Test
	public void login()
	
	{
	
		 driver.findElement(By.id("field-userName")).sendKeys("admin");
         driver.findElement(By.id("field-password")).sendKeys("Admin");
		driver.findElement(By.id("btn-login")).submit();
        
	}
	
	
	
	
  

}
