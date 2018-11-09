package espocrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class MasterDashboardPage {
	
	private WebDriver driver;
	
	private By accountsLink = By.xpath("//span[text()='Accounts']");
	private By contactsLink = By.xpath("//span[text()='Contacts']");
	private By leadsLink = By.xpath("//span[text()='Leads']");
	private By opportunityLink = By.xpath("//span[text()='Opportunities']");
	private By casesLink = By.xpath("//span[text()='Cases']");
	private By meetingsLink = By.xpath("//span[text()='Meetings']");
	private By callsLink = By.xpath("//span[text()='Calls']");
	private By tasksLink = By.xpath("//span[text()='Tasks']");
	private By moreTabsLink = By.id("nav-more-tabs-dropdown");
	private By documentsLink = By.xpath("//span[text()='Documents']");
	private By campaignsLink = By.xpath("//span[text()='Campaigns']");
	
	public MasterDashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickAccounts() {
		driver.findElement(accountsLink).click();
		Reporter.log("Accounts link clicked");
	}
	
	public void clickContacts() {
		driver.findElement(contactsLink).click();
		Reporter.log("Contacts link clicked");
	}
	
	public void clickLeads() {
		driver.findElement(leadsLink).click();
		Reporter.log("Leads link clicked");
	}
	
	public void clickOpportunities() {
		driver.findElement(opportunityLink).click();
		Reporter.log("Opportunity link clicked");
	}

	public void clickCases() {
		driver.findElement(casesLink).click();
		Reporter.log("Cases link clicked");
	}
	
	public void clickMeetings() {
		driver.findElement(meetingsLink).click();
		Reporter.log("Meetings link clicked");
	}
	
	public void clickCalls() {
		driver.findElement(callsLink).click();
		Reporter.log("Calls link clicked");
	}
	
	public void clickTasks() {
		driver.findElement(tasksLink).click();
		Reporter.log("Tasks link clicked");
	}
	
	public void gotoDocuments() {
		driver.findElement(moreTabsLink).click();
		Reporter.log("More tabs link clicked");
		driver.findElement(documentsLink).click();
		Reporter.log("Documents link clicked");
	}
	
	public void gotoCampaigns() {
		driver.findElement(moreTabsLink).click();
		Reporter.log("More tabs link clicked");
		driver.findElement(campaignsLink).click();
		Reporter.log("Campaigns link clicked");
	}
	
}
