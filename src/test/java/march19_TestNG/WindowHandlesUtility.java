package march19_TestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowHandlesUtility {

	WebDriver driver;
	
	public WindowHandlesUtility(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	
	public void windowHanles() 
	{
		Set<String> wd = driver.getWindowHandles();
		Iterator<String> it = wd.iterator();
		String parents = it.next();
		String child = it.next();
		
		driver.switchTo().window(parents);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
