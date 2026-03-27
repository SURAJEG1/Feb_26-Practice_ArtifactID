package march27_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTestClass {
	
	//create object of ReadConfig class
	ReadConfig readconfig = new ReadConfig();
	String baseUrl = readconfig.getBaseUrl();
	String chromeBrowser = readconfig.getBrowser();
	
	
	
	public static WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		switch(chromeBrowser.toLowerCase()) 
		{
		case "chrome":
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
