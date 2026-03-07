package march07_TestNG;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PageScrolling {
	
	WebDriver driver;
	public PageScrolling(WebDriver driver) 
	{
		this.driver =driver;
	}
	
	
	
	public void pageScrollDown_500() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
	}
	
	public void pageScrollDown_Botom() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	
	
	
	
	
	
	
	

}
