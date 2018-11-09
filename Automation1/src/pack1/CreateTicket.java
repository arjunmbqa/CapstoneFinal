package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateTicket {
	
	static WebDriver driver;
	public static void ticket(WebDriver driver)
	{
			
			WebElement create;
			create = driver.findElement(By.xpath("//*[@id=\"menubar_quickCreate\"]"));
		    create.click();
		       
		    WebElement ticket;
		    ticket = driver.findElement(By.xpath("//*[@id=\"menubar_quickCreate_HelpDesk\"]/span"));
		    ticket.click();
		    
		    
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
	        
	        //waitForElement(By.partialLinkText("Your Toast message"), 4, driver);
	        
	        
	        /*success_message=driver.findElement(By.css(".content-wrapper .callout-success"));
	        success_message.contains("");
		  
	        WebElement dropdown;
		    dropdown = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/form/div[2]/div/div[1]/div/table/tbody/tr[2]/td[2]/div/a"));
		    dropdown.click();
		  
		    WebElement priority;
		    priority = driver.findElement(By.xpath("//*[@id=\"select2-drop-mask\"]"));
		    priority.click();*/
		
	}

}
