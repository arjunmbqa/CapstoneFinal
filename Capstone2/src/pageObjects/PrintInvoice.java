package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class PrintInvoice {
WebDriver driver;
//**********PRINT INVOICE LINE OBJECTS*************

By InvoiceButton = By.id("purchtablelistpageassignedtome_3_buttonJournalInvoice_label");
By PrintPreview = By.id("VendInvoiceJournal_11_PurchInvoiceShow_label");
By OrginalPreview =By.id("VendInvoiceJournal_11_PurchInvoiceOriginal");

public PrintInvoice(WebDriver driver) {
	this.driver=driver;
}
//**********PRINT INVOICE LINE METHODS*************
public void InvoiceButton(){
	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(InvoiceButton).click();
	Reporter.log("Invoice option clicked");
}
public void PrintPreview(){
	
	driver.findElement(PrintPreview).click();
	Reporter.log("Print preview option clicked");
}
public void OrginalPreview(){
	
	driver.findElement(OrginalPreview).click();
	Reporter.log("Orginal preview option clicked");
}
}
