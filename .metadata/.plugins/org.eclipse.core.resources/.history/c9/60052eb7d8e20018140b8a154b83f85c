package CommonClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

public class CmnClass {
	
	
	
	public static void  main(String[] args) {
		

		WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","D:/automation/Drivers/chromedriver.exe");
		//driver = new InternetExplorerDriver();
        //System.setProperty("webdriver.ie.driver","D:/automation/Drivers/IEDriverServer32bit.exe");
		driver.manage().window().maximize();
		
		driver.get("https://demov81u20ab6ecea37d930a3faos.cloudax.dynamics.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait;
		

             
        // LOGGING INTO MSD365
        //User-name        
        driver.findElement(By.id("i0116")).sendKeys("arjun@metcashpoc.onmicrosoft.com");
        //next button     
        driver.findElement(By.id("idSIButton9")).click();
        //explicit wait
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("i0118")));
          //password
        driver.findElement(By.id("i0118")).sendKeys("9446556925As");
         //submit
        driver.findElement(By.id("idSIButton9")).click();
        //save password 
        driver.findElement(By.id("idBtn_Back")).click();
        
        //NAVIGATING TO PURCHASE ORDER

        //clicking menu icon
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mainPane\"]/div[5]/div/div/div")));
        driver.findElement(By.xpath("//*[@id=\"mainPane\"]/div[5]/div/div/div")).click();
         //Navigating to AP
        driver.findElement(By.xpath("//*[@id=\"mainPane\"]/div[5]/div/div[2]/div/a[1]")).click();
        //Clicking on All PO
        driver.findElement(By.xpath("//*[@id=\"mainPane\"]/div[5]/div/div/div/div/div[11]/a[1]")).click();
               
       //CREATING A NEW PURCHASE ORDER
        
        //Clicking New Button
        driver.findElement(By.id("purchtablelistpageassignedtome_3_SystemDefinedNewButton_label")).click();
        //Selecting Customer account
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("PurchCreateOrder_4_PurchTable_OrderAccount_input")));
        driver.findElement(By.id("PurchCreateOrder_4_PurchTable_OrderAccount_input")).sendKeys("US-101",Keys.ENTER);
        
        /*WebElement OK = driver.findElement(By.id("SalesCreateOrder_16_OK"));
        OK.click();*/
        
       //CREATING SALES ORDER LINES
       
        //clicking on item number field
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("purchtablelistpageassignedtome_3_SystemDefinedViewEditButton_label")));
        driver.findElement(By.id("purchtablelistpageassignedtome_3_SystemDefinedViewEditButton_label")).click();
        //adding a product in line
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("PurchLine_ItemId")));
        driver.findElement(By.name("PurchLine_ItemId")).click();
        driver.findElement(By.name("PurchLine_ItemId")).sendKeys("M0001",Keys.ENTER);
        //add a line
        //driver.findElement(By.id("purchtablelistpageassignedtome_3_LineStripNew_label")).click();
        //save
        //driver.findElement(By.id("purchtablelistpageassignedtome_3_SystemDefinedSaveButton_label")).click();
 
        
        //CONFIRM PURCHASE
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("purchtablelistpageassignedtome_3_Purchase_button")));
        //Click on purchase
        driver.findElement(By.id("purchtablelistpageassignedtome_3_Purchase_button")).click();
        //Confirm purchase
        driver.findElement(By.id("purchtablelistpageassignedtome_3_buttonConfirm")).click();
        //purchase receive
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("purchtablelistpageassignedtome_3_Receive_button")));//**need to be corrected**
        driver.findElement(By.id("purchtablelistpageassignedtome_3_Receive_button")).click();
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("purchtablelistpageassignedtome_3_buttonUpdatePackingSlip_label")));
        driver.findElement(By.id("purchtablelistpageassignedtome_3_buttonUpdatePackingSlip_label")).click();
        //Product receipt number
        driver.findElement(By.id("PurchEditLines_6_PurchParmTable_Num_input")).sendKeys("58",Keys.ENTER);
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("PurchEditLines_6_OK")));
        driver.findElement(By.id("PurchEditLines_6_OK")).click();
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("purchtablelistpageassignedtome_3_Invoice_button")));
        driver.findElement(By.id("purchtablelistpageassignedtome_3_Invoice_button")).click();
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("purchtablelistpageassignedtome_3_buttonUpdateInvoice")));
        driver.findElement(By.id("purchtablelistpageassignedtome_3_buttonUpdateInvoice")).click();
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("VendEditInvoice_8_UpdateMatchStatus")));
        driver.findElement(By.id("VendEditInvoice_8_UpdateMatchStatus")).click();
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("VendEditInvoice_8_PurchParmTable_Num_input"))); 
        driver.findElement(By.id("VendEditInvoice_8_PurchParmTable_Num_input")).sendKeys("106");
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("VendEditInvoice_8_ParmTableTotals"))); 
        driver.findElement(By.id("VendEditInvoice_8_ParmTableTotals")).click();
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("VendEditInvoiceTotals_9_Close"))); 
        driver.findElement(By.id("VendEditInvoiceTotals_9_Close")).click();
        driver.findElement(By.id("VendEditInvoice_8_OK")).click();
        //Print preview the Invoice
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("purchtablelistpageassignedtome_3_buttonJournalInvoice_label")));
        driver.findElement(By.id("purchtablelistpageassignedtome_3_buttonJournalInvoice_label")).click();
  	  	driver.findElement(By.id("VendInvoiceJournal_11_PurchInvoiceShow_label")).click();
        driver.findElement(By.id("VendInvoiceJournal_11_PurchInvoiceOriginal")).click();
        
}
	}