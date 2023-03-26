package GroupsPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@BeforeTest (alwaysRun = true)
	public void openDB() {
		System.out.println("Database is opened");
	}
	
	@AfterTest (alwaysRun = true)
	public void closeDB() {
		System.out.println("Database is closed");
	}
	
	@BeforeClass (alwaysRun = true)
	public void openBrowser() {
		System.out.println("Browser is opened");
	}
	
	@AfterClass (alwaysRun = true)
	public void closeBrowser() {
		System.out.println("Browser is closed");
	}
	
	@Test (groups = "Smoke")
	public void test1() {
		System.out.println("This is test1");
	}
	
	@Test (groups = "Functional")
	public void test2() {
		System.out.println("This is test2");
	}
	
	@Test (groups = {"Functional", "Regression"})
	public void test3() {
		System.out.println("This is test3");
	}

}
