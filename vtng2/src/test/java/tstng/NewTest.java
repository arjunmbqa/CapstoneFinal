package tstng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NewTest 
{
	public WebDriver driver;

	public void selectmenu()
	{
		  WebElement title;
		    title = driver.findElement(By.xpath("//*[@id=\"HelpDesk_editView_fieldName_ticket_title\"]"));
		    title.sendKeys("Title1");
	}
   @BeforeSuite
   public void launch() 
	{
	  
		
		System.setProperty("webdriver.ie.driver","e://automation//Drivers//IEDriverServer32bit.exe");

		driver = new InternetExplorerDriver();

       driver.get("http://localhost/vtigercrm/");
      
	}
   
   @BeforeClass
   public void login() 
   {
	   
		  WebElement username;
		  username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
	      username.sendKeys("admin");
	     
	      WebElement password;
		  password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
	      password.sendKeys("Admin");
	      
	      WebElement login;
	      login = driver.findElement(By.xpath("//*[@id=\"loginFormDiv\"]/form/div[3]/button"));
	      login.submit();   
   }
	
  @Test(priority = 0)
  public void a()
  
  	{
	  try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	    WebElement menu;
		menu = driver.findElement(By.xpath("/html/body/div[1]/nav/div[1]/div/div[3]/ul/li[5]/div/a/span[1]"));  
		menu.click();
		
		WebElement preferences;
		preferences = driver.findElement(By.xpath("//*[@id=\"menubar_item_right_LBL_MY_PREFERENCES\"]"));  
		preferences.click();
		
		WebElement edit;
		edit = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div/div/div/div[1]/div[2]/div/div/button[1]"));  
		edit.click();
	    
		WebElement email;
		driver.findElement(By.xpath("//*[@id=\"Users_editView_fieldName_email1\"]")).clear();
		email = driver.findElement(By.xpath("//*[@id=\"Users_editView_fieldName_email1\"]"));
		email.sendKeys("arjun@gmail.com");
		
		WebElement save;
	    save = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div/div/div/form/div[3]/div/div/button"));
      save.submit();
      
  	}
  
  @Test(priority = 1)
  public void createticket() 
  {
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  WebElement create;
		create = driver.findElement(By.xpath("//*[@id=\"menubar_quickCreate\"]"));
	    create.click();
	       
	    WebElement ticket;
	    ticket = driver.findElement(By.xpath("//*[@id=\"menubar_quickCreate_HelpDesk\"]/span"));
	    ticket.click();
	   
		  try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    
	    WebElement title;
	    title = driver.findElement(By.xpath("//*[@id=\"HelpDesk_editView_fieldName_ticket_title\"]"));
	    title.sendKeys("Title1");
	    
	    Select priority = new Select(driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/form/div[2]/div/div[1]/div/table/tbody/tr[2]/td[2]/select")));
	    priority.selectByVisibleText("Low");
	    
	    Select assigned = new Select(driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/form/div[2]/div/div[1]/div/table/tbody/tr[1]/td[4]/select")));
	    assigned.selectByVisibleText("Support Group");
	    
	    Select status = new Select(driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/form/div[2]/div/div[1]/div/table/tbody/tr[2]/td[4]/select")));
	    status.selectByVisibleText("Open");
	    
	    WebElement save;
	    save = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/form/div[3]/center/button[2]"));
      save.submit();
  }

 @Test(priority = 2)
  public void logout() 
  {
		WebElement logout;
		WebElement logoutfinal;
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	
	    logout = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[5]/div/a"));  
	                                 
	    logout.click();
	    
	    logoutfinal = driver.findElement(By.xpath("//*[@id=\"menubar_item_right_LBL_SIGN_OUT\"]"));
	    
	    logoutfinal.click();  
  }

  @AfterSuite
  public void quit()
  
  	{
	  driver.quit();
  	}
}