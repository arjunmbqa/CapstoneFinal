package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class CreatePOLines {
 WebDriver driver;
 //**********CREATE PO LINE OBJECTS*************
 By ClickEdit = By.id("purchtablelistpageassignedtome_3_SystemDefinedViewEditButton_label");
 By AddItem1 = By.name("PurchLine_ItemId");
 By AddQuantity = By.name("PurchLine_PurchQtyGrid");
 By AddLine  = By.id("purchtablelistpageassignedtome_3_LineStripNew_label");
 By SaveButton =By.name("SystemDefinedSaveButton");
 By AddItem2 = By.xpath("//*[@id=\"purchtablelistpageassignedtome_3_PurchLine_ItemId_input\"]");

 //**********CREATE PO LINE METHODS*************
 public CreatePOLines(WebDriver driver) {
	 this.driver =driver ;
	 }
 
 
 public void AddItem1(String ItemNum){
		WebElement ItemNumb = driver.findElement(AddItem1);
		ItemNumb.click();
		ItemNumb.sendKeys(ItemNum);
		ItemNumb.sendKeys(Keys.ENTER);
 	Reporter.log("Value filled in Item Number field");
	}
 public void ClickEdit() {
	driver.findElement(ClickEdit).click();;
	Reporter.log("Edit button clicked");
}
 public void AddQuantity(String Quantity) {
	 WebElement Edit= driver.findElement(AddQuantity);
	 Edit.clear();
	 Edit.sendKeys(Quantity);
	 Reporter.log("Value filled in Quantity field");
 }
 public void AddLine() {
	 
	 driver.findElement(AddLine).click();
	 Reporter.log("Add Line Button Clicked");
 }
public void AddItem2(String Item2) {
	 WebElement AddItem = driver.findElement(AddItem2);
	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 AddItem.click();
	 AddItem.sendKeys(Item2);
	 AddItem.sendKeys(Keys.ENTER);
	 Reporter.log("Value filled in Item Number field");
}
public void SaveButton() {
	 driver.findElement(SaveButton).click();
	 Reporter.log("Save Button Clicked");
}


}