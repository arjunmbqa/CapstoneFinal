package espocrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class CaseViewPage {
	
	private WebDriver driver;
	
	By caseNavigationLink = By.xpath("//a[text()='Cases'][@data-action='navigateToRoot']");
	By steveNavigateText = By.xpath("//div[text()='Steve'][@class='pull-left']");
	
	public CaseViewPage(WebDriver driver) {
		this.driver = driver;
	}

	public void isCasesSteveDisplayed() {
		driver.findElement(caseNavigationLink).isDisplayed();
		driver.findElement(steveNavigateText).isDisplayed();
		Reporter.log("Case >> Steve displayed successfully");
	}
}



