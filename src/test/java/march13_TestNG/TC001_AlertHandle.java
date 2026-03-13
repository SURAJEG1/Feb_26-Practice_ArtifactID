package march13_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

public class TC001_AlertHandle {
	WebDriver driver;
	
	@BeforeClass
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito --start-Maximized");
		driver = new ChromeDriver(co);
		driver.get("");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	public void alertDismiss() 
	{
		
	}
	
	
	public void alertAccept() 
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
