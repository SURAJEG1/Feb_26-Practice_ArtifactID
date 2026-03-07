package march06_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class BaseTestClass {
	//Create object of ReadConfig class;
	ReadConfig readConfig = new ReadConfig();
	String chromeBrowser = readConfig.getBrowser();
	String baseUrl = readConfig.getBaseUrl();
	
	
	public static WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		switch(chromeBrowser.toLowerCase()) 
		{
		case"chrome":
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--incognito --start-Maximized");
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
