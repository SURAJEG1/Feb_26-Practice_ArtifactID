package march13_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	//Create Object of ReadConfig class
	ReadConfig readconfig = new ReadConfig();
	//call and save methods in String variable (chromeBrowser & baseUrl)
	String chromeBrowser = readconfig.getBrowser();
	String baseUrl = readconfig.getBaseUrl();
	
	
	//Create static object of WebDriver;
	public static WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		//Use switch case;
		switch(chromeBrowser.toLowerCase()) 
		{
		case("chrome"):
			driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.navigate().refresh();
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
