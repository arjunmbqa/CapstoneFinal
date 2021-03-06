package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class NavigateToPO {
	WebDriver driver;
	//**********NAVIGATION PAGE OBJECTS*************
	
	By HamburgerIcon = By.xpath("//*[@id=\"mainPane\"]/div[5]/div/div/div");
	
	By AccountsPayable = By.xpath("//*[@id=\"mainPane\"]/div[5]/div/div[2]/div/a[1]");
	
	By AllPurchaseOrders = By.xpath("//*[@id=\"mainPane\"]/div[5]/div/div/div/div/div[11]/a[1]");
	
//**********NAVIGATION PAGE METHODS*************
	
	public NavigateToPO(WebDriver driver) {
	this.driver = driver;
}
		public void HamburgerIcon() {
		WebDriverWait wait = new WebDriverWait(driver,20);
	   	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mainPane\"]/div[5]/div/div/div")));		
		driver.findElement(HamburgerIcon).click();
		Reporter.log("HamburgerIcon button from menu clicked");
	}
		public void AccountsPayable() {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mainPane\"]/div[5]/div/div[2]/div/a[1]")));	
		driver.findElement(AccountsPayable).click();
		Reporter.log("AccountsPayable button from menu clicked");
}
		public void AllPurchaseOrders() {
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mainPane\"]/div[5]/div/div/div/div/div[11]/a[1]")));	
			driver.findElement(AllPurchaseOrders).click();
			Reporter.log("AllPurchaseOrders button from menu clicked");
	}
}
