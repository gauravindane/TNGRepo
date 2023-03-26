package GroupsPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase3 {
	
	@BeforeClass (alwaysRun = true)
	public void openBrowser() {
		System.out.println("Browser is opened");
	}
	
	@AfterClass (alwaysRun = true)
	public void closeBrowser() {
		System.out.println("Browser is closed");
	}
	
	@Test (groups = "Smoke")
	public void test7() {
		System.out.println("This is test7");
	}
	
	@Test (groups = "Functional")
	public void test8() {
		System.out.println("This is test8");
	}
	
	@Test (groups = {"Functional", "Regression"})
	public void test9() {
		System.out.println("This is test9");
	}

}
