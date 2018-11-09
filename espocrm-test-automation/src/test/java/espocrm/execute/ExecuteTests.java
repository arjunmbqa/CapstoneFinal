package espocrm.execute;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import espocrm.tests.Tests;

public class ExecuteTests {

	public static void main(String[] args) {
		
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		testng.setTestClasses(new Class[] { Tests.class });
		testng.addListener(tla);
		testng.run();
	}
	
}
