package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Contact {
	
	static WebDriver driver;
	public static void contact(WebDriver driver)
	
	{
		
		WebElement create;
		create = driver.findElement(By.xpath("//*[@id=\"menubar_quickCreate\"]"));
	    create.click();
	       
	    WebElement contact;
	    contact = driver.findElement(By.xpath("/html/body/div[1]/nav/div[1]/div/div[3]/ul/li[1]/div/ul/li[2]/div/div[1]/div[1]/a/span"));
	    contact.click();
	    
	    WebElement lastname;
	    lastname = driver.findElement(By.xpath("//*[@id=\"Contacts_editView_fieldName_lastname\"]"));
	    lastname.sendKeys("Mohan");
	    
	    Select assignedto = new Select(driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/form/div[2]/div/div[1]/div/table/tbody/tr[3]/td[4]/select")));
	    assignedto.selectByVisibleText("Team Selling");
	    
	    WebElement save;
	    save = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/form/div[3]/center/button[2]"));
        save.submit();
	    
	    /*WebElement title;
	    title = driver.findElement(By.xpath("//*[@id=\"HelpDesk_editView_fieldName_ticket_title\"]"));
	    title.sendKeys("Title1");*/
        
        //create.until(ExpectedConditions.elementToBeClickable(By.xpath("\"//*[@id=\\\"menubar_quickCreate\\\"]\"")));
	}

}
