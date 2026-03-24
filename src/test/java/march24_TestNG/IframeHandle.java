package march24_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class IframeHandle {

	WebDriver driver;
	
	@BeforeClass
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		driver = new ChromeDriver(co);
		driver.get("https://www.zomato.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test
	public void iframHandle() throws InterruptedException 
	{
		driver.switchTo().frame("auth-login-ui");
		WebElement enterPhoneNo = driver.findElement(By.cssSelector("input[placeholder='Phone']"));
		enterPhoneNo.sendKeys("1231231231");
		
		WebElement clickOnOTP = driver.findElement(By.cssSelector("span[class='sc-1kx5g6g-2 ilXTK']"));
		clickOnOTP.click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(1000);
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(3000);
	}
	
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
