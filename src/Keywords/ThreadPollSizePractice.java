package Keywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThreadPollSizePractice {
	
	@Test (invocationCount = 5, threadPoolSize = 5)
	public void openBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAURAV\\OneDrive\\Desktop\\Selinium all jars\\Selenium\\ChromeDriver 108\\chromedriver_win32 (3)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	System.out.println(driver.getTitle());
	driver.close();
	}
	
}
