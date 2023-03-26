package AnnotationsPractice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase2 {
	
	@Test
	public void m4() {
		System.out.println("This is method m4");
	}
	
	@Test
	public void m5() {
		System.out.println("This is method m5");
	}
	
	@Test
	public void m6() {
		System.out.println("This is method m6");
	}
	
	@BeforeTest
	public void openDB() {
		System.out.println("The Database is opened");
	}
	
	@AfterTest
	public void closeDB() {
		System.out.println("The Database is closed");
	}

}
