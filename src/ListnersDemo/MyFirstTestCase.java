package ListnersDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListnersDemo.TestNGListner.class)
public class MyFirstTestCase {
	
	@Test
	public void GoogleTitleVerify() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAURAV\\OneDrive\\Desktop\\Selinium all jars\\Selenium\\ChromeDriver 108\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		}

}
