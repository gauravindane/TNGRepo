package DataProviderPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookLogin {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAURAV\\OneDrive\\Desktop\\Selinium all jars\\Selenium\\ChromeDriver 108\\chromedriver_win32 (3)\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	@Test
	public void loginTest() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys();
	}
	
	
}
