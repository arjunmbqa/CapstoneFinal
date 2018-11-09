package capstone.tests;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import capstone.utils.ReadConfigFile;

public class ParentTests {			
	
	//********** OBJECT DECLARATION **********
	WebDriver driver;
	ReadConfigFile readConfigFile;
	
	
	//********** INSTANCE VARIABLES **********
	String browserName = "ie";
	String baseUrl = "https://demov81u20ab6ecea37d930a3faos.cloudax.dynamics.com/";
	
	
	//********** STEPS WHICH RUN BEFORE EACH TEST **********
	@BeforeMethod
	public void beforeEachTest() {
		readConfigFile = new ReadConfigFile(System.getProperty("user.dir") + "/config.properties");
		launchBrowser(readConfigFile.getBrowserName());
		driver.manage().timeouts().implicitlyWait(readConfigFile.getWaitTime(), TimeUnit.SECONDS);
		driver.get(readConfigFile.getBaseUrl());
	}
		
	//********** STEPS WHICH RUN AFTER EACH TEST **********
	@AfterMethod
	public void afterEachTest(ITestResult result) {
		driver.manage().deleteAllCookies();
		driver.quit();
	}
	
	public void launchBrowser(String browserName) {
		if(browserName.toLowerCase().contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "D:/automation/Drivers/IEDriverServer32bit.exe");
        	driver = new ChromeDriver();
		}
		else if(browserName.toLowerCase().contains("ie")) {
			
        	System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "D:/automation/Drivers/IEDriverServer32bit.exe");
        	driver = new InternetExplorerDriver();
		}
		else if(browserName.toLowerCase().contains("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/browser-drivers/MicrosoftWebDriver.exe");
        	driver = new EdgeDriver();
		}
	}
}
