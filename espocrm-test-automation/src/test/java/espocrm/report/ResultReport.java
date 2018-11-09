package espocrm.report;

import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ResultReport {
	
	ExtentHtmlReporter extentHtmlReporter;
	ExtentReports extentReports;
	ExtentTest extentTest;
	
	public ResultReport(String pathToCreateReport) {
		extentHtmlReporter = new ExtentHtmlReporter(pathToCreateReport);
		extentReports = new ExtentReports();
		extentReports.attachReporter(extentHtmlReporter);
	}
	
	public void createTest(String testName, String testDescription) {
		extentTest = extentReports.createTest(testName, testDescription);
	}
	
	public void logInfo(String information) {
		extentTest.log(Status.INFO, information);
	}
	
	public void logFail(String information, ITestResult result) {
		extentTest.log(Status.FAIL, information + " Exception occurred: " + result.getThrowable().getMessage());
	}
	
	public void flush() {
		extentReports.flush();
	}

}
