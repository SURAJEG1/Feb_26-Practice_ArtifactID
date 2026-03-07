package march07_TestNG;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FlipkartAlertHandle {
	
	
	WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito --start-Maximized");
		driver = new ChromeDriver(co);
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	
	@Test
	public void handleAlertDismiss() throws InterruptedException 
	{
		WebElement alertDismiss = driver.findElement(By.xpath("//span[@role='button']"));
		alertDismiss.click();
		Thread.sleep(3000);
	}
	
	
	

	@AfterClass
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
