package march03_TestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowScrollDownUtilty {
	
	WebDriver driver;
	
	public void windowHandles() 
	{
		Set<String> wd = driver.getWindowHandles();
		Iterator<String> it = wd.iterator();
		String parent = it.next();
		String child = it.next();
		
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
	}
	
	
	
	
	public void windowHandle() 
	{
		String mainPage = driver.getWindowHandle();
		System.out.println("mainpage =" + mainPage );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
