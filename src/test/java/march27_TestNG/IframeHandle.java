package march27_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

@Listeners(Listener.class)
public class IframeHandle {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test
	public void iframe() 
	{
		driver.switchTo().frame("auth-login-ui");
		
		WebElement enterPhoneNo = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
		enterPhoneNo.sendKeys("9090909090");
		
		WebElement clickOnOTPBtn = driver.findElement(By.xpath("//span[@class='sc-1kx5g6g-3 bTZuzF']"));
		clickOnOTPBtn.click();
		
		driver.switchTo().defaultContent();
	}
	
	
	
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
