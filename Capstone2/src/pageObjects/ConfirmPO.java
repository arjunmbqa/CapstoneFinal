package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class ConfirmPO {
	WebDriver driver;
	 //**********CONFIRM PO LINE OBJECTS*************
	By ClickOnPurchase = By.id("purchtablelistpageassignedtome_3_Purchase");
	By ClickConfirm = By.id("purchtablelistpageassignedtome_3_buttonConfirm");
	
	 //**********CONFIRM PO LINE METHODS*************
public ConfirmPO(WebDriver driver) {
	this.driver= driver;
}
	public void ClickOnPurchase() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(ClickOnPurchase).click();;
		Reporter.log("Purchase button on fast tab clicked");
	}
	public void ClickConfirm() {
		driver.findElement(ClickConfirm).click();;
		Reporter.log("Purchase option clicked");
	}
	
}

