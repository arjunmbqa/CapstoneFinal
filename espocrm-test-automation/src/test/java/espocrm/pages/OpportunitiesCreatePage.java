package espocrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class OpportunitiesCreatePage {
	
    private WebDriver driver;
	
	By nameTextbox = By.name("name");
	By stageDropdown = By.name("stage");
	By amountTextbox = By.name("amount");
	By ProbabilityTextbox = By.name("probability");
	By closeDateTextbox = By.name("closeDate");
	By descriptionTextbox = By.xpath("//textarea[@name='description']");
	By saveButton = By.xpath("//button[@data-action='save']");
	
	public OpportunitiesCreatePage(WebDriver driver) {
		this.driver = driver;
	}	
	
	public void fillName(String name) {
		driver.findElement(nameTextbox).sendKeys(name);
		Reporter.log("Value filled in name textbox");
	}
	
	public void selectStage(String stage) {
		Select select = new Select(driver.findElement(stageDropdown));
		select.selectByVisibleText(stage);
		Reporter.log("Option selected in stage dropdown");
	}
	
	public void fillAmount(String amount) {
		driver.findElement(amountTextbox).sendKeys(amount);
		Reporter.log("Value filled in amount textbox");
	}
	
	public void fillProbability(String probability) {
		driver.findElement(ProbabilityTextbox).clear();
		Reporter.log("Value clear in probability textbox");
		driver.findElement(ProbabilityTextbox).sendKeys(probability);
		Reporter.log("Value filled in probability textbox");
	}
	
	public void fillCloseDate(String closeDate) {
		driver.findElement(closeDateTextbox).sendKeys(closeDate);
		Reporter.log("Value filled in close date textbox");
	}
	
	public void fillDescription(String description) {
		driver.findElement(descriptionTextbox).sendKeys(description);
		Reporter.log("Value filled in description textbox");
	}
	
	public void clickSave() {
		driver.findElement(saveButton).click();
		Reporter.log("Save button clicked");
	}

}
