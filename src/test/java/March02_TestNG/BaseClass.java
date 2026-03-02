package March02_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass extends ReusableMethod{
	//create object of ReadConfig class
	ReadConfig readconfig = new ReadConfig();
	String chromeBrowser = readconfig.getBrowser();
	String amazonUrl  = readconfig.getAmazonUrl();
	
	
	public static WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		
		switch(chromeBrowser.toLowerCase()) 
		{
		case "chrome":
			driver = new ChromeDriver();
			maximize();
			break;
		}
		implicitlyWait();
	}
	
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
