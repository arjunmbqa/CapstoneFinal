package espocrm.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import espocrm.utils.ReadConfigFile;

public class ParentTests {			
	
	//********** OBJECT DECLARATION **********
	WebDriver driver;
	ReadConfigFile readConfigFile;
	
	
	//********** INSTANCE VARIABLES **********
	String browserName = "chrome";
	String baseUrl = "http://localhost/espocrm/";
	
	
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
		if(browserName.toLowerCase().contains("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/browser-drivers/geckodriver.exe");	
        	driver = new FirefoxDriver();
		}
		else if(browserName.toLowerCase().contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/browser-drivers/chromedriver.exe");
        	driver = new ChromeDriver();
		}
		else if(browserName.toLowerCase().contains("ie")) {
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
        	System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/browser-drivers/IEDriverServer.exe");
        	driver = new InternetExplorerDriver(capabilities);
		}
		else if(browserName.toLowerCase().contains("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/browser-drivers/MicrosoftWebDriver.exe");
        	driver = new EdgeDriver();
		}
	}
}
