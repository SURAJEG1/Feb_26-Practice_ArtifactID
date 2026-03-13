package march13_TestNG;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PageScroll_JavascriptExecutorUtility {
	//Create object of WebDriver;
	WebDriver driver;
	
	
	
	public PageScroll_JavascriptExecutorUtility(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		this.driver = driver;
	}


	public void scrollDownBotomOfPage() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	
	public void scrollDown500() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
	}
	
	
	public void scrollDown300() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
	}
	
	
	public void scrollDown200() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
	}
	
	
	
	public void scrollDown600() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
	}
	
	
	
	
	
	
	
	
	

}
