package march17_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class ReusableMethods {
	WebDriver driver;
	
	public ReusableMethods(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	public void maximized() 
	{
		driver.manage().window().maximize();
	}
	
	public void refresh() 
	{
		driver.navigate().refresh();
	}
	
	
	public void implWait() 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	public void close() 
	{
		driver.close();
	}
	
	
	public void quit() 
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
