package espocrm1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.relevantcodes.extentreports.ExtentTest;

public class common {
	WebDriver driver;
	 
	 @BeforeSuite
	  public void main() {
		 
			System.setProperty("webdriver.ie.driver","d://automation//Drivers//IEDriverServer32bit.exe");

			driver = new InternetExplorerDriver();

	        driver.get("http://localhost/Espocrm/");
	        
	    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	 }
	 
	 @AfterMethod
	  public void afterMethod() {
		
	   public static void main(String[] args) {
        // start reporters
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
    
        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // /log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
        
        // calling flush writes everything to the log file
        extent.flush(); 
	   	}
	 }
}
