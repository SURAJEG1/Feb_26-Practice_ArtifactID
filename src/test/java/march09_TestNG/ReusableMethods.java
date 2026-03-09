package march09_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class ReusableMethods {
	
	WebDriver driver;
	
	public ReusableMethods(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	
	public void maximize() 
	{
		driver.manage().window().maximize();
	}
	
	
	public void impWait() 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
