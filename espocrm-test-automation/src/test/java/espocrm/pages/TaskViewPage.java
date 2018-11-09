package espocrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class TaskViewPage {
	
    private WebDriver driver;
	
	private By tasksNavigateLink = By.xpath("//a[text()='Tasks'][@data-action='navigateToRoot']");
	private By toBeDoneNavigteText = By.xpath("//div[text()='To be done'][@class='pull-left']");
	
	public TaskViewPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void isTasksToBeDoneDisplayed() {
		driver.findElement(tasksNavigateLink).isDisplayed();
		driver.findElement(toBeDoneNavigteText).isDisplayed();
		Reporter.log("Tasks >> To be done displayed successfully");
	}

}
