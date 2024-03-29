package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class RecieptPO {
	WebDriver driver;
	 //**********RECIEPT PO LINE OBJECTS*************
	By ClkRecieve =By.id("purchtablelistpageassignedtome_3_Receive_button");
	By ClkRecieveButton = By.id("purchtablelistpageassignedtome_3_buttonUpdatePackingSlip_label");
	By UpdatePrdtReciptNum = By.name("buttonUpdatePackingSlip");
	By OKButton = By.name("OK");

	 //**********RECEIPT PO LINE METHODS*************
public RecieptPO(WebDriver driver) {
this.driver= driver;
}

public void ClkRecieve() {
	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(ClkRecieve).click();
	Reporter.log("Recieve button on fast tab clicked");
}
public void ClkRecieveButton() {
	WebDriverWait wait = new WebDriverWait(driver,20);
   	wait.until(ExpectedConditions.elementToBeClickable(By.id("purchtablelistpageassignedtome_3_buttonUpdatePackingSlip_label")));
	driver.findElement(ClkRecieveButton).click();
	Reporter.log("Recieve option clicked");
}
public void UpdatePrdtReciptNum(String ReceiptNumber) {
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	WebElement RecpNum = driver.findElement(UpdatePrdtReciptNum);
	RecpNum.sendKeys(ReceiptNumber);
	RecpNum.sendKeys(Keys.ENTER);
	Reporter.log("Receipt Number Updated");
}
public void OKButton() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(OKButton).click();
	Reporter.log("OK Button clicked");
}
}