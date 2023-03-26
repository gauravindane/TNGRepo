package Basic;

import org.testng.annotations.Test;

public class IntroductionToTestNG {
	
	@Test(priority = 1)
	public void openurl() {
		System.out.println("Browser is launched and url is opened");
	}
	
	@Test(priority = 2)
	public void login() {
		System.out.println("Loggin Successfull");
	}
	
	@Test(priority = 3)
	public void logout() {
		System.out.println("Logout Successfull");
	}

}
