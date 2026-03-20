package march19_TestNG;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ReusableMethods {
	
	WebDriver driver;
	public ReusableMethods(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	public void max() 
	{
		driver.manage().window().maximize();
	}
	
	
	public void refreshPage() 
	{
		driver.navigate().refresh();
	}
	
	public void impWait(int wait) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(wait));
		
	}
	
	
	public void closeBrowserTab() 
	{
		driver.close();
	}
	
	
	public void quitBrowser() 
	{
		driver.quit();
	}	
	
	
	
	public void scrollWindowPage() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	
	
	public void waitTime(int time) throws InterruptedException 
	{
		Thread.sleep(time);
	}
	
	
	
	
	
	

}
