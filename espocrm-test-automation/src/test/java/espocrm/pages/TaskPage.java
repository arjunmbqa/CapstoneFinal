package espocrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class TaskPage {
	
private WebDriver driver;
	
	private By createTaskButton = By.xpath("//a[@data-name='create']");
	
	public TaskPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickCreateTask() {
		driver.findElement(createTaskButton).click();
		Reporter.log("Create Task button clicked");
	}

}
