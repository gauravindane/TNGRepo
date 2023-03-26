package Keywords;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountPractice {
	
	@BeforeClass
	public void openBrowser() {
		System.out.println("Browser is opened");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Browser is closed");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("Logged in Successfully");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logged out Successfully");
	}
	
	@Test (invocationCount=5)
	public void HomePageTest() {
		System.out.println("Validated Home page");
	}
	
	@Test (invocationCount=2)
	public void NotificationPageTest() {
		System.out.println("Validated Notification page");
	}
	
	@Test
	public void SettingsPageTest() {
		System.out.println("Validated Profile page");
	}

}
