package Basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassAnnotationsPractice {
	
	@BeforeClass
	public void login() {
		System.out.println("Logged in successfully");
	}
	
	@AfterClass
	public void logout() {
		System.out.println("Logged in successfully");
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
