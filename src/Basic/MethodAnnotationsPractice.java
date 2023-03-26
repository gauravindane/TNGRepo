package Basic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MethodAnnotationsPractice {
	
	@BeforeMethod
	public void login() {
		System.out.println("Logged in Successfully");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logged out Successfully");
	}
	
	@Test(priority=1)
	public void HomePageTest() {
		System.out.println("Validated Home page");
	}
	
	@Test (priority=2)
	public void ProfilePageTest() {
		System.out.println("Validated Profile page");
	}
	
	@Test (priority=3)
	public void NotificationPageTest() {
		System.out.println("Validated Notification page");
	}

}
