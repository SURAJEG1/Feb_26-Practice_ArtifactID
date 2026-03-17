package march16_TestNG;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ReusableComponents {
	
	WebDriver driver;
	
	//Constructor
	public ReusableComponents(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	
	public void maxmize() 
	{
		driver.manage().window().maximize();
	}
	
	
	public void impWait(int wait) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(wait));
	}
	
	
	public void scrollWindowTillBotom() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("window.scrollBy(0,docutment.body.scrollHeight)");
		
	}
	
	
	public void validation() 
	{
		Assert.assertEquals("actual", "expected");
	}
	
	
	
	
	
	
	

}
