package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logout {
	
    static WebDriver driver;
	
	public static void logout(WebDriver driver) {
	
	WebElement logout;
	WebElement logoutfinal;
	
	/*WebDriverWait wait = new WebDriverWait(driver, 30);
    
    wait.until(ExpectedConditions.elementToBeSelected(logout));*/
 
    logout = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[5]/div/a"));  
                                 
    logout.click();
    
    logoutfinal = driver.findElement(By.xpath("//*[@id=\"menubar_item_right_LBL_SIGN_OUT\"]"));
    
    logoutfinal.click();
    
   
	 }

}
