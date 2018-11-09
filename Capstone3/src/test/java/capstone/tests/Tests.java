package capstone.tests;

import org.testng.annotations.BeforeMethod;
import capstone.pages.LoginPage;


public class Tests extends ParentTests {
	
	LoginPage loginPage;
	//MasterDashboardPage masterDashboardPage;
	

	public void beforeEachTestLocal() {
		loginPage = new LoginPage(driver);
		//masterDashboardPage = new MasterDashboardPage(driver);		
		loginPage.login(readConfigFile.getUsername(), readConfigFile.getPassword());
	}
	
}
	