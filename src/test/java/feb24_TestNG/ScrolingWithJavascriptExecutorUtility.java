package feb24_TestNG;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ScrolingWithJavascriptExecutorUtility {
	
	//Create object of WebDriver;
	WebDriver driver;
	
	//Create Constructor
	public ScrolingWithJavascriptExecutorUtility(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void scrollDown() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHieght)");
	}
	
	
	
	
	
	
	
	
	
	

}
