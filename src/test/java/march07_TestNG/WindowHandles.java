package march07_TestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowHandles {
	
	WebDriver driver;
	public WindowHandles(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	public void windowHandles() 
	{
		Set<String> wd = driver.getWindowHandles();
		Iterator<String> it = wd.iterator();
		String mainPage = it.next();
		String childPage = it.next();
		
		driver.switchTo().window(mainPage);
		System.out.println(driver.getPageSource());
		driver.switchTo().window(childPage);
		System.out.println(driver.getTitle());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
