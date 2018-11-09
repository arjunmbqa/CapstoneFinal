package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MainClass {

	public static void main(String[] args) {

		WebDriver driver;
		
		System.setProperty("webdriver.ie.driver","e://automation//Drivers//IEDriverServer32bit.exe");

		driver = new InternetExplorerDriver();

		driver.get("http://localhost/vtigercrm/");
      
		Login.validloginclass(driver);
		Login.invalidloginclass(driver);
		

	}

}
