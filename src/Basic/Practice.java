package Basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice {
	
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
	
	@BeforeTest
	public void openDB() {
		System.out.println("DB is opened");
	}
	
	@AfterTest
	public void closeDB() {
		System.out.println("DB is closed");
	}
	
	@Test
	public void m1() {
		System.out.println("Hi");
	}
	@Test
	public void m2() {
		System.out.println("Hello");
	}
	

}
