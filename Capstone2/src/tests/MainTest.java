package tests;

import org.testng.annotations.Test;
import pageObjects.CreatePOHeader;
import pageObjects.LoginPage;
import pageObjects.NavigateToPO;
import pageObjects.CreatePOLines;
import pageObjects.ConfirmPO;
import pageObjects.RecieptPO;
import pageObjects.InvoicePO;
import pageObjects.PrintInvoice;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;

public class MainTest {
	static WebDriver driver;
	
	
  @BeforeTest
  public void beforeTest() { 
	
	System.setProperty("webdriver.ie.driver","D:/automation/Drivers/IEDriverServer32bit.exe");
	 driver = new InternetExplorerDriver();
	driver.manage().window().maximize();
	driver.get("https://demov81u20ab6ecea37d930a3faos.cloudax.dynamics.com/");
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    
  }
 
  	@Test (enabled=true, priority= 0)
	public void loginpage()
	{
		LoginPage login = new LoginPage(driver);
		login.Username("arjun@metcashpoc.onmicrosoft.com");
		login.Next();
		login.password("9446556925As");
		login.Submit();
		login.clickNo();
	}
  	
  	@Test(enabled=true, priority= 1)
	public void NavigateToPO()
	{
  		NavigateToPO navigateToPO = new NavigateToPO(driver);
  		navigateToPO.HamburgerIcon();
  		navigateToPO.AccountsPayable();
  		navigateToPO.AllPurchaseOrders();
	}
  	
  	@Test(enabled=true, priority= 2)
	public void CreatePOheader()
	{
  		CreatePOHeader CreatePOHeader = new CreatePOHeader(driver);
  		CreatePOHeader.NewButton();
  		CreatePOHeader.CussAccNum("US-101");
  		CreatePOHeader.OkButton();
}
  	@Test(enabled=true, priority= 3)
	public void CreatePOLines()
	{
  		CreatePOLines createPOLines = new CreatePOLines(driver);
  		createPOLines.ClickEdit();
  		createPOLines.AddItem1("M0001");
  		createPOLines.AddQuantity("2");
  		createPOLines.AddLine();
  		createPOLines.AddItem2("M0002");
  		createPOLines.SaveButton();
  		
	}
  	@Test(enabled=true, priority= 4)
	public void ConfirmPO()
	{
  		ConfirmPO ConfirmPO = new ConfirmPO(driver);
  		ConfirmPO.ClickOnPurchase();
  		ConfirmPO.ClickConfirm();
  		
	}
  	@Test(enabled=true, priority= 5)
	public void RecieptPO()
	{
  		RecieptPO RecieptPO = new RecieptPO(driver);
  		RecieptPO.ClkRecieve();
  		RecieptPO.ClkRecieveButton();
  		RecieptPO.UpdatePrdtReciptNum("145");
  		RecieptPO.OKButton();
  		
  		}
  	@Test(enabled=true, priority= 6)
	public void InvoicePO()
	{
  		InvoicePO InvoicePO = new InvoicePO(driver);
  		InvoicePO.ClickInvoice();
  		InvoicePO.ClickInvoiceButton();
  		InvoicePO.UpdteMatchStatus();
  		InvoicePO.InvoiceNum("155");
  		InvoicePO.PostInvoice();
	}
	@Test(enabled=true, priority= 7)
	public void PrintInvoice()
	{
	PrintInvoice PrintInvoice = new PrintInvoice(driver);
	PrintInvoice.InvoiceButton();
	PrintInvoice.PrintPreview();
	PrintInvoice.OrginalPreview();
	}
}