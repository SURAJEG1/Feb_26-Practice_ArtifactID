package march07_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

public class IframeHandle {
	
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
	public void iframeHandle() 
	{
		driver.switchTo().frame("auth-login-ui");
		WebElement phoneFiled = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
		phoneFiled.sendKeys("1010101010");
		WebElement sotp = driver.findElement(By.xpath("//span[@class='sc-1kx5g6g-3 bTZuzF']"));
		sotp.click();
		driver.switchTo().defaultContent();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
