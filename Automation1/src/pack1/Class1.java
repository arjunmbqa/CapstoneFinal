package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("webdriver.ie.driver","e://automation//Drivers//IEDriverServer32bit.exe");

		driver = new InternetExplorerDriver();

        driver.get("http://localhost/vtigercrm/");
        
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
    	
        Login.login(driver);
        
	     CreateTicket.ticket(driver);
	    
	    //Contact.contact(driver);
	    
        //Add_event.event(driver);
      
       // Editmail.editmail(driver);
        
	    //Logout.logout(driver);
       
	    //driver.quit();
        


	}

}
