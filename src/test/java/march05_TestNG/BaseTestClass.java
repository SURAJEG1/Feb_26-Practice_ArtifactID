package march05_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class BaseTestClass extends ReusableMethods{

	//Create object of ReadConfig Class
	ReadConfig readconfig = new ReadConfig();
	String chromeBrowser = readconfig.getBrowser();
	String amazonUrl = readconfig.getAmazonUrl();
	String flipkartUrl = readconfig.getFlipkart();
	
	
	public static WebDriver driver;
	public void setup() 
	{
		switch(chromeBrowser.toLowerCase()) 
		{
		case "chrome":
			incognitoMode();
			driver = new ChromeDriver();
			maximizeWindow();
		}
		implicitilyWait(10);
		
	}
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
