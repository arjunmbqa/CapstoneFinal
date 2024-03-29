package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class InvoicePO {
WebDriver driver;

//**********INVOICE PO LINE OBJECTS*************
By ClickInvoice = By.id("purchtablelistpageassignedtome_3_Invoice_button");
By ClickInvoiceButton = By.id("purchtablelistpageassignedtome_3_buttonUpdateInvoice");
By UpdteMatchStatus = By.id("VendEditInvoice_8_UpdateMatchStatus");
By InvoiceNum = By.name("PurchParmTable_Num");
By Total = By.name("ParmTableTotals");
By Close = By.name("Close");
By PostInvoice = By.id("VendEditInvoice_8_OK");

//**********INVOICE PO LINE METHODS*************

public InvoicePO(WebDriver driver) {
	this.driver =driver;	
}
public void ClickInvoice() {
	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(ClickInvoice).click();;
	Reporter.log("Invoice From Fasttab clicked");
}
public void ClickInvoiceButton() {
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(ClickInvoiceButton).click();;
	Reporter.log("Invoice option clicked");
}
public void UpdteMatchStatus() {
	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(UpdteMatchStatus).click();;
	Reporter.log("UpdateMatchStatus clicked");
}
public void InvoiceNum(String InvoiceNo){
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(InvoiceNum).sendKeys(InvoiceNo);
	Reporter.log("Value filled in Invoice Number field");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(Total).click();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(Close).click();
	
}
public void PostInvoice() {
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(PostInvoice).click();;
	Reporter.log("Post option clicked ");
}
}


