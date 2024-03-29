package CommonClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

public class NewTest {

	public static void main(String[] args) {
		// LOGGING INTO MSD365


		WebDriver driver;
		//FOR CHROME
		//System.setProperty("webdriver.chrome.driver","D:/automation/Drivers/chromedriver.exe");
		//driver = new ChromeDriver();
		
		//FOR IE
		System.setProperty("webdriver.ie.driver","D:/automation/Drivers/IEDriverServer32bit.exe");
		driver = new InternetExplorerDriver();
		
		//FOR EDGE
		//System.setProperty("webdriver.edge.driver","D:/automation/Drivers/MicrosoftWebDriver.exe");
		//driver = new EdgeDriver();
		
		driver.manage().window().maximize();
        driver.get("https://demov81u20ab6ecea37d930a3faos.cloudax.dynamics.com/");
        WebDriverWait wait  ;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);   
        
        
        
        //clicking login to another account
       /* wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"otherTileText\"]")));
        driver.findElement(By.xpath("//*[@id=\"otherTileText\"]")).click();*/
         //username        
        driver.findElement(By.name("loginfmt")).sendKeys("arjun@metcashpoc.onmicrosoft.com");
        //next button     
        driver.findElement(By.id("idSIButton9")).click();
        //explicit wait
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("i0118")));
          //password
        driver.findElement(By.name("passwd")).sendKeys("9446556925As");
         //submit
        driver.findElement(By.id("idSIButton9")).click();
        //save password 
        driver.findElement(By.id("idBtn_Back")).click();;
        
        //NAVIGATING TO PURCHASE ORDER

        
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mainPane\"]/div[5]/div/div/div")));
        WebElement Menu = driver.findElement(By.xpath("//*[@id=\"mainPane\"]/div[5]/div/div/div"));
        Menu.click();
        //Navigating to AP
        
        WebElement AP = driver.findElement(By.xpath("//*[@id=\"mainPane\"]/div[5]/div/div[2]/div/a[1]"));
        AP.click();
         //Clicking on All PO
        WebElement AllPo = driver.findElement(By.xpath("//*[@id=\"mainPane\"]/div[5]/div/div/div/div/div[11]/a[1]"));
        AllPo.click();
       
       //CREATING A NEW PURCHASE ORDER
        
        //Clicking New Button
        WebElement New = driver.findElement(By.name("SystemDefinedNewButton"));
        New.click();
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("PurchTable_OrderAccount")));
        WebElement CusAcc = driver.findElement(By.name("PurchTable_OrderAccount"));
        CusAcc.sendKeys("US-101");
        CusAcc.sendKeys(Keys.ENTER);
        
        /*WebElement OK = driver.findElement(By.name("OK"));
        OK.click();*/
        
       //CREATING SALES ORDER LINES
       
        WebElement Edit = driver.findElement(By.id("purchtablelistpageassignedtome_3_SystemDefinedViewEditButton_label"));
        Edit.click();
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("PurchLine_ItemId")));
        WebElement SOL1 = driver.findElement(By.name("PurchLine_ItemId"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        SOL1.click();
        SOL1.sendKeys("M0001");
        SOL1.sendKeys(Keys.ENTER);
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("SystemDefinedSaveButton")));
       
     
        driver.findElement(By.name("PurchLine_PurchQtyGrid")).clear();
        driver.findElement(By.name("PurchLine_PurchQtyGrid")).sendKeys("2");
        WebElement AddLine = driver.findElement(By.id("purchtablelistpageassignedtome_3_LineStripNew_label"));
        AddLine.click();
        
        WebElement SOL2 = driver.findElement(By.xpath("//*[@id=\"purchtablelistpageassignedtome_3_PurchLine_ItemId_input\"]"));
        SOL2.click();
        SOL2.sendKeys("M0002");
        SOL2.sendKeys(Keys.ENTER);
        
       WebElement Save = driver.findElement(By.name("SystemDefinedSaveButton"));
        Save.click();
        
        //CONFIRM PURCHASE
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("purchtablelistpageassignedtome_3_Purchase")));
        WebElement Purchase = driver.findElement(By.id("purchtablelistpageassignedtome_3_Purchase"));
        Purchase.click();
        
        WebElement Cnfirm = driver.findElement(By.id("purchtablelistpageassignedtome_3_buttonConfirm"));
        Cnfirm.click();
        try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("purchtablelistpageassignedtome_3_Receive_button")));
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        WebElement Receive = driver.findElement(By.id("purchtablelistpageassignedtome_3_Receive_button"));
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Receive.click();
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("purchtablelistpageassignedtome_3_buttonUpdatePackingSlip_label")));
       WebElement Recievebtn = driver.findElement(By.id("purchtablelistpageassignedtome_3_buttonUpdatePackingSlip_label"));
       Recievebtn.click();
       wait = new WebDriverWait(driver, 20);
       wait.until(ExpectedConditions.elementToBeClickable(By.name("buttonUpdatePackingSlip")));
       WebElement Prdtrecpt = driver.findElement(By.name("buttonUpdatePackingSlip"));
       
       Prdtrecpt.sendKeys("115");
       Prdtrecpt.sendKeys(Keys.ENTER);
       wait = new WebDriverWait(driver, 20);
       wait.until(ExpectedConditions.elementToBeClickable(By.name("OK")));
       WebElement ok = driver.findElement(By.name("OK"));
       ok.click();
       wait = new WebDriverWait(driver, 20);
       wait.until(ExpectedConditions.elementToBeClickable(By.id("purchtablelistpageassignedtome_3_Invoice_button")));
       try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       WebElement Invoice = driver.findElement(By.id("purchtablelistpageassignedtome_3_Invoice_button"));
       try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       Invoice.click();
       wait = new WebDriverWait(driver, 20);
       wait.until(ExpectedConditions.elementToBeClickable(By.id("purchtablelistpageassignedtome_3_buttonUpdateInvoice")));
       WebElement InvoiceBtn = driver.findElement(By.id("purchtablelistpageassignedtome_3_buttonUpdateInvoice"));
       InvoiceBtn.click();
      
       try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       WebElement UpdteMatchStatus = driver.findElement(By.id("VendEditInvoice_8_UpdateMatchStatus"));
       UpdteMatchStatus.click();
       try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       WebElement invoicenum = driver.findElement(By.name("PurchParmTable_Num"));
       invoicenum.sendKeys("132");
       
       //WebElement Save1 = driver.findElement(By.id("VendEditInvoice_8_SystemDefinedSaveButton_label"));
       //Save1.click();
       wait = new WebDriverWait(driver, 20);
       wait.until(ExpectedConditions.elementToBeClickable(By.id("VendEditInvoice_8_ParmTableTotals")));
       WebElement Totals = driver.findElement(By.id("VendEditInvoice_8_ParmTableTotals"));
       Totals.click();
       wait = new WebDriverWait(driver, 20);
       wait.until(ExpectedConditions.elementToBeClickable(By.id("VendEditInvoiceTotals_9_Close")));
       WebElement Totalsclose = driver.findElement(By.id("VendEditInvoiceTotals_9_Close"));
       Totalsclose.click();
      
       WebElement post = driver.findElement(By.id("VendEditInvoice_8_OK"));
       post.click();
       wait = new WebDriverWait(driver, 20);
       wait.until(ExpectedConditions.elementToBeClickable(By.id("purchtablelistpageassignedtome_3_buttonJournalInvoice_label")));
  	    WebElement Invoice1 = driver.findElement(By.id("purchtablelistpageassignedtome_3_buttonJournalInvoice_label"));
  	  try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  	  	Invoice1.click();
  	  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         WebElement InvoiceP = driver.findElement(By.id("VendInvoiceJournal_11_PurchInvoiceShow_label"));
        InvoiceP.click();
        
        WebElement InvoicePO = driver.findElement(By.id("VendInvoiceJournal_11_PurchInvoiceOriginal"));
        InvoicePO.click();
}
	}