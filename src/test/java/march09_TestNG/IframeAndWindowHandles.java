package march09_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class IframeAndWindowHandles{
	
	
	
	WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
	@Test
	public void ifram() 
	{
		//driver.switchTo().frame("auth-login-ui");
		driver.switchTo().frame("auth-login-ui");
		WebElement phoneNo = driver.findElement(By.xpath("//input[@type='number']"));
		phoneNo.sendKeys("1111111111");
		WebElement otp = driver.findElement(By.xpath("//span[@class='sc-1kx5g6g-3 bTZuzF']"));
		otp.click();
		driver.switchTo().defaultContent();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
