package Keywords;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EnabledFalsePractice {
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Browser is launched");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Browser is closed");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("Logged is Successfully");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logged out Successfully");
	}
	
	@Test (invocationCount = 5)
	public void homepageTest() {
		System.out.println("Testing the unstable functionality on homepage");
	}
	
	@Test (invocationCount = 2, enabled=false)
	public void notificationpageTest() {
		System.out.println("Testing the notification page");
	}

}
