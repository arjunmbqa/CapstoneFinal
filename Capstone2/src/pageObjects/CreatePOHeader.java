package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class CreatePOHeader {
	WebDriver driver;
	//**********CREATE PO PAGE OBJECTS*************
	
	By NewButton = By.name("SystemDefinedNewButton");
	By CussAccNum = By.name("PurchTable_OrderAccount");
	By OkButton = By.name("OK");
	
	//**********CREATE PO METHODS*************

public CreatePOHeader(WebDriver driver) {
	this.driver = driver;
}
	public void CussAccNum(String CusNum){
		driver.findElement(CussAccNum).sendKeys(CusNum);
    	Reporter.log("Value filled in Customer Number field");
	}
	public void NewButton() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(NewButton).click();
		Reporter.log("Value filled in Customer Number field");
	}
	public void OkButton() {
		driver.findElement(OkButton).click();
		Reporter.log("Value filled in Customer Number field");
	}
}

