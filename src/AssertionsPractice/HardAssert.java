package AssertionsPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	String str1="Hi";       //actual
	String str2="Hello";    //expected
	
	@Test
	public void test1() {
		Assert.assertEquals(str1, str2);
	}
	
	@Test
	public void test2() {
		Assert.assertNotEquals(str1, str2);
	}
	
	@Test
	public void test3() {
		Assert.assertNull(str1);
	}
	
	@Test
	public void test4() {
		Assert.assertNotNull(str1);
	}
	
	@Test
	public void test5() {
		Assert.fail();
	}
	
	
	

}
