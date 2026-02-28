package feb24_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BrowserOpenHeadless {
	
	WebDriver driver;
	@Test
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito --start-Maximized");
		co.addArguments("--headless=new");   // Enable headless mode
        //co.addArguments("--window-size=1920,1080");
        driver = new ChromeDriver(co);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
