package march17_TestNG;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavascriptExecutorUtility {
	//Create object of WebDriver interface
	WebDriver driver;
	
	
	//constructor
	public JavascriptExecutorUtility(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	public void scrollPage() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	
	public void scrollPage500() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
	}
	
	
	
	
	
	
	
	
	

}
