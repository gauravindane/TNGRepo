package AnnotationsPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase3 {
	
	@BeforeTest
	public void openDB() {
		System.out.println("DB is opened");
	}
	
	@AfterTest
	public void closeDB() {
		System.out.println("DB is closed");
	}
	
	@BeforeClass
	public void openBrowser() {
		System.out.println("Browser is opened");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Browser is closed");
	}
	
	@Test
	public void m1() {
		System.out.println("This is method m1");
	}
	
	@Test
	public void m2() {
		System.out.println("This is method m2");
	}
	
	@Test
	public void m3() {
		System.out.println("This is method m3");
	}

}
