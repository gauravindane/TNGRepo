package AssertionsPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleAssertPractice {
	
//	@Test
//	public void demo() {                           //Validation points = 2
//		String str1="Hello";
//		Assert.assertEquals(str1, "hi");
//	    System.out.println("Hello");
//		
//		String str2="hi";
//		Assert.assertEquals(str2, "hi");
//		System.out.println("hi");
//	}
	
	
	@Test
	public void demo1() {
		SoftAssert soft = new SoftAssert();             //non static
		String str1="Hello";
		soft.assertEquals(str1, "hi");
		System.out.println("Hello");
		
		String str2="hi";
		soft.assertEquals(str2, "hi");
		System.out.println("hi");
		soft.assertAll();
		
	}

}
