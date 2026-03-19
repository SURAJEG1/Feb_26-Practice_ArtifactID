package march19_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTestClass {
	
	//create object of ReadConfig class
	ReadConfig readconfig = new ReadConfig();
	String browser = readconfig.getBrowser();
	String baseUrl =  readconfig.getBaseUrl();
	
	
	public static WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		switch(browser.toLowerCase()) 
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
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
