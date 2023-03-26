package CBT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AllBrowsers {
	
	WebDriver driver;
	
	@Parameters("browser")
	@Test (priority = 1)
	public void launchBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAURAV\\OneDrive\\Desktop\\Selinium all jars\\Selenium\\ChromeDriver 108\\chromedriver_win32 (3)\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\GAURAV\\OneDrive\\Desktop\\Selinium all jars\\Selenium\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}else {
			System.out.println("Wrong browser selected");
		}
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	
	@Test (priority = 2)
	public void verifyCurrentURl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com");
	}
	
	@Test (priority = 3)
	public void verifyPageTitle() {
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
	}
	
	@Test (priority = 4)
	public void verifyUsernameField() {
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		Assert.assertTrue(username.isDisplayed());
		username.sendKeys("Gaurav");
	}
	
	@Test (priority = 5)
	public void verifyPasswordField() {
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		Assert.assertTrue(password.isEnabled());
		password.sendKeys("abc@123");
	}
	
	@Test (priority = 6)
	public void clickLoginButton() {
		WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
		Assert.assertTrue(loginButton.isEnabled());
		loginButton.click();
	}
	
	
	

}
