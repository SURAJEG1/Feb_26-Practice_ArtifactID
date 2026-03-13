package march13_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class TC005_IframeHandlesAndWindowHandles {
	WebDriver driver;
	
	@BeforeClass
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito --start-Maximized");
		driver = new ChromeDriver(co);
		driver.get("https://www.zomato.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	
	
	@Test
	public void iframe() throws InterruptedException 
	{
		driver.switchTo().frame("auth-login-ui");
		
		WebElement phone = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
		phone.sendKeys("999999999");
		
		WebElement sentOTP = driver.findElement(By.xpath("//span[@class='sc-1kx5g6g-3 bTZuzF']"));
		sentOTP.click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
	}
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
